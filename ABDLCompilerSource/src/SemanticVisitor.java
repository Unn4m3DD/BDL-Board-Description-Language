import SymbolTable.*;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SemanticVisitor extends AbdlBaseVisitor<Object> {
    SymbolTable st = new SymbolTable();
    boolean error = false;

    @Override
    public Object visitProgram(AbdlParser.ProgramContext ctx) {
        st.pushScope();
        for (var func : ctx.functDef()) {
            LinkedList<String> args = new LinkedList<>();
            for (var type : func.typedArgs().Type()) {
                args.add(type.getText());
            }
            st.pushSymbol(func.func_name.getText(), new Function(func.func_name.getText(), args, func.Type().getText()));
        }
        List<String> argList = new ArrayList<>(2) {{
            add("point");
            add("point");
        }};
        //  can_move([x_prev, y_prev], [x_next, y_next]) // returns 1 or 0
        st.pushSymbol("can_move", new Function("can_move", argList, "int"));
        //  move([x_prev, y_prev], [x_next, y_next]) // returns 1 or 0 (success or failure)
        st.pushSymbol("move", new Function("move", argList, "int"));

        return visitChildren(ctx);
    }

    @Override
    public Object visitFunctionCall(AbdlParser.FunctionCallContext ctx) {
        if (ctx.funcName.getText().equals("print"))
            return super.visitFunctionCall(ctx);

        Function func = (Function) st.resolve(ctx.funcName.getText());
        if (func == null) {
            System.err.println("Function " + ctx.funcName.getText() + " is not defined" + getLineFormated(ctx.start));
            error = true;
        } else {
            List<String> passedVarTypes = new ArrayList<String>(ctx.args() != null ? ctx.args().expr().size() : 0);
            TypeInfer typeInfer = new TypeInfer(st);
            if (ctx.args() != null)
                for (var expr : ctx.args().expr())
                    passedVarTypes.add(typeInfer.visit(expr));
            if (!passedVarTypes.equals(func.getArgs())) {
                System.err.println(
                        "Function argument types " + func.getArgs() +
                                " passed parameter " + passedVarTypes +
                                " do not match " + getLineFormated(ctx.start)
                );
                error = true;
            }
        }

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
        String declaredType = ctx.Type() != null ? ctx.Type().getText() : "";
        TypeInfer ti = new TypeInfer(st);
        String inferredType = ti.visit(ctx.expr());
        if (declaredType.equals("") && inferredType.equals("")) {
            System.err.println("It was not possible to infer " + ctx.ID().getText() +
                    " type " + getLineFormated(ctx.start));
            error = true;
        } else if (declaredType.equals(""))
            type = inferredType;
        else if (inferredType.equals(""))
            type = declaredType;
        else if (declaredType.equals(inferredType))
            type = declaredType;
        else {
            System.err.println("Declared and inferred type do not match (" + inferredType + " != " + declaredType + ")" +
                    getLineFormated(ctx.start));
            error = true;
        }

        if (!type.equals(""))
            st.pushSymbol(ctx.ID().getText(), new Variable(ctx.ID().getText(), type));
        return visitChildren(ctx);
    }


    @Override
    public Object visitMain(AbdlParser.MainContext ctx) {
        st.pushScope();
        Object result = visitChildren(ctx);
        System.out.println(st);
        st.popScope();
        return result;
    }

    @Override
    public Object visitExprID(AbdlParser.ExprIDContext ctx) {
        if (st.resolve(ctx.ID().getText()) == null) {
            System.err.println(ctx.ID().getText() + " is not defined " + getLineFormated(ctx.start));
            error = true;
        }
        return visitChildren(ctx);
    }

    String getLineFormated(Token start) {
        return "(" + start.getLine() + ":" + start.getCharPositionInLine() + ")";
    }
}
