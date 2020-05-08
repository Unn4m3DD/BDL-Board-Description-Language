import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import SymbolTable.*;
import org.stringtemplate.v4.STGroupFile;


public class AbdlCompiler extends AbdlBaseVisitor<Object> {
    static int varCounter = 0;
    ParseTreeProperty<String> ruleVars = new ParseTreeProperty<>();
    STGroup templates = new STGroupFile("templates.stg");
    SymbolTable symbolTable = new SymbolTable();
    ST program = templates.getInstanceOf("program");
    Map<String, String> operations = new HashMap<>(){{
        put("+", "add");
        put("-", "sub");
        put("*", "mul");
        put("/", "div");
        put("%", "rem");
        put("<", "less_than");
        put(">", "greater_then");
        put("<=", "less_or_equal");
        put(">=", "greater_or_equal");
        put("==", "equal");
        put("/=", "not_equal");
    }};
    @Override public Object visitProgram(AbdlParser.ProgramContext ctx) {
        visit(ctx.main());
        for(var function : ctx.functDef()) {
            //(visit(function));
        }
        return program;
    }
    @Override public Object visitMain(AbdlParser.MainContext ctx) {
        symbolTable.pushScope();
        for(var stat: ctx.statements()) program.add("stat", (String) visit(stat));
        return null;
    }
    @Override public Object visitFunctDef(AbdlParser.FunctDefContext ctx) { return visitChildren(ctx); }
    @Override public Object visitStatements(AbdlParser.StatementsContext ctx) { return visitChildren(ctx); }
    @Override public Object visitBlock(AbdlParser.BlockContext ctx) { return visitChildren(ctx); }
    @Override public Object visitForStatement(AbdlParser.ForStatementContext ctx) { return visitChildren(ctx); }
    @Override public Object visitWhileStatement(AbdlParser.WhileStatementContext ctx) { return visitChildren(ctx); }
    @Override public Object visitIfStatement(AbdlParser.IfStatementContext ctx) {
        ST ifStat = templates.getInstanceOf("conditional");
        ifStat.add("var", (String) visit(ctx.expr()));
        for(var stat : ctx.statements()) {
            ifStat.add("stat_true", (String) visit(stat));
        }
        if(ctx.elseIf().size() != 0) {
            ST nextElseIf = (ST) visit(ctx.elseIf(ctx.elseIf().size() - 1));
            ST elseifStat;
            if(ctx.elseStatement() != null) {
                for(var stat: ctx.elseStatement().statements()) {
                    nextElseIf.add("stat_false", (String) visit(stat));
                }
            }
            for(int i = ctx.elseIf().size() - 2; i >= 0; i--) {
                elseifStat = (ST) visit(ctx.elseIf(i));
                elseifStat.add("stat_false", nextElseIf.render());
                nextElseIf = elseifStat;
            }
            ifStat.add("stat_false", nextElseIf.render());
        }
        else{
            if(ctx.elseStatement() != null) {
                for(var stat: ctx.elseStatement().statements()) {
                    ifStat.add("stat_false", (String) visit(stat));
                }
            }
        }
        //program.add("stat", ifStat.render());
        return ifStat.render();
    }
    @Override public Object visitElseIf(AbdlParser.ElseIfContext ctx) {
        ST elseifStat = templates.getInstanceOf("conditional");
        elseifStat.add("var", (String) visit(ctx.expr()));
        for(var stat : ctx.statements()) {
            elseifStat.add("stat_true", (String) visit(stat));
        }
        return elseifStat;
    }
    @Override public Object visitElseStatement(AbdlParser.ElseStatementContext ctx) { return visitChildren(ctx); }
    @Override public Object visitVarDeclaration(AbdlParser.VarDeclarationContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        Variable newVar = new Variable(createVar(), ""); //TODO
        if(ctx.expr() == null) {
            if(ctx.Type() == null) {
                System.err.println("Type not defined");
            }
            else{
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
        }
        else{
            symbolTable.pushSymbol(ctx.ID().getText(), newVar);
            Object expr = visit(ctx.expr());
            varDecl.add("var", newVar.getName());
            String value = "";
            if(expr == null) {
                if(ctx.Type() != null) {
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
                }
                else{
                    System.err.println("No type or expression...");
                }
            }
            else value = (String) expr;
            varDecl.add("val", value);

        }
        return varDecl.render();
    }
    @Override public Object visitVarAttrib(AbdlParser.VarAttribContext ctx) {
        String var = symbolTable.resolveName(ctx.var.getText());
        String expr = (String) visit(ctx.expr());
        return var + " = " + expr + ";";
    }
    @Override public Object visitFunctionCall(AbdlParser.FunctionCallContext ctx) { return visitChildren(ctx); }
    @Override public Object visitReturnStat(AbdlParser.ReturnStatContext ctx) { return visitChildren(ctx); }
    @Override public Object visitEpxrFunctionCall(AbdlParser.EpxrFunctionCallContext ctx) { return visitChildren(ctx); }
    @Override public Object visitParent(AbdlParser.ParentContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprCurrPlayer(AbdlParser.ExprCurrPlayerContext ctx) { return "context.current_player"; }
    @Override public Object visitExprHeight(AbdlParser.ExprHeightContext ctx) { return "context.height"; }
    @Override public Object visitExprWidth(AbdlParser.ExprWidthContext ctx) { return "context.width"; }
    @Override public Object visitExprString(AbdlParser.ExprStringContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String resVar = createVar();
        varDecl.add("var", resVar);
        varDecl.add("val", "new ABDLVar(" + ctx.String().getText() + ")");
        program.add("stat", varDecl.render());
        return resVar;
    }
    @Override public Object visitExprPoint(AbdlParser.ExprPointContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String resVar = createVar();
        String expr0 = (String) visit(ctx.point().expr(0));
        String expr1 = (String) visit(ctx.point().expr(1));
        varDecl.add("var", resVar);
        varDecl.add("val", "new ABDLVar({" + expr0 + ", " + expr1 + "})");
        program.add("stat", varDecl.render());
        return resVar;
    }
    @Override public Object visitExprInt(AbdlParser.ExprIntContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String resVar = createVar();
        varDecl.add("var", resVar);
        varDecl.add("val", "new ABDLVar(" + ctx.Int().getText() + ")");
        program.add("stat", varDecl.render());
        return resVar;
    }
    @Override public Object visitExprOp(AbdlParser.ExprOpContext ctx) {
        ST varDecl = templates.getInstanceOf("decl");
        String resVar = createVar();
        String expr0 = (String) visit(ctx.expr(0));
        String expr1 = (String) visit(ctx.expr(1));
        varDecl.add("var", resVar);
        varDecl.add("val", expr0 + "." + operations.get(ctx.op.getText()) + "(" + expr1 + ")");
        program.add("stat", varDecl.render());
        return resVar;
    }
    @Override public Object visitExprNull(AbdlParser.ExprNullContext ctx) { return null; }
    @Override public Object visitExprID(AbdlParser.ExprIDContext ctx) {
        return symbolTable.resolve(ctx.ID().getText()).getName();
    }
    @Override public Object visitArgs(AbdlParser.ArgsContext ctx) {
        List<String> args = new ArrayList<>();
        for(var arg: ctx.expr()) {
            args.add((String) visit(arg));
        }
        return args;
    }
    @Override public Object visitTypedArgs(AbdlParser.TypedArgsContext ctx) {
        List<String> args = new ArrayList<>();
        for(var arg: ctx.ID()) {
            args.add((String) visit(arg));
        }
        return args;
    }
    @Override public Object visitPoint(AbdlParser.PointContext ctx) {return visitChildren(ctx);}

    public String createVar() {
        return "v" + varCounter++;
    }

}