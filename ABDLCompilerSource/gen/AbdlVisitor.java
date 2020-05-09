// Generated from D:/dev/BDL-Board-Description-Language/ABDLCompilerSource/src\Abdl.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link AbdlParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(AbdlParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#functDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctDef(AbdlParser.FunctDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AbdlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(AbdlParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(AbdlParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(AbdlParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AbdlParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AbdlParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(AbdlParser.ElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(AbdlParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(AbdlParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#varAttrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAttrib(AbdlParser.VarAttribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CanMoveCall}
	 * labeled alternative in {@link AbdlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanMoveCall(AbdlParser.CanMoveCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoveCall}
	 * labeled alternative in {@link AbdlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveCall(AbdlParser.MoveCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintCall}
	 * labeled alternative in {@link AbdlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCall(AbdlParser.PrintCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link AbdlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(AbdlParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(AbdlParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EpxrFunctionCall}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpxrFunctionCall(AbdlParser.EpxrFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(AbdlParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(AbdlParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBoard}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoard(AbdlParser.ExprBoardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPoint}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPoint(AbdlParser.ExprPointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInt(AbdlParser.ExprIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOp}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOp(AbdlParser.ExprOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCurrPlayer}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCurrPlayer(AbdlParser.ExprCurrPlayerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNull}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNull(AbdlParser.ExprNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprHeight}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprHeight(AbdlParser.ExprHeightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprWidth}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprWidth(AbdlParser.ExprWidthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link AbdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(AbdlParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(AbdlParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#typedArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedArgs(AbdlParser.TypedArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(AbdlParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbdlParser#board}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoard(AbdlParser.BoardContext ctx);
}