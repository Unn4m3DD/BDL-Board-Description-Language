// Generated from D:/lfa/BDL-Board-Description-Language/ABDLCompilerSource/src\Abdl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AbdlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AbdlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AbdlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AbdlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#stats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStats(AbdlParser.StatsContext ctx);
}