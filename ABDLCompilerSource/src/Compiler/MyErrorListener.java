package Compiler;
import antlr4Gen.AbdlParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

public class MyErrorListener extends BaseErrorListener {
    boolean error = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        error = true;
        if (e instanceof FailedPredicateException && e.getCtx() instanceof AbdlParser.FunctDefContext) {
            AbdlParser.FunctDefContext ctx = (AbdlParser.FunctDefContext) e.getCtx();
            System.err.println("Function name must match " +
                    "(" + ctx.funcName.getLine() + ":" + ctx.funcName.getCharPositionInLine() + ")" +
                    "(" + ctx.funcName2.getLine() + ":" + ctx.funcName2.getCharPositionInLine() + "): " +
                    ctx.funcName.getText() + " and " + ctx.funcName2.getText()
            );
        } else
            super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        error = true;
        super.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs);
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        error = true;
        super.reportAttemptingFullContext(recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs);
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        error = true;
        super.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex, prediction, configs);
    }
}
