// Generated from C:/dev/BDL-Board-Description-Language/CompilerSource/src\Board.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by the {@code ruleProp}
	 * labeled alternative in {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleProp(BoardParser.RulePropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ruleColoring}
	 * labeled alternative in {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleColoring(BoardParser.RuleColoringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rulePlayerChange}
	 * labeled alternative in {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulePlayerChange(BoardParser.RulePlayerChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#pieceDescriptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieceDescriptions(BoardParser.PieceDescriptionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pieceIdPlusMoves}
	 * labeled alternative in {@link BoardParser#pieceDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieceIdPlusMoves(BoardParser.PieceIdPlusMovesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pieceDescriptionExplicit}
	 * labeled alternative in {@link BoardParser#pieceDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieceDescriptionExplicit(BoardParser.PieceDescriptionExplicitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#moves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoves(BoardParser.MovesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveVector}
	 * labeled alternative in {@link BoardParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveVector(BoardParser.MoveVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveFunctionDescription}
	 * labeled alternative in {@link BoardParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveFunctionDescription(BoardParser.MoveFunctionDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveExplicit}
	 * labeled alternative in {@link BoardParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveExplicit(BoardParser.MoveExplicitContext ctx);
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
	 * Visit a parse tree produced by the {@code descriptionModifierCanJump}
	 * labeled alternative in {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionModifierCanJump(BoardParser.DescriptionModifierCanJumpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code descriptionModifierMirrored}
	 * labeled alternative in {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionModifierMirrored(BoardParser.DescriptionModifierMirroredContext ctx);
	/**
	 * Visit a parse tree produced by the {@code descriptionModifierOnEndReached}
	 * labeled alternative in {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionModifierOnEndReached(BoardParser.DescriptionModifierOnEndReachedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code descriptionModifierExplicit}
	 * labeled alternative in {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptionModifierExplicit(BoardParser.DescriptionModifierExplicitContext ctx);
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
	 * Visit a parse tree produced by the {@code positionModifierMirrored}
	 * labeled alternative in {@link BoardParser#positionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionModifierMirrored(BoardParser.PositionModifierMirroredContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positionModifierOwner}
	 * labeled alternative in {@link BoardParser#positionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionModifierOwner(BoardParser.PositionModifierOwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#invariantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariantList(BoardParser.InvariantListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invariantCantRisk}
	 * labeled alternative in {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariantCantRisk(BoardParser.InvariantCantRiskContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invariantProtectPiece}
	 * labeled alternative in {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariantProtectPiece(BoardParser.InvariantProtectPieceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invariantPawnMovement}
	 * labeled alternative in {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariantPawnMovement(BoardParser.InvariantPawnMovementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code invariantExplicit}
	 * labeled alternative in {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariantExplicit(BoardParser.InvariantExplicitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#finish}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinish(BoardParser.FinishContext ctx);
	/**
	 * Visit a parse tree produced by the {@code finishingNoMovesAvailable}
	 * labeled alternative in {@link BoardParser#finishingRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinishingNoMovesAvailable(BoardParser.FinishingNoMovesAvailableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code finishingExplicit}
	 * labeled alternative in {@link BoardParser#finishingRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinishingExplicit(BoardParser.FinishingExplicitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(BoardParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fullInterval}
	 * labeled alternative in {@link BoardParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullInterval(BoardParser.FullIntervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code degenInterval}
	 * labeled alternative in {@link BoardParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDegenInterval(BoardParser.DegenIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#explicitParsed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitParsed(BoardParser.ExplicitParsedContext ctx);
}