// Generated from D:/dev/BDL-Board-Description-Language/CompilerSource/src\Board.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 */
	void enterRuleDef(BoardParser.RuleDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 */
	void exitRuleDef(BoardParser.RuleDefContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#pieceDescription}.
	 * @param ctx the parse tree
	 */
	void enterPieceDescription(BoardParser.PieceDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#pieceDescription}.
	 * @param ctx the parse tree
	 */
	void exitPieceDescription(BoardParser.PieceDescriptionContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(BoardParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(BoardParser.MoveContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionModifier(BoardParser.DescriptionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#descriptionModifier}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionModifier(BoardParser.DescriptionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#onEndReached}.
	 * @param ctx the parse tree
	 */
	void enterOnEndReached(BoardParser.OnEndReachedContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#onEndReached}.
	 * @param ctx the parse tree
	 */
	void exitOnEndReached(BoardParser.OnEndReachedContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#positionModifier}.
	 * @param ctx the parse tree
	 */
	void enterPositionModifier(BoardParser.PositionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#positionModifier}.
	 * @param ctx the parse tree
	 */
	void exitPositionModifier(BoardParser.PositionModifierContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 */
	void enterInvariant(BoardParser.InvariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 */
	void exitInvariant(BoardParser.InvariantContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#finishingRules}.
	 * @param ctx the parse tree
	 */
	void enterFinishingRules(BoardParser.FinishingRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#finishingRules}.
	 * @param ctx the parse tree
	 */
	void exitFinishingRules(BoardParser.FinishingRulesContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(BoardParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(BoardParser.IntervalContext ctx);
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