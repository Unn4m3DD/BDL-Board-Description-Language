// Generated from D:/dev/BDL-Board-Description-Language/ABDLCompilerSource/src\Abdl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbdlParser}.
 */
public interface AbdlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AbdlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AbdlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AbdlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbdlParser#stats}.
	 * @param ctx the parse tree
	 */
	void enterStats(AbdlParser.StatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbdlParser#stats}.
	 * @param ctx the parse tree
	 */
	void exitStats(AbdlParser.StatsContext ctx);
}