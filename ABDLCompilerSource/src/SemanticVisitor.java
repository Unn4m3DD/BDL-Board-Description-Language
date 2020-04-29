

import CompilerTools.GlobalScope;
import CompilerTools.Scope;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SemanticVisitor extends AbdlBaseVisitor<Object> {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope;

    @Override
    public Object visitFunctDef(AbdlParser.FunctDefContext ctx) {
//        definedFunctions.add(
//                new Function(ctx.func_name.getText(),
//                        ctx.typedArgs().Type().stream().map((item) -> item.getText()).collect(Collectors.toList()),
//                        ctx.Type().getText()));
        return super.visitFunctDef(ctx);
    }

    @Override
    public Object visitFunctionCall(AbdlParser.FunctionCallContext ctx) {
        List<String> argType = new ArrayList<>(ctx.args().expr().size());

        for (var item : ctx.args().expr()) {

        }

        return super.visitFunctionCall(ctx);
    }
}
