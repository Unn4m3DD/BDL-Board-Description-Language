// Generated from D:/dev/BDL-Board-Description-Language/CompilerSource/src\Board.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BoardParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BoardVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BoardParser#game}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGame(BoardParser.GameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#ruleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSet(BoardParser.RuleSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleDef(BoardParser.RuleDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#pieceDescriptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieceDescriptions(BoardParser.PieceDescriptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#pieceDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieceDescription(BoardParser.PieceDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#moves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoves(BoardParser.MovesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(BoardParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveFunctionHorizontal}
	 * labeled alternative in {@link BoardParser#moveFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveFunctionHorizontal(BoardParser.MoveFunctionHorizontalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveFunctionVertical}
	 * labeled alternative in {@link BoardParser#moveFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveFunctionVertical(BoardParser.MoveFunctionVerticalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveFunctionDiagonal}
	 * labeled alternative in {@link BoardParser#moveFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveFunctionDiagonal(BoardParser.MoveFunctionDiagonalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveFunctionExplicit}
	 * labeled alternative in {@link BoardParser#moveFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveFunctionExplicit(BoardParser.MoveFunctionExplicitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#kills}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKills(BoardParser.KillsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionModifier(BoardParser.DescriptionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#onEndReached}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnEndReached(BoardParser.OnEndReachedContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#endReachedAlternatives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndReachedAlternatives(BoardParser.EndReachedAlternativesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#initialPiecePositions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialPiecePositions(BoardParser.InitialPiecePositionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#initialPiecePosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialPiecePosition(BoardParser.InitialPiecePositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#positions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositions(BoardParser.PositionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#positionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionModifier(BoardParser.PositionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#invariantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariantList(BoardParser.InvariantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariant(BoardParser.InvariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#finish}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinish(BoardParser.FinishContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#finishingRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinishingRules(BoardParser.FinishingRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(BoardParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(BoardParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#explicitParsed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitParsed(BoardParser.ExplicitParsedContext ctx);
}