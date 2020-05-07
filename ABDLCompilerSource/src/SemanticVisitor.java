import SymbolTable.*;


import java.util.LinkedList;

public class SemanticVisitor extends AbdlBaseVisitor<Object> {
    SymbolTable st = new SymbolTable();
    boolean error = false;

    @Override
    public Object visitProgram(AbdlParser.ProgramContext ctx) {
        for (var func : ctx.functDef()) {
            LinkedList<String> args = new LinkedList<>();
            for (var type : func.typedArgs().Type()) {
                args.add(type.getText());
            }
            st.pushSymbol(func.func_name.getText(), new Function(func.func_name.getText(), args));
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionCall(AbdlParser.FunctionCallContext ctx) {
        Function func = (Function) st.resolve(ctx.funcName.getText());
        return super.visitFunctionCall(ctx);
    }

    @Override
    public Object visitFunctDef(AbdlParser.FunctDefContext ctx) {
        st.pushScope();
        for (int i = 0; i < ctx.typedArgs().ID().size(); i++) {
            st.pushSymbol(
                    ctx.typedArgs().ID(i).getText(),
                    new Variable(ctx.typedArgs().ID(i).getText(), ctx.typedArgs().Type(i).getText())
            );
        }

        Object result = visitChildren(ctx);

        st.popScope();
        return result;
    }

    @Override
    public Object visitForStatement(AbdlParser.ForStatementContext ctx) {
        st.pushScope();
        st.pushSymbol(ctx.var.getText(), new Variable(ctx.var.getText(), "int"));
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
        String type = "";
        if (ctx.Type() != null) {
            type = ctx.Type().getText();
        } else {
            //TODO
            //if (ctx.expr())
        }
        st.pushSymbol(ctx.ID().getText(), new Variable(ctx.ID().getText(), type));
        return visitChildren(ctx);
    }



    @Override
    public Object visitMain(AbdlParser.MainContext ctx) {
        st.pushScope();
        Object result = visitChildren(ctx);
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
