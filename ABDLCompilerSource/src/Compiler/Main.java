package Compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.ST;

import java.io.*;
import java.util.Arrays;
import java.util.BitSet;

import antlr4Gen.*;

import javax.xml.transform.ErrorListener;
//TODO fix move_count js
public class Main {
    public static void main(String[] args) throws IOException {
        new Main(args);
    }

    Main(String[] args) throws IOException {
        if (args.length != 1 && args.length != 2) {
            System.err.println("Usage: java -jar ABDLCompiler.jar source_file.abdl [destination_directory]");
            System.exit(1);
        }
        String sourceName = args[0];
        String destinationName;
        if (args.length == 2)
            destinationName = args[1];
        else
            destinationName = ".";
        File dir = new File(destinationName);
        if (!dir.exists()) {
            System.err.println("Target directory does not exist");
            System.exit(1);
        }
        if (!Arrays.asList(dir.list()).contains("app.js")) {
            System.err.println("Directory does not contain a bdl project");
            System.exit(1);
        }

        CharStream cs = CharStreams.fromFileName(sourceName);
        AbdlLexer lexer = new AbdlLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AbdlParser parser = new AbdlParser(tokens);
        parser.removeErrorListeners();
        MyErrorListener lexicalErrorListener = new MyErrorListener();
        parser.addErrorListener(lexicalErrorListener);
        ParseTree tree = parser.program();
        if (lexicalErrorListener.error) {
            System.err.println("Lexical errors occurred and compilation will stop"); //TODO verificar se é mesmo lexico
            System.exit(1);
        }
        SemanticVisitor visitor = new SemanticVisitor();
        visitor.visit(tree);
        if (visitor.error) {
            System.err.println("Semantic errors occurred and compilation will stop");
            System.exit(1);
        }

        AbdlCompiler visitor1 = new AbdlCompiler();
        ST srcCode = (ST) visitor1.visit(tree);
        try (PrintWriter pw = new PrintWriter(dir.getPath() + File.separator + "abdl.js")) {
            pw.write(srcCode.render());
        }
        File f = new File(dir.getPath() + File.separator + "AbdlVar.js");
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("resources/AbdlVar.js");
        copyInputStreamToFile(is, f);
        System.out.println("Compilation Successful");
    }

    private void copyInputStreamToFile(InputStream inputStream, File file) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            int read;
            byte[] bytes = new byte[1024];
            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
        }
    }
}
