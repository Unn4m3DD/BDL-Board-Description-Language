package Compiler;

import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import SymbolTable.*;
import org.stringtemplate.v4.STGroupFile;
import antlr4Gen.*;

public class AbdlCompiler extends AbdlBaseVisitor<Object> {
    static int varCounter = 0;
    private int functionCount = 0;
    ParseTreeProperty<String> ruleVars = new ParseTreeProperty<>();
    STGroup templates = new STGroupFile("Compiler/templates.stg");
    SymbolTable symbolTable = new SymbolTable();
    ST program = templates.getInstanceOf("program");
    ST currFunct;
    Map<String, String> operations = new HashMap<>() {{
        put("+", "add");
        put("-", "sub");
        put("*", "mul");
        put("/", "div");
        put("%", "rem");
        put("^", "pow");
        put("<", "less_than");
        put(">", "greater_then");
        put("<=", "less_or_equal");
        put(">=", "greater_or_equal");
        put("==", "equal");
        put("/=", "not_equal");
    }};

    @Override
    public Object visitProgram(AbdlParser.ProgramContext ctx) {
        symbolTable.pushScope();
        visit(ctx.main());
        for (var function : ctx.functDef()) {
            functionCount++;
            visit(function);
        }
        return program;
    }

    @Override
    public Object visitMain(AbdlParser.MainContext ctx) {
        for (var stat : ctx.statements()) program.add("stat", (String) visit(stat));
        return null;
    }

    @Override
    public Object visitFunctDef(AbdlParser.FunctDefContext ctx) {
        symbolTable.pushScope();
        String funcName = ctx.func_name.getText();
        List<String> args = new ArrayList<>();
        String resType = ctx.Type() != null ? ctx.Type().getText() : null;
        if (resType == null) resType = "void";
        args.addAll((List<String>) visit(ctx.typedArgs()));
        Function funct = new Function(funcName, args, resType);
        symbolTable.pushSymbol(funcName, funct);
        ST func = templates.getInstanceOf("function");
        currFunct = func;
        func.add("funcName", funcName);
        for (String arg : args) {
            String varName = createVar();
            symbolTable.pushSymbol(arg, new Variable(varName, ""));
            func.add("arg", varName);
        }
        for (var stat : ctx.statements()) func.add("stat", (String) visit(stat));
        program.add("functs", func.render());
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
        return visitChildren(ctx);
    }

    @Override
    public Object visitWhileStatement(AbdlParser.WhileStatementContext ctx) {
        ST whileStat = templates.getInstanceOf("whileStat");
        whileStat.add("var", (String) visit(ctx.expr()));
        for (var stat : ctx.statements()) {
            whileStat.add("stat", (String) visit(stat));
        }
        return whileStat.render();
    }

    @Override
    public Object visitIfStatement(AbdlParser.IfStatementContext ctx) {
        ST ifStat = templates.getInstanceOf("conditional");
        String s = (String) visit(ctx.expr());
        ifStat.add("var", (String) s);
        for (var stat : ctx.statements()) {
            ifStat.add("stat_true", (String) visit(stat));
        }
        if (ctx.elseIf().size() != 0) {
            ST nextElseIf = (ST) visit(ctx.elseIf(ctx.elseIf().size() - 1));
            ST elseifStat;
            if (ctx.elseStatement() != null) {
                for (var stat : ctx.elseStatement().statements()) {
                    nextElseIf.add("stat_false", (String) visit(stat));
                }
            }
            for (int i = ctx.elseIf().size() - 2; i >= 0; i--) {
                elseifStat = (ST) visit(ctx.elseIf(i));
                elseifStat.add("stat_false", nextElseIf.render());
                nextElseIf = elseifStat;
            }
            ifStat.add("stat_false", nextElseIf.render());
        } else {
            if (ctx.elseStatement() != null) {
                for (var stat : ctx.elseStatement().statements()) {
                    ifStat.add("stat_false", (String) visit(stat));
                }
            }
        }

        return ifStat.render();
    }

    @Override
    public Object visitElseIf(AbdlParser.ElseIfContext ctx) {
        ST elseifStat = templates.getInstanceOf("conditional");
        elseifStat.add("var", (String) visit(ctx.expr()));
        for (var stat : ctx.statements()) {
            elseifStat.add("stat_true", (String) visit(stat));
        }
        return elseifStat;
    }

    @Override
    public Object visitElseStatement(AbdlParser.ElseStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitVarDeclaration(AbdlParser.VarDeclarationContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        Variable newVar = new Variable(createVar(), ""); 
        if (ctx.expr() == null) {
            if (ctx.Type() == null) {
                System.err.println("Type not defined");
            } else {
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
            }
        } else {
            symbolTable.pushSymbol(ctx.ID().getText(), newVar);
            Object expr = visit(ctx.expr());
            varDecl.add("var", newVar.getName());
            String value = "";
            if (expr == null) {
                if (ctx.Type() != null) {
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
                    value = "new ABDLVar(" + value + ")";
                } else {
                    System.err.println("No type or expression...");
                }
            } else value = (String) expr;
            varDecl.add("val", value);

        }
        return varDecl.render();
    }

    @Override
    public Object visitVarAttrib(AbdlParser.VarAttribContext ctx) {
        String var = symbolTable.resolveName(ctx.var.getText());
        String expr = (String) visit(ctx.expr());
        return var + " = " + expr + ";";
    }

    
    @Override
    public Object visitCanMoveCall(AbdlParser.CanMoveCallContext ctx) {
        ST res = new ST("can_move(<e1>, <e2>);");
        List<String> args = (List<String>) visit(ctx.args());
        res.add("e1", args.get(0));
        res.add("e2", args.get(1));
        return res.render();
    }

    @Override
    public Object visitMoveCall(AbdlParser.MoveCallContext ctx) {
        ST tryCatch = templates.getInstanceOf("tryCatch");
        ST move = templates.getInstanceOf("move");
        List<String> args = (List<String>) visit(ctx.args());
        move.add("e1", args.get(0));
        move.add("e2", args.get(1));
        tryCatch.add("stat", move.render());
        return tryCatch.render();
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
        varDecl.add("val", "new ABDLVar(" + ctx.funcName.getText() + "(" + args.toString() + ")");

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
        return "new ABDLVar(" + ctx.funcName.getText() + "(" +
                args.toString().substring(1, args.toString().length() - 1) +
                "))";
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
        if (functionCount == 0) {
            ST varDecl = templates.getInstanceOf("decl");
            String resVar = createVar();
            varDecl.add("var", resVar);
            varDecl.add("val", "new ABDLVar(" + ctx.Int().getText() + ")");
            program.add("stat", varDecl.render());
            return resVar;
        }
        return "new ABDLVar(" + ctx.Int().getText() + ")";

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
        System.out.println(ctx.ID().getText());
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
        if (functionCount == 0)
            program.add("stat", declaration);
        else
            currFunct.add("stat", declaration);
    }

    public String createVar() {
        return "v" + varCounter++;
    }

}