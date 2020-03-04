// Generated from D:/dev/BDL-Board-Description-Language/Compiler/src\Board.g4 by ANTLR 4.8
package antlr4;
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
	 * Visit a parse tree produced by {@link BoardParser#piecesDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiecesDescription(BoardParser.PiecesDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#pieceDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieceDescription(BoardParser.PieceDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#pieceDescriptionProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieceDescriptionProperty(BoardParser.PieceDescriptionPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#initialStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialStatus(BoardParser.InitialStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#piecesInitialStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiecesInitialStatus(BoardParser.PiecesInitialStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#pieceInitialStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieceInitialStatus(BoardParser.PieceInitialStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#pieceInitialStatusProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPieceInitialStatusProperty(BoardParser.PieceInitialStatusPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#onEndReached}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnEndReached(BoardParser.OnEndReachedContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#endReachedFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndReachedFunctions(BoardParser.EndReachedFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#endReachedKnownFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndReachedKnownFunctions(BoardParser.EndReachedKnownFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#spawnFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpawnFunction(BoardParser.SpawnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#stringArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArray(BoardParser.StringArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#canJump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanJump(BoardParser.CanJumpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#mirrored}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirrored(BoardParser.MirroredContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(BoardParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#positions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositions(BoardParser.PositionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(BoardParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#ruleDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleDef(BoardParser.RuleDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#invariants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariants(BoardParser.InvariantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#finish}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinish(BoardParser.FinishContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(BoardParser.FunctionContext ctx);
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
	 * Visit a parse tree produced by {@link BoardParser#moveProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveProperty(BoardParser.MovePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#killing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKilling(BoardParser.KillingContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(BoardParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#coordinates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordinates(BoardParser.CoordinatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(BoardParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX(BoardParser.XContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitY(BoardParser.YContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(BoardParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#explicit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit(BoardParser.ExplicitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#explicitContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitContent(BoardParser.ExplicitContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#languageKeywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageKeywords(BoardParser.LanguageKeywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(BoardParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoardParser#invariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvariant(BoardParser.InvariantContext ctx);
}