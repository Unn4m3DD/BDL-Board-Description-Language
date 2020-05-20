package Compiler;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import SymbolTable.*;
import org.stringtemplate.v4.STGroupFile;
import antlr4Gen.*;
import org.stringtemplate.v4.misc.STCompiletimeMessage;

public class AbdlCompiler extends AbdlBaseVisitor<Object> {
    int varCounter = 0;
    int funcCounter = 0;
    STGroup templates = new STGroupFile("Compiler/templates.stg");
    SymbolTable symbolTable = new SymbolTable();
    ST program = templates.getInstanceOf("program");
    Stack<ST> scopesST = new Stack<>();
    String StControl = "stat";
    Map<String, String> operations = new HashMap<>() {{
        put("+", "add");
        put("-", "sub");
        put("*", "mul");
        put("/", "div");
        put("%", "rem");
        put("^", "pow");
        put("<", "less_than");
        put(">", "greater_than");
        put("<=", "less_or_equal");
        put(">=", "greater_or_equal");
        put("==", "equal");
        put("/=", "not_equal");
    }};

    @Override
    public Object visitProgram(AbdlParser.ProgramContext ctx) {
        symbolTable.pushScope();
        scopesST.push(program);
        for (var function : ctx.functDef()) {
            visit(function);
        }
        visit(ctx.main());
        return program;
    }

    @Override
    public Object visitMain(AbdlParser.MainContext ctx) {
        for (var stat : ctx.statements()) program.add("stat", (String) visit(stat));
        return null;
    }

    @Override
    public Object visitFunctDef(AbdlParser.FunctDefContext ctx) {
        String sourceFuncName = ctx.func_name.getText();
        List<String> args = new ArrayList<>();
        String resType = ctx.Type() != null ? ctx.Type().getText() : null;
        if (resType == null) resType = "void";
        args.addAll((List<String>) visit(ctx.typedArgs()));
        String targetFuncName = createFunc();
        Function funct = new Function(targetFuncName, args, resType);
        symbolTable.pushSymbol(sourceFuncName, funct);
        ST func = templates.getInstanceOf("function");
        scopesST.push(func);
        func.add("funcName", targetFuncName);
        symbolTable.pushScope();
        for (String arg : args) {
            String varName = createVar();
            symbolTable.pushSymbol(arg, new Variable(varName, ""));
            func.add("arg", varName);
        }
        for (var stat : ctx.statements()) func.add("stat", (String) visit(stat));
        program.add("functs", func.render());
        symbolTable.popScope();
        scopesST.pop();
        return func.render();
    }

    @Override
    public Object visitFunctionCallStatement(AbdlParser.FunctionCallStatementContext ctx) {
        return visit(ctx.functionCall());
    }

