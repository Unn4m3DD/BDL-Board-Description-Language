// Generated from D:/dev/BDL-Board-Description-Language/Compiler/src\Board.g4 by ANTLR 4.8
package antlr4;
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
	 * Enter a parse tree produced by {@link BoardParser#piecesDescription}.
	 * @param ctx the parse tree
	 */
	void enterPiecesDescription(BoardParser.PiecesDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#piecesDescription}.
	 * @param ctx the parse tree
	 */
	void exitPiecesDescription(BoardParser.PiecesDescriptionContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#pieceDescriptionProperty}.
	 * @param ctx the parse tree
	 */
	void enterPieceDescriptionProperty(BoardParser.PieceDescriptionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#pieceDescriptionProperty}.
	 * @param ctx the parse tree
	 */
	void exitPieceDescriptionProperty(BoardParser.PieceDescriptionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#initialStatus}.
	 * @param ctx the parse tree
	 */
	void enterInitialStatus(BoardParser.InitialStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#initialStatus}.
	 * @param ctx the parse tree
	 */
	void exitInitialStatus(BoardParser.InitialStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#piecesInitialStatus}.
	 * @param ctx the parse tree
	 */
	void enterPiecesInitialStatus(BoardParser.PiecesInitialStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#piecesInitialStatus}.
	 * @param ctx the parse tree
	 */
	void exitPiecesInitialStatus(BoardParser.PiecesInitialStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#pieceInitialStatus}.
	 * @param ctx the parse tree
	 */
	void enterPieceInitialStatus(BoardParser.PieceInitialStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#pieceInitialStatus}.
	 * @param ctx the parse tree
	 */
	void exitPieceInitialStatus(BoardParser.PieceInitialStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#pieceInitialStatusProperty}.
	 * @param ctx the parse tree
	 */
	void enterPieceInitialStatusProperty(BoardParser.PieceInitialStatusPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#pieceInitialStatusProperty}.
	 * @param ctx the parse tree
	 */
	void exitPieceInitialStatusProperty(BoardParser.PieceInitialStatusPropertyContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#endReachedFunctions}.
	 * @param ctx the parse tree
	 */
	void enterEndReachedFunctions(BoardParser.EndReachedFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#endReachedFunctions}.
	 * @param ctx the parse tree
	 */
	void exitEndReachedFunctions(BoardParser.EndReachedFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#endReachedKnownFunctions}.
	 * @param ctx the parse tree
	 */
	void enterEndReachedKnownFunctions(BoardParser.EndReachedKnownFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#endReachedKnownFunctions}.
	 * @param ctx the parse tree
	 */
	void exitEndReachedKnownFunctions(BoardParser.EndReachedKnownFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#spawnFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpawnFunction(BoardParser.SpawnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#spawnFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpawnFunction(BoardParser.SpawnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#stringArray}.
	 * @param ctx the parse tree
	 */
	void enterStringArray(BoardParser.StringArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#stringArray}.
	 * @param ctx the parse tree
	 */
	void exitStringArray(BoardParser.StringArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#canJump}.
	 * @param ctx the parse tree
	 */
	void enterCanJump(BoardParser.CanJumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#canJump}.
	 * @param ctx the parse tree
	 */
	void exitCanJump(BoardParser.CanJumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#mirrored}.
	 * @param ctx the parse tree
	 */
	void enterMirrored(BoardParser.MirroredContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#mirrored}.
	 * @param ctx the parse tree
	 */
	void exitMirrored(BoardParser.MirroredContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(BoardParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(BoardParser.BoolContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(BoardParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(BoardParser.RulesContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#invariants}.
	 * @param ctx the parse tree
	 */
	void enterInvariants(BoardParser.InvariantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#invariants}.
	 * @param ctx the parse tree
	 */
	void exitInvariants(BoardParser.InvariantsContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(BoardParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(BoardParser.FunctionContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#moveProperty}.
	 * @param ctx the parse tree
	 */
	void enterMoveProperty(BoardParser.MovePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#moveProperty}.
	 * @param ctx the parse tree
	 */
	void exitMoveProperty(BoardParser.MovePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#killing}.
	 * @param ctx the parse tree
	 */
	void enterKilling(BoardParser.KillingContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#killing}.
	 * @param ctx the parse tree
	 */
	void exitKilling(BoardParser.KillingContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(BoardParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(BoardParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#coordinates}.
	 * @param ctx the parse tree
	 */
	void enterCoordinates(BoardParser.CoordinatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#coordinates}.
	 * @param ctx the parse tree
	 */
	void exitCoordinates(BoardParser.CoordinatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(BoardParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(BoardParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(BoardParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(BoardParser.XContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#y}.
	 * @param ctx the parse tree
	 */
	void enterY(BoardParser.YContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#y}.
	 * @param ctx the parse tree
	 */
	void exitY(BoardParser.YContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#explicit}.
	 * @param ctx the parse tree
	 */
	void enterExplicit(BoardParser.ExplicitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#explicit}.
	 * @param ctx the parse tree
	 */
	void exitExplicit(BoardParser.ExplicitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#explicitContent}.
	 * @param ctx the parse tree
	 */
	void enterExplicitContent(BoardParser.ExplicitContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#explicitContent}.
	 * @param ctx the parse tree
	 */
	void exitExplicitContent(BoardParser.ExplicitContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#languageKeywords}.
	 * @param ctx the parse tree
	 */
	void enterLanguageKeywords(BoardParser.LanguageKeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#languageKeywords}.
	 * @param ctx the parse tree
	 */
	void exitLanguageKeywords(BoardParser.LanguageKeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(BoardParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(BoardParser.NameContext ctx);
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
}