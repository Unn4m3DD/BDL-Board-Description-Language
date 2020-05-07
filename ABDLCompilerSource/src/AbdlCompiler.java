import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;
import java.util.HashMap;
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
        return visitChildren(ctx);
    }
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
        ST varDecl = templates.getInstanceOf("decl");
        Variable newVar = new Variable(createVar());
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
                varDecl.add("value", value);
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
                }
                else{
                    System.err.println("No type or expression...");
                }
            }
            else value = (String) expr;
            varDecl.add("val", value);

        }
        program.add("stat", varDecl.render());
        return newVar.getName();
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
        ST varDecl = templates.getInstanceOf("decl");
        String resVar = createVar();
        varDecl.add("var", resVar);
        varDecl.add("val", ctx.Int().getText());
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
    @Override public Object visitPoint(AbdlParser.PointContext ctx) {return visitChildren(ctx);}

    public String createVar() {
        return "v" + varCounter++;
    }

}