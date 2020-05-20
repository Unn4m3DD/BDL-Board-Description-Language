// Generated from C:/dev/BDL-Board-Description-Language/CompilerSource/src\Board.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BoardParser}.
 */
public interface BoardListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BoardParser#game}.
	 * @param ctx the parse tree
	 */
	void enterGame(BoardParser.GameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#game}.
	 * @param ctx the parse tree
	 */
	void exitGame(BoardParser.GameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSet(BoardParser.RuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSet(BoardParser.RuleSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleProp}
	 * labeled alternative in {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 */
	void enterRuleProp(BoardParser.RulePropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleProp}
	 * labeled alternative in {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 */
	void exitRuleProp(BoardParser.RulePropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleColoring}
	 * labeled alternative in {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 */
	void enterRuleColoring(BoardParser.RuleColoringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleColoring}
	 * labeled alternative in {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 */
	void exitRuleColoring(BoardParser.RuleColoringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rulePlayerChange}
	 * labeled alternative in {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 */
	void enterRulePlayerChange(BoardParser.RulePlayerChangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rulePlayerChange}
	 * labeled alternative in {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 */
	void exitRulePlayerChange(BoardParser.RulePlayerChangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#pieceDescriptions}.
	 * @param ctx the parse tree
	 */
	void enterPieceDescriptions(BoardParser.PieceDescriptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#pieceDescriptions}.
	 * @param ctx the parse tree
	 */
	void exitPieceDescriptions(BoardParser.PieceDescriptionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pieceIdPlusMoves}
	 * labeled alternative in {@link BoardParser#pieceDescription}.
	 * @param ctx the parse tree
	 */
	void enterPieceIdPlusMoves(BoardParser.PieceIdPlusMovesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pieceIdPlusMoves}
	 * labeled alternative in {@link BoardParser#pieceDescription}.
	 * @param ctx the parse tree
	 */
	void exitPieceIdPlusMoves(BoardParser.PieceIdPlusMovesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pieceDescriptionExplicit}
	 * labeled alternative in {@link BoardParser#pieceDescription}.
	 * @param ctx the parse tree
	 */
	void enterPieceDescriptionExplicit(BoardParser.PieceDescriptionExplicitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pieceDescriptionExplicit}
	 * labeled alternative in {@link BoardParser#pieceDescription}.
	 * @param ctx the parse tree
	 */
	void exitPieceDescriptionExplicit(BoardParser.PieceDescriptionExplicitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#moves}.
	 * @param ctx the parse tree
	 */
	void enterMoves(BoardParser.MovesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#moves}.
	 * @param ctx the parse tree
	 */
	void exitMoves(BoardParser.MovesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveVector}
	 * labeled alternative in {@link BoardParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMoveVector(BoardParser.MoveVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveVector}
	 * labeled alternative in {@link BoardParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMoveVector(BoardParser.MoveVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveFunctionDescription}
	 * labeled alternative in {@link BoardParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMoveFunctionDescription(BoardParser.MoveFunctionDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveFunctionDescription}
	 * labeled alternative in {@link BoardParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMoveFunctionDescription(BoardParser.MoveFunctionDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveExplicit}
	 * labeled alternative in {@link BoardParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMoveExplicit(BoardParser.MoveExplicitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveExplicit}
	 * labeled alternative in {@link BoardParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMoveExplicit(BoardParser.MoveExplicitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveFunctionHorizontal}
	 * labeled alternative in {@link BoardParser#moveFunction}.
	 * @param ctx the parse tree
	 */
	void enterMoveFunctionHorizontal(BoardParser.MoveFunctionHorizontalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveFunctionHorizontal}
	 * labeled alternative in {@link BoardParser#moveFunction}.
	 * @param ctx the parse tree
	 */
	void exitMoveFunctionHorizontal(BoardParser.MoveFunctionHorizontalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveFunctionVertical}
	 * labeled alternative in {@link BoardParser#moveFunction}.
	 * @param ctx the parse tree
	 */
	void enterMoveFunctionVertical(BoardParser.MoveFunctionVerticalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveFunctionVertical}
	 * labeled alternative in {@link BoardParser#moveFunction}.
	 * @param ctx the parse tree
	 */
	void exitMoveFunctionVertical(BoardParser.MoveFunctionVerticalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveFunctionDiagonal}
	 * labeled alternative in {@link BoardParser#moveFunction}.
	 * @param ctx the parse tree
	 */
	void enterMoveFunctionDiagonal(BoardParser.MoveFunctionDiagonalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveFunctionDiagonal}
	 * labeled alternative in {@link BoardParser#moveFunction}.
	 * @param ctx the parse tree
	 */
	void exitMoveFunctionDiagonal(BoardParser.MoveFunctionDiagonalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveFunctionExplicit}
	 * labeled alternative in {@link BoardParser#moveFunction}.
	 * @param ctx the parse tree
	 */
	void enterMoveFunctionExplicit(BoardParser.MoveFunctionExplicitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveFunctionExplicit}
	 * labeled alternative in {@link BoardParser#moveFunction}.
	 * @param ctx the parse tree
	 */
	void exitMoveFunctionExplicit(BoardParser.MoveFunctionExplicitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#kills}.
	 * @param ctx the parse tree
	 */
	void enterKills(BoardParser.KillsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#kills}.
	 * @param ctx the parse tree
	 */
	void exitKills(BoardParser.KillsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code descriptionModifierCanJump}
	 * labeled alternative in {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionModifierCanJump(BoardParser.DescriptionModifierCanJumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descriptionModifierCanJump}
	 * labeled alternative in {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionModifierCanJump(BoardParser.DescriptionModifierCanJumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code descriptionModifierMirrored}
	 * labeled alternative in {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionModifierMirrored(BoardParser.DescriptionModifierMirroredContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descriptionModifierMirrored}
	 * labeled alternative in {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionModifierMirrored(BoardParser.DescriptionModifierMirroredContext ctx);
	/**
	 * Enter a parse tree produced by the {@code descriptionModifierOnEndReached}
	 * labeled alternative in {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionModifierOnEndReached(BoardParser.DescriptionModifierOnEndReachedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descriptionModifierOnEndReached}
	 * labeled alternative in {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionModifierOnEndReached(BoardParser.DescriptionModifierOnEndReachedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code descriptionModifierExplicit}
	 * labeled alternative in {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionModifierExplicit(BoardParser.DescriptionModifierExplicitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descriptionModifierExplicit}
	 * labeled alternative in {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionModifierExplicit(BoardParser.DescriptionModifierExplicitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#endReachedAlternatives}.
	 * @param ctx the parse tree
	 */
	void enterEndReachedAlternatives(BoardParser.EndReachedAlternativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#endReachedAlternatives}.
	 * @param ctx the parse tree
	 */
	void exitEndReachedAlternatives(BoardParser.EndReachedAlternativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#initialPiecePositions}.
	 * @param ctx the parse tree
	 */
	void enterInitialPiecePositions(BoardParser.InitialPiecePositionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#initialPiecePositions}.
	 * @param ctx the parse tree
	 */
	void exitInitialPiecePositions(BoardParser.InitialPiecePositionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#initialPiecePosition}.
	 * @param ctx the parse tree
	 */
	void enterInitialPiecePosition(BoardParser.InitialPiecePositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#initialPiecePosition}.
	 * @param ctx the parse tree
	 */
	void exitInitialPiecePosition(BoardParser.InitialPiecePositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#positions}.
	 * @param ctx the parse tree
	 */
	void enterPositions(BoardParser.PositionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#positions}.
	 * @param ctx the parse tree
	 */
	void exitPositions(BoardParser.PositionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positionModifierMirrored}
	 * labeled alternative in {@link BoardParser#positionModifier}.
	 * @param ctx the parse tree
	 */
	void enterPositionModifierMirrored(BoardParser.PositionModifierMirroredContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positionModifierMirrored}
	 * labeled alternative in {@link BoardParser#positionModifier}.
	 * @param ctx the parse tree
	 */
	void exitPositionModifierMirrored(BoardParser.PositionModifierMirroredContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positionModifierOwner}
	 * labeled alternative in {@link BoardParser#positionModifier}.
	 * @param ctx the parse tree
	 */
	void enterPositionModifierOwner(BoardParser.PositionModifierOwnerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positionModifierOwner}
	 * labeled alternative in {@link BoardParser#positionModifier}.
	 * @param ctx the parse tree
	 */
	void exitPositionModifierOwner(BoardParser.PositionModifierOwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#invariantList}.
	 * @param ctx the parse tree
	 */
	void enterInvariantList(BoardParser.InvariantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#invariantList}.
	 * @param ctx the parse tree
	 */
	void exitInvariantList(BoardParser.InvariantListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invariantCantRisk}
	 * labeled alternative in {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 */
	void enterInvariantCantRisk(BoardParser.InvariantCantRiskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invariantCantRisk}
	 * labeled alternative in {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 */
	void exitInvariantCantRisk(BoardParser.InvariantCantRiskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invariantProtectPiece}
	 * labeled alternative in {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 */
	void enterInvariantProtectPiece(BoardParser.InvariantProtectPieceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invariantProtectPiece}
	 * labeled alternative in {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 */
	void exitInvariantProtectPiece(BoardParser.InvariantProtectPieceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invariantPawnMovement}
	 * labeled alternative in {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 */
	void enterInvariantPawnMovement(BoardParser.InvariantPawnMovementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invariantPawnMovement}
	 * labeled alternative in {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 */
	void exitInvariantPawnMovement(BoardParser.InvariantPawnMovementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invariantExplicit}
	 * labeled alternative in {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 */
	void enterInvariantExplicit(BoardParser.InvariantExplicitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invariantExplicit}
	 * labeled alternative in {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 */
	void exitInvariantExplicit(BoardParser.InvariantExplicitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#finish}.
	 * @param ctx the parse tree
	 */
	void enterFinish(BoardParser.FinishContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#finish}.
	 * @param ctx the parse tree
	 */
	void exitFinish(BoardParser.FinishContext ctx);
	/**
	 * Enter a parse tree produced by the {@code finishingNoMovesAvailable}
	 * labeled alternative in {@link BoardParser#finishingRules}.
	 * @param ctx the parse tree
	 */
	void enterFinishingNoMovesAvailable(BoardParser.FinishingNoMovesAvailableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code finishingNoMovesAvailable}
	 * labeled alternative in {@link BoardParser#finishingRules}.
	 * @param ctx the parse tree
	 */
	void exitFinishingNoMovesAvailable(BoardParser.FinishingNoMovesAvailableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code finishingExplicit}
	 * labeled alternative in {@link BoardParser#finishingRules}.
	 * @param ctx the parse tree
	 */
	void enterFinishingExplicit(BoardParser.FinishingExplicitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code finishingExplicit}
	 * labeled alternative in {@link BoardParser#finishingRules}.
	 * @param ctx the parse tree
	 */
	void exitFinishingExplicit(BoardParser.FinishingExplicitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(BoardParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(BoardParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullInterval}
	 * labeled alternative in {@link BoardParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterFullInterval(BoardParser.FullIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullInterval}
	 * labeled alternative in {@link BoardParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitFullInterval(BoardParser.FullIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code degenInterval}
	 * labeled alternative in {@link BoardParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterDegenInterval(BoardParser.DegenIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code degenInterval}
	 * labeled alternative in {@link BoardParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitDegenInterval(BoardParser.DegenIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#explicitParsed}.
	 * @param ctx the parse tree
	 */
	void enterExplicitParsed(BoardParser.ExplicitParsedContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#explicitParsed}.
	 * @param ctx the parse tree
	 */
	void exitExplicitParsed(BoardParser.ExplicitParsedContext ctx);
}