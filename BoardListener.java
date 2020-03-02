// Generated from Board.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link BoardParser#pieces}.
	 * @param ctx the parse tree
	 */
	void enterPieces(BoardParser.PiecesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#pieces}.
	 * @param ctx the parse tree
	 */
	void exitPieces(BoardParser.PiecesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#initial_status}.
	 * @param ctx the parse tree
	 */
	void enterInitial_status(BoardParser.Initial_statusContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#initial_status}.
	 * @param ctx the parse tree
	 */
	void exitInitial_status(BoardParser.Initial_statusContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#pieceMove}.
	 * @param ctx the parse tree
	 */
	void enterPieceMove(BoardParser.PieceMoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#pieceMove}.
	 * @param ctx the parse tree
	 */
	void exitPieceMove(BoardParser.PieceMoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#piecePos}.
	 * @param ctx the parse tree
	 */
	void enterPiecePos(BoardParser.PiecePosContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#piecePos}.
	 * @param ctx the parse tree
	 */
	void exitPiecePos(BoardParser.PiecePosContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoardParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(BoardParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(BoardParser.PositionContext ctx);
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
	 * Enter a parse tree produced by {@link BoardParser#coordenates}.
	 * @param ctx the parse tree
	 */
	void enterCoordenates(BoardParser.CoordenatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoardParser#coordenates}.
	 * @param ctx the parse tree
	 */
	void exitCoordenates(BoardParser.CoordenatesContext ctx);
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
}