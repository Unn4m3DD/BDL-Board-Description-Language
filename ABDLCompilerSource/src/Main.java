import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        AbdlLexer lexer = new AbdlLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AbdlParser parser = new AbdlParser(tokens);
        ParseTree tree = parser.program();
        //AbdlMyVisitor visitor = new AbdlMyVisitor();
        //visitor.visit(tree);
    }
}
