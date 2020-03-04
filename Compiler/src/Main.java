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

        CharStream cs = CharStreams.fromFileName("source_code_example.bdl");  //load the file
        BoardLexer lexer = new BoardLexer(cs);  //instantiate a lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
        BoardParser parser = new BoardParser(tokens);  //parse the tokens

        ParseTree tree = parser.game(); // parse the content and get the tree
        TreeListener listener = new TreeListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree);
    }
}
