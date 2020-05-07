import SymbolTable.*;


import java.util.LinkedList;

public class SemanticVisitor extends AbdlBaseVisitor<Object> {
    SymbolTable st = new SymbolTable();
    boolean error = false;

    @Override
    public Object visitFunctDef(AbdlParser.FunctDefContext ctx) {
        st.pushScope();
        LinkedList<String> args = new LinkedList<>();
        for (var type : ctx.typedArgs().Type()) {
            args.add(type.getText());
        }
        for (var variable : ctx.typedArgs().ID()) {
            st.pushSymbol(variable.getText(), new Variable(variable.getText()));
        }
        st.pushSymbol(ctx.func_name.getText(), new Function(ctx.func_name.getText(), args));

        Object result = visitChildren(ctx);

        st.popScope();
        return result;
    }

    @Override
    public Object visitForStatement(AbdlParser.ForStatementContext ctx) {
        st.pushScope();
        st.pushSymbol(ctx.var.getText(), new Variable(ctx.var.getText()));
        Object result = visitChildren(ctx);
        st.popScope();
        return result;
    }

    @Override
    public Object visitIfStatement(AbdlParser.IfStatementContext ctx) {
        st.pushScope();
        Object result = visitChildren(ctx);
        st.popScope();
        return result;
    }

    @Override
    public Object visitVarDeclaration(AbdlParser.VarDeclarationContext ctx) {
        st.pushSymbol(ctx.ID().getText(), new Variable(ctx.ID().getText()));
        return visitChildren(ctx);
    }

    @Override
    public Object visitMain(AbdlParser.MainContext ctx) {
        st.pushScope();
        Object result =  visitChildren(ctx);
        st.popScope();
        return result;
    }

    @Override
    public Object visitExprID(AbdlParser.ExprIDContext ctx) {
        if (st.resolve(ctx.ID().getText()) == null) {
            error = true;
            System.err.println(ctx.ID().getText() + " is not defined (" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine() + ")");
        }
        return visitChildren(ctx);
    }
}
