import CompilerTools.GlobalScope;
import CompilerTools.Scope;

import java.util.ArrayList;
import java.util.List;

import CompilerTools.Symbol;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SemanticVisitor extends AbdlBaseVisitor<Object> {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
    GlobalScope globals;
    Scope currentScope;

    @Override
    public Object visitProgram(AbdlParser.ProgramContext ctx) {
        globals = new GlobalScope();
        currentScope = globals;
        visitChildren(ctx);
        System.out.println(globals);
        return null;
    }

    @Override
    public Object visitFunctDef(AbdlParser.FunctDefContext ctx) {
        String name = ctx.ID().getText();
        int typeTokenType = ctx.type().start.getType();
        AbdlParser.Type type = CheckSymbols.getType(typeTokenType);
// push new scope by making new one that points to enclosing scope
        FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
        currentScope.define(function); // Define function in current scope
        saveScope(ctx, function); // Push: set function's parent to current
        currentScope = function; // Current scope is now function scope
    }
}
