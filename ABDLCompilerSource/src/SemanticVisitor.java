import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SemanticVisitor extends AbdlBaseVisitor<Object> {

    Set<String> definedFunctions = new HashSet<String>();

    @Override
    public Object visitFunctDef(AbdlParser.FunctDefContext ctx) {
        definedFunctions.add(ctx.func_name.getText());
        return super.visitFunctDef(ctx);
    }

    @Override
    public Object visitFunctionCall(AbdlParser.FunctionCallContext ctx) {
        if (!definedFunctions.contains(ctx.ID().getText()))
            System.err.printf("function \"%s\" used but not defined on line %s", ctx.ID().getText(), ctx.start.getText());
        return super.visitFunctionCall(ctx);
    }
}
