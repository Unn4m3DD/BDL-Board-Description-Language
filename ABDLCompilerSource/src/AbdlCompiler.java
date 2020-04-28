<<<<<<< HEAD:ABDLCompilerSource/src/ABDLVisitor.java
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;
import java.util.HashMap;
import java.util.Map;


public class ABDLVisitor extends AbdlBaseVisitor<Object> {
    ParseTreeProperty<String> ruleVars = new ParseTreeProperty<>();
    int varCount = 0;
    STGroup templates = new STGroupDir(".");
    Map<String, String> vars = new HashMap<>();
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
        ST program = templates.getInstanceOf("program");
        program.add("statements", visit(ctx.main()));
        for(var function : ctx.functDef()) {
            program.add("statements", visit(function));
        }
        return program.render();
    }
    @Override public Object visitMain(AbdlParser.MainContext ctx) { return visitChildren(ctx); }
    @Override public Object visitFunctDef(AbdlParser.FunctDefContext ctx) {
        StringBuilder res = new StringBuilder();
        res.append("function " + ctx.func_name.getText() + visit(ctx.typedArgs()) + "{\n");
        for(var statement: ctx.statements()) {
            res.append("  " + visit(statement));
        }
        res.append("\n}");
        return res.toString();
    }
    @Override public Object visitStatements(AbdlParser.StatementsContext ctx) { return visitChildren(ctx); }
    @Override public Object visitBlock(AbdlParser.BlockContext ctx) { return visitChildren(ctx); }
    @Override public Object visitForStatement(AbdlParser.ForStatementContext ctx) { return visitChildren(ctx); }
    @Override public Object visitWhileStatement(AbdlParser.WhileStatementContext ctx) { return visitChildren(ctx); }
    @Override public Object visitIfStatement(AbdlParser.IfStatementContext ctx) { return visitChildren(ctx); }
    @Override public Object visitVarDeclaration(AbdlParser.VarDeclarationContext ctx) {
        StringBuilder res = new StringBuilder();
        vars.put(ctx.ID().getText(), "v" + varCount);
        res.append("let v" + varCount++ + " = " + visit(ctx.expr()));
        return res.toString();
    }
    @Override public Object visitVarAttrib(AbdlParser.VarAttribContext ctx) { return visitChildren(ctx); }
    @Override public Object visitFunctionCall(AbdlParser.FunctionCallContext ctx) { return visitChildren(ctx); }
    @Override public Object visitReturnStat(AbdlParser.ReturnStatContext ctx) { return visitChildren(ctx); }
    @Override public Object visitEpxrFunctionCall(AbdlParser.EpxrFunctionCallContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprCondition(AbdlParser.ExprConditionContext ctx) { return visitChildren(ctx); }
    @Override public Object visitParent(AbdlParser.ParentContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprCurrPlayer(AbdlParser.ExprCurrPlayerContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprHeight(AbdlParser.ExprHeightContext ctx) { return "context.height"; }
    @Override public Object visitExprWidth(AbdlParser.ExprWidthContext ctx) { return "context.width"; }
    @Override public Object visitExprString(AbdlParser.ExprStringContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprPoint(AbdlParser.ExprPointContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprInt(AbdlParser.ExprIntContext ctx) {
        ruleVars.put(ctx, "v" + varCount);
        return "let v" + varCount++ + " = " + ctx.Int().getText() + ";";
    }
    @Override public Object visitExprOp(AbdlParser.ExprOpContext ctx) {
        String expr0 = (String) visit(ctx.expr(0));
        String expr1 = (String) visit(ctx.expr(1));
        return "let v" + varCount++ + " = " + ruleVars.get(ctx.expr(0)) + "." + operations.get(ctx.op.getText()) + "(" + ruleVars.get(ctx.expr(1)) + ");";
    }
    @Override public Object visitExprNull(AbdlParser.ExprNullContext ctx) { return null; }
    @Override public Object visitExprID(AbdlParser.ExprIDContext ctx) {
        return vars.get(ctx.getText());
    }
    @Override public Object visitArgs(AbdlParser.ArgsContext ctx) {
        StringBuilder res = new StringBuilder(ruleVars.get(ctx.expr(0)));
        for(var arg: ctx.expr()) {
            res.append(", ").append(ruleVars.get(arg));
        }
        return res.toString();
    }
    @Override public Object visitTypedArgs(AbdlParser.TypedArgsContext ctx) {
        StringBuilder res = new StringBuilder(ctx.ID(0).getText());
        for(var arg: ctx.ID()) {
            res.append(", ").append(arg.getText());
        }
        return res.toString();
    }
    @Override public Object visitPoint(AbdlParser.PointContext ctx) {
        ruleVars.put(ctx, "v" + varCount);
        return "let v" + varCount++ + " = [" + ruleVars.get(ctx.expr(0)) + ", " + ruleVars.get(ctx.expr(1)) + "]";
    }
=======
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;
import java.util.HashMap;
import java.util.Map;


public class AbdlCompiler extends AbdlBaseVisitor<Object> {
    ParseTreeProperty<String> ruleVars = new ParseTreeProperty<>();
    int varCount = 0;
    STGroup templates = new STGroupDir(".");
    Map<String, String> vars = new HashMap<>();
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
        StringBuilder res = new StringBuilder();
        ST header = templates.getInstanceOf("header");
        res.append(header.render());
        res.append((String) visit(ctx.main()) + "}");
        for(var function : ctx.functDef()) {
            res.append(visit(function));
        }
        return res.toString();
    }
    @Override public Object visitMain(AbdlParser.MainContext ctx) { return visitChildren(ctx); }
    @Override public Object visitFunctDef(AbdlParser.FunctDefContext ctx) {
        StringBuilder res = new StringBuilder();
        res.append("function " + ctx.func_name.getText() + visit(ctx.typedArgs()) + "{\n");
        for(var statement: ctx.statements()) {
            res.append("  " + visit(statement));
        }
        res.append("\n}");
        return res.toString();
    }
    @Override public Object visitStatements(AbdlParser.StatementsContext ctx) { return visitChildren(ctx); }
    @Override public Object visitBlock(AbdlParser.BlockContext ctx) { return visitChildren(ctx); }
    @Override public Object visitForStatement(AbdlParser.ForStatementContext ctx) { return visitChildren(ctx); }
    @Override public Object visitWhileStatement(AbdlParser.WhileStatementContext ctx) { return visitChildren(ctx); }
    @Override public Object visitIfStatement(AbdlParser.IfStatementContext ctx) { return visitChildren(ctx); }
    @Override public Object visitVarDeclaration(AbdlParser.VarDeclarationContext ctx) {
        StringBuilder res = new StringBuilder();
        vars.put(ctx.ID().getText(), "v" + varCount);
        res.append("let v" + varCount++ + " = " + visit(ctx.expr()));
        return res.toString();
    }
    @Override public Object visitVarAttrib(AbdlParser.VarAttribContext ctx) { return visitChildren(ctx); }
    @Override public Object visitFunctionCall(AbdlParser.FunctionCallContext ctx) { return visitChildren(ctx); }
    @Override public Object visitReturnStat(AbdlParser.ReturnStatContext ctx) { return visitChildren(ctx); }
    @Override public Object visitEpxrFunctionCall(AbdlParser.EpxrFunctionCallContext ctx) { return visitChildren(ctx); }
    @Override public Object visitParent(AbdlParser.ParentContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprCurrPlayer(AbdlParser.ExprCurrPlayerContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprHeight(AbdlParser.ExprHeightContext ctx) { return "context.height"; }
    @Override public Object visitExprWidth(AbdlParser.ExprWidthContext ctx) { return "context.width"; }
    @Override public Object visitExprString(AbdlParser.ExprStringContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprPoint(AbdlParser.ExprPointContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprInt(AbdlParser.ExprIntContext ctx) {
        ruleVars.put(ctx, "v" + varCount);
        return "let v" + varCount++ + " = " + ctx.Int().getText() + ";";
    }
    @Override public Object visitExprOp(AbdlParser.ExprOpContext ctx) {
        String expr0 = (String) visit(ctx.expr(0));
        String expr1 = (String) visit(ctx.expr(1));
        return "let v" + varCount++ + " = " + ruleVars.get(ctx.expr(0)) + "." + operations.get(ctx.op.getText()) + "(" + ruleVars.get(ctx.expr(1)) + ");";
    }
    @Override public Object visitExprNull(AbdlParser.ExprNullContext ctx) { return null; }
    @Override public Object visitExprID(AbdlParser.ExprIDContext ctx) {
        return vars.get(ctx.getText());
    }
    @Override public Object visitArgs(AbdlParser.ArgsContext ctx) {
        StringBuilder res = new StringBuilder(ruleVars.get(ctx.expr(0)));
        for(var arg: ctx.expr()) {
            res.append(", ").append(ruleVars.get(arg));
        }
        return res.toString();
    }
    @Override public Object visitTypedArgs(AbdlParser.TypedArgsContext ctx) {
        StringBuilder res = new StringBuilder(ctx.ID(0).getText());
        for(var arg: ctx.ID()) {
            res.append(", ").append(arg.getText());
        }
        return res.toString();
    }
    @Override public Object visitPoint(AbdlParser.PointContext ctx) {
        ruleVars.put(ctx, "v" + varCount);
        return "let v" + varCount++ + " = [" + ruleVars.get(ctx.expr(0)) + ", " + ruleVars.get(ctx.expr(1)) + "]";
    }
>>>>>>> e7c0076fca31f9bb4416fbee9d917965276468f3:ABDLCompilerSource/src/AbdlCompiler.java
}