    @Override
    public Object visitStatements(AbdlParser.StatementsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlock(AbdlParser.BlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitForStatement(AbdlParser.ForStatementContext ctx) {
        String id = ctx.var.getText();
        String low = (String) visit(ctx.bottom);
        String high = (String) visit(ctx.up);
        String result = createVar();
        ST forStat = templates.getInstanceOf("forStat");
        scopesST.push(forStat);
        symbolTable.pushScope();
        symbolTable.pushSymbol(id, new Variable(result, ""));
        forStat.add("var", result);
        forStat.add("low", low);
        forStat.add("high", high);
        for (var stat : ctx.statements()) forStat.add("stat", (String) visit(stat));
        scopesST.pop();
        symbolTable.popScope();
        return forStat.render();
    }

    @Override
    public Object visitWhileStatement(AbdlParser.WhileStatementContext ctx) {
        scopesST.push(templates.getInstanceOf("statements"));
        String resVar = (String) visit(ctx.expr());
        ST.AttributeList test = (ST.AttributeList) scopesST.pop().getAttribute("stat");
        String condRepeat = "";
        for (int i = 0; i < test.size(); i++) {
            scopesST.peek().add("stat", test.get(i));
            condRepeat += test.get(i).toString().substring(4) + "\n";
        }
        ST whileStat = templates.getInstanceOf("whileStat");
        whileStat.add("var", resVar);
        scopesST.push(whileStat);
        symbolTable.pushScope();
        for (var stat : ctx.statements()) {
            whileStat.add("stat", (String) visit(stat));
        }
        whileStat.add("stat", condRepeat);
        scopesST.pop();
        symbolTable.popScope();
        return whileStat.render();
    }

    @Override
    public Object visitIfStatement(AbdlParser.IfStatementContext ctx) {
        ST ifStat = templates.getInstanceOf("conditional");
        String s = (String) visit(ctx.expr());
        ifStat.add("var", (String) s);
        scopesST.push(ifStat);
        StControl = "stat_true";
        symbolTable.pushScope();
        for (var stat : ctx.statements()) {
            ifStat.add("stat_true", (String) visit(stat));
        }
        if (ctx.elseIf().size() != 0) {
            ST nextElseIf = (ST) visit(ctx.elseIf(ctx.elseIf().size() - 1));
            ST elseifStat;
            if (ctx.elseStatement() != null) {
                scopesST.push(nextElseIf);
                StControl = "stat_false";
                for (var stat : ctx.elseStatement().statements()) {
                    nextElseIf.add("stat_false", (String) visit(stat));
                }
                scopesST.pop();
            }
            for (int i = ctx.elseIf().size() - 2; i >= 0; i--) {
                elseifStat = (ST) visit(ctx.elseIf(i));
                elseifStat.add("stat_false", nextElseIf.render());
                nextElseIf = elseifStat;
            }

            ifStat.add("stat_false", nextElseIf.render());
        } else {
            if (ctx.elseStatement() != null) {
                StControl = "stat_false";
                for (var stat : ctx.elseStatement().statements()) {
                    ifStat.add("stat_false", (String) visit(stat));
                }
            }
        }
        scopesST.pop();
        StControl = "stat";
        symbolTable.popScope();
        return ifStat.render();
    }

    @Override
    public Object visitElseIf(AbdlParser.ElseIfContext ctx) {
        ST elseifStat = templates.getInstanceOf("conditional");
        StControl = "stat";
        ST ifStat = scopesST.pop();
        elseifStat.add("var", (String) visit(ctx.expr()));
        scopesST.push(ifStat);
        scopesST.push(elseifStat);
        StControl = "stat_true";
        for (var stat : ctx.statements()) {
            elseifStat.add("stat_true", (String) visit(stat));
        }
        scopesST.pop();
        return elseifStat;
    }

    @Override
    public Object visitElseStatement(AbdlParser.ElseStatementContext ctx) {
        return visitChildren(ctx);
    }

    public Object visitBoard(AbdlParser.BoardContext ctx) {
        String point = (String) visit(ctx.point());
        switch (ctx.prop.getText()) {
            case "piece_name":
                return "(getName(" + point + "))";
            case "owner":
                return "(getOwner(" + point + "))";
        }
        return null;
    }

    @Override
    public Object visitVarDeclaration(AbdlParser.VarDeclarationContext ctx) {
        if (ctx.expr() == null) {
            if (ctx.Type() == null) {
                System.err.println("Type not defined");
            } else {
                ST varDecl = templates.getInstanceOf("decl");
                Variable newVar = new Variable(createVar(), "");
                symbolTable.pushSymbol(ctx.ID().getText(), newVar);
                varDecl.add("var", newVar.getName());
                String value = "";
                switch (ctx.Type().getText()) {
                    case "int":
                        value = "0";
                        break;
                    case "string":
                        value = "\"\"";
                        break;
                    case "point":
                        value = "{}";
                        break;
                }
                varDecl.add("val", "new ABDLVar(" + value + ")");
                return varDecl.render();
            }
        } else {
            String expr = (String) visit(ctx.expr());
            ST varDecl = templates.getInstanceOf("decl");
            Variable newVar = new Variable(createVar(), "");
            varDecl.add("var", newVar.getName());
            varDecl.add("val", expr);
            symbolTable.pushSymbol(ctx.ID().getText(), newVar);
            return varDecl.render();

        }
        return null;
    }

    @Override
    public Object visitVarAttrib(AbdlParser.VarAttribContext ctx) {
        String var = symbolTable.resolveName(ctx.var.getText());
        String expr = (String) visit(ctx.expr());
        return var + " = " + expr + ";";
    }


    @Override
    public Object visitCanMoveCall(AbdlParser.CanMoveCallContext ctx) {
        ST res = templates.getInstanceOf("canMove");
        List<String> args = (List<String>) visit(ctx.args());
        res.add("e1", args.get(0));
        res.add("e2", args.get(1));
        return res.render();
    }

    @Override
    public Object visitMoveCall(AbdlParser.MoveCallContext ctx) {
        ST move = templates.getInstanceOf("move");
        List<String> args = (List<String>) visit(ctx.args());
        move.add("e1", args.get(0));
        move.add("e2", args.get(1));
        return move.render();
    }

    @Override
    public Object visitPrintCall(AbdlParser.PrintCallContext ctx) {
        ST print = templates.getInstanceOf("statements");
        for (var expr : (List<String>) visit(ctx.args())) {
            print.add("stat", "console.log(" + expr + ".toString());");
        }
        return print.render();
    }

    @Override
    public Object visitFuncCall(AbdlParser.FuncCallContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String resVar = createVar();
        List<String> args = (List<String>) visit(ctx.args());
        varDecl.add("var", resVar);
        varDecl.add("val", "new ABDLVar( await " + symbolTable.resolveName(ctx.funcName.getText())
                + "(" + args.toString().substring(1, args.toString().length() - 1) + "))");

        addVar(varDecl.render());

        return symbolTable.resolveName(ctx.getText());
    }

    @Override
    public Object visitReturnStat(AbdlParser.ReturnStatContext ctx) {
        return "return " + (String) visit(ctx.expr()) + ";";
    }

    @Override
    public Object visitExprFunctionCall(AbdlParser.ExprFunctionCallContext ctx) {
        List<String> args = (List<String>) visit(ctx.args());
        return "(await " + symbolTable.resolveName(ctx.funcName.getText()) + "(" +
                args.toString().substring(1, args.toString().length() - 1) + "))";
    }

    @Override
    public Object visitParent(AbdlParser.ParentContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitExprCurrPlayer(AbdlParser.ExprCurrPlayerContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String result = createVar();
        varDecl.add("var", result);
        varDecl.add("val", "new ABDLVar(context.current_player)");
        addVar(varDecl.render());
        return result;
    }

    @Override
    public Object visitExprHeight(AbdlParser.ExprHeightContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String result = createVar();
        varDecl.add("var", result);
        varDecl.add("val", "new ABDLVar(context.height)");
        addVar(varDecl.render());
        return result;
    }

    @Override
    public Object visitExprWidth(AbdlParser.ExprWidthContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String result = createVar();
        varDecl.add("var", result);
        varDecl.add("val", "new ABDLVar(context.width)");
        addVar(varDecl.render());
        return result;
    }

    @Override
    public Object visitExprString(AbdlParser.ExprStringContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String resVar = createVar();
        varDecl.add("var", resVar);
        varDecl.add("val", "new ABDLVar(" + ctx.String().getText() + ")");
        addVar(varDecl.render());
        return resVar;
    }

    @Override
    public Object visitExprInt(AbdlParser.ExprIntContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String resVar = createVar();
        varDecl.add("var", resVar);
        varDecl.add("val", "new ABDLVar(" + ctx.Int().getText() + ")");
        addVar(varDecl.render());
        return resVar;
    }

    @Override
    public Object visitExprOp(AbdlParser.ExprOpContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String resVar = createVar();
        String expr0 = (String) visit(ctx.expr(0));
        String expr1 = (String) visit(ctx.expr(1));
        varDecl.add("var", resVar);
        varDecl.add("val", expr0 + "." + operations.get(ctx.op.getText()) + "(" + expr1 + ")");
        addVar(varDecl.render());
        return resVar;
    }

    @Override
    public Object visitExprNull(AbdlParser.ExprNullContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String result = createVar();
        varDecl.add("var", result);
        varDecl.add("val", "new ABDLVar()");
        addVar(varDecl.render());
        return result;
    }

    @Override
    public Object visitExprID(AbdlParser.ExprIDContext ctx) {
        return symbolTable.resolve(ctx.ID().getText()).getName();
    }

    @Override
    public Object visitArgs(AbdlParser.ArgsContext ctx) {
        List<String> args = new ArrayList<>();
        for (var arg : ctx.expr()) {
            args.add((String) visit(arg));
        }
        return args;
    }

    @Override
    public Object visitTypedArgs(AbdlParser.TypedArgsContext ctx) {
        List<String> args = new ArrayList<>();
        for (var arg : ctx.ID()) {
            args.add(arg.getText());
        }
        return args;
    }

    @Override
    public Object visitPoint(AbdlParser.PointContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String resVar = createVar();
        String expr0 = (String) visit(ctx.expr(0));
        String expr1 = (String) visit(ctx.expr(1));
        varDecl.add("var", resVar);
        varDecl.add("val", "new ABDLVar([" + expr0 + ", " + expr1 + "])");
        addVar(varDecl.render());
        return resVar;
    }

    private void addVar(String declaration) {
        scopesST.peek().add(StControl, declaration);
    }

    public String createVar() {
        return "v" + varCounter++;
    }

    public String createFunc() { return "f" + funcCounter++; }
}