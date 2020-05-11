package Tests;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import antlr4Gen.*;
public class SemanticTest {
    public static void main(String[] args) throws IOException {
        PrintStream stdout = System.out;
        String[] tests = new String[]{"TypeCoherenceTest", "VariableResolveTest"};
        for(var test : tests){
            CharStream cs = CharStreams.fromFileName(test);
            AbdlLexer lexer = new AbdlLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AbdlParser parser = new AbdlParser(tokens);
            ParseTree tree = parser.program();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            System.setOut(ps);


            System.out.flush();
        }
    }
}
