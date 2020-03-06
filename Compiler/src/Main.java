import antlr4.BoardLexer;
import antlr4.BoardParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CharStream cs = CharStreams.fromFileName(args[0]);
        BoardLexer lexer = new BoardLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BoardParser parser = new BoardParser(tokens);

        ParseTree tree = parser.game();
        TreeListener listener = new TreeListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree);
    }
}
