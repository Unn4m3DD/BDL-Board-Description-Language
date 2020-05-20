package Compiler;
//TODO lista de argumento no print
import SymbolTable.*;
import antlr4Gen.*;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SemanticVisitor extends AbdlBaseVisitor<Object> {
    SymbolTable st = new SymbolTable();
    boolean error = false;
    //TODO typeinfer do getName e getOwner
    //TODO redefinicao do sleep
    @Override
    public Object visitProgram(AbdlParser.ProgramContext ctx) {
        st.pushScope();
        for (var func : ctx.functDef()) {
            LinkedList<String> args = new LinkedList<>();
            for (var type : func.typedArgs().Type()) {
                args.add(type.getText());
            }
            st.pushSymbol(
                    func.func_name.getText(),
                    new Function(
                            func.func_name.getText(),
                            args,
                            func.Type() != null ?
                                    func.Type().getText() :
                                    ""
                    )
            );
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
    public Object visitFuncCall(AbdlParser.FuncCallContext ctx) {
        visitFunctionCall(ctx.funcName, ctx.args(), ctx.start);
        return super.visitFuncCall(ctx);
    }

    @Override
    public Object visitExprFunctionCall(AbdlParser.ExprFunctionCallContext ctx) {
        visitFunctionCall(ctx.funcName, ctx.args(), ctx.start);
        return super.visitExprFunctionCall(ctx);
    }

    @Override
    public Object visitCanMoveCall(AbdlParser.CanMoveCallContext ctx) {
        visitFunctionCall(ctx.funcName, ctx.args(), ctx.start);
        return super.visitCanMoveCall(ctx);
    }

    @Override
    public Object visitMoveCall(AbdlParser.MoveCallContext ctx) {
        visitFunctionCall(ctx.funcName, ctx.args(), ctx.start);
        return super.visitMoveCall(ctx);
    }

    @Override
    public Object visitPrintCall(AbdlParser.PrintCallContext ctx) {
        visitFunctionCall(ctx.funcName, ctx.args(), ctx.start);
        return super.visitPrintCall(ctx);
    }

    public void visitFunctionCall(
            Token funcName,
            AbdlParser.ArgsContext args,
            Token start
    ) {
        /*
         * Este codigo estava feito antes da divisao de functionCall em subcontextos por isso
         * a multiplexagem é feita via codigo em vez de parse
         * */
        TypeInfer typeInfer = new TypeInfer(st);
        if (funcName.getText().equals("print")) {
            if (args.expr() == null
                    || args.expr().size() != 1
                    || typeInfer.visit(args.expr(0)).equals("")) {
                error = true;
                //tested
                System.err.println("Invalid call to print statement " + getLineFormated(start));
            }
            return;
        }
        Function func = (Function) st.resolve(funcName.getText());
        if (func == null) {
            //tested
            System.err.println("Function not defined " + getLineFormated(start) + ": " + funcName.getText());
            error = true;
        } else {
            List<String> passedVarTypes = new ArrayList<String>(args != null ? args.expr().size() : 0);
            if (args != null)
                for (var expr : args.expr())
                    passedVarTypes.add(typeInfer.visit(expr));
            if (!passedVarTypes.equals(func.getArgs())) {
                //tested
                System.err.println(
                        "Function argument types and passed parameters do not match " + getLineFormated(start) + ": " +
                                func.getArgs() + " != " + passedVarTypes
                );
                error = true;
            }
        }
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
    public Object visitVarAttrib(AbdlParser.VarAttribContext ctx) {
        TypeInfer typeInfer = new TypeInfer(st);
        Variable variable = (Variable) st.resolve(ctx.ID().getText());
        String inferredType = typeInfer.visit(ctx.expr());
        if (variable == null) {
            //tested
            System.err.println("Variable not declared " + getLineFormated(ctx.start) + ": " + ctx.ID().getText());
            error = true;
        } else if (inferredType.equals("")) {
            //tested
            System.err.println("It was not possible to infer expression type " + getLineFormated(ctx.expr().start) + ": " + ctx.expr().getText());
            error = true;
        } else if (!variable.getType().equals(inferredType)) {
            //tested
            System.err.println("Variable and attribution types mismatch " + getLineFormated(ctx.start) + ": " +
                    ctx.ID().getText() + " (" + variable.getType() + ") and " +
                    ctx.expr().getText() + " (" + inferredType + ")");
            error = true;
        }
        return super.visitVarAttrib(ctx);
    }

    @Override
    public Object visitVarDeclaration(AbdlParser.VarDeclarationContext ctx) {
        String type = "";
        String declaredType = ctx.Type() != null ? ctx.Type().getText() : "";
        TypeInfer ti = new TypeInfer(st);
        String inferredType = ctx.expr() != null ? ti.visit(ctx.expr()) : "";
        if (declaredType.equals("") && inferredType.equals("")) {
            System.err.println("It was not possible to infer the type " + getLineFormated(ctx.expr().start) + ": " + ctx.ID().getText());
            error = true;
        } else if (declaredType.equals(""))
            type = inferredType;
        else if (inferredType.equals(""))
            type = declaredType;
        else if (declaredType.equals(inferredType))
            type = declaredType;
        else {
            //tested
            System.err.println("Declared and inferred type do not match " + getLineFormated(ctx.start) + ": " +
                    inferredType + " != " + declaredType
            );
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
        st.popScope();
        return result;
    }

    @Override
    public Object visitExprID(AbdlParser.ExprIDContext ctx) {
        /* TODO verificar que isto pode estar comentado
        if (st.resolve(ctx.ID().getText()) == null) {
            System.err.println("Undefined variable " + getLineFormated(ctx.start) + ":" + ctx.ID().getText());
            error = true;
        }
        */
        return visitChildren(ctx);
    }

    String getLineFormated(Token start) {
        return "(" + start.getLine() + ":" + start.getCharPositionInLine() + ")";
    }
}
