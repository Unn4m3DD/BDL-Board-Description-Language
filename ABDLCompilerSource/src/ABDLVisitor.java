import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;

public class ABDLVisitor extends AbdlBaseVisitor<Object> {
    STGroup templates = new STGroupDir(".");
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
        res.append("let " + ctx.ID().getText() + " = " + visit(ctx.expr()));
        return res.toString();
    }
    @Override public Object visitVarAttrib(AbdlParser.VarAttribContext ctx) { return visitChildren(ctx); }
    @Override public Object visitFunctionCall(AbdlParser.FunctionCallContext ctx) { return visitChildren(ctx); }
    @Override public Object visitReturnStat(AbdlParser.ReturnStatContext ctx) { return visitChildren(ctx); }
    @Override public Object visitEpxrFunctionCall(AbdlParser.EpxrFunctionCallContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprCondition(AbdlParser.ExprConditionContext ctx) { return visitChildren(ctx); }
    @Override public Object visitParent(AbdlParser.ParentContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprCurrPlayer(AbdlParser.ExprCurrPlayerContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprHeight(AbdlParser.ExprHeightContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprWidth(AbdlParser.ExprWidthContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprString(AbdlParser.ExprStringContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprPoint(AbdlParser.ExprPointContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprInt(AbdlParser.ExprIntContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprOp(AbdlParser.ExprOpContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprNull(AbdlParser.ExprNullContext ctx) { return visitChildren(ctx); }
    @Override public Object visitExprID(AbdlParser.ExprIDContext ctx) { return visitChildren(ctx); }
    @Override public Object visitArgs(AbdlParser.ArgsContext ctx) { return visitChildren(ctx); }
    @Override public Object visitTypedArgs(AbdlParser.TypedArgsContext ctx) { return visitChildren(ctx); }
    @Override public Object visitPoint(AbdlParser.PointContext ctx) { return visitChildren(ctx); }
}