import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.ST;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        AbdlLexer lexer = new AbdlLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AbdlParser parser = new AbdlParser(tokens);
        ParseTree tree = parser.program();
        SemanticVisitor visitor = new SemanticVisitor();
        visitor.visit(tree);
        AbdlCompiler visitor1 = new AbdlCompiler();
        ST srcCode = (ST) visitor1.visit(tree);
        System.out.println(srcCode.render());
    }

}
