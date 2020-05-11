package Compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.ST;

import java.io.IOException;

import antlr4Gen.*;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        AbdlLexer lexer = new AbdlLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AbdlParser parser = new AbdlParser(tokens);
        ParseTree tree = parser.program();

        SemanticVisitor visitor = new SemanticVisitor();
        visitor.visit(tree);
        if (visitor.error) {
            System.err.println("Semantic errors occurred and compilation will stop");
            //System.exit(1);
        }
        //Type infer comentei a linha 130 a 138 functionCall tem diferentes contextos
        //Semantica da linha 42 a 78

        AbdlCompiler visitor1 = new AbdlCompiler();
        ST srcCode = (ST) visitor1.visit(tree);
        System.out.println(srcCode.render());

    }

}
