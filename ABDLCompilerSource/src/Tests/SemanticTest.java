package Tests;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import antlr4Gen.*;
import Compiler.*;

public class SemanticTest {
    public static void main(String[] args) throws IOException {
        PrintStream stdErr = System.err;
        String dir = "abdl_source_code_examples/ErrorTest/";
        File d = new File(dir);
        List<String> tests = Arrays.stream(d.list()).filter(s -> s.endsWith(".abdl")).map(e -> e.substring(0, e.length() - 5)).collect(Collectors.toList());

        for (var test : tests) {
            CharStream cs = CharStreams.fromFileName(dir + test + ".abdl");
            AbdlLexer lexer = new AbdlLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AbdlParser parser = new AbdlParser(tokens);
            ParseTree tree = parser.program();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);
            System.setErr(ps);
            SemanticVisitor visitor = new SemanticVisitor();
            visitor.visit(tree);
            System.err.flush();
            System.setErr(stdErr);
            String[] result = baos.toString(StandardCharsets.UTF_8).split("[\r]?\n");
            File f = new File(dir + test + ".expected");
            Scanner fs = new Scanner(f);
            boolean error = false;
            for (int i = 0; fs.hasNextLine(); i++) {
                String output = fs.nextLine();
                if (!output.equals(result[i])) {
                    error = true;
                    System.err.println("An error occurred on " + test);
                    System.out.println("Expected:");
                    System.out.println(output);
                    System.out.println("and got:");
                    System.out.println(result[i]);
                    System.out.println();
                }
            }
            if (!error) {
                System.out.println(test + " executed with no errors");
            }
        }
    }
}
