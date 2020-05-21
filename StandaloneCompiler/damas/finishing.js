import resolve_moves from "./resolve_moves.js"
import pieces from "./pieces.js"
export default [

    (context) => {
      try {
        if (
          context.board[0][6].piece.name == "D2" &&
          context.board[1][6].piece.name == "D2" &&
          context.board[2][6].piece.name == "D2" &&
          context.board[3][6].piece.name == "D2" &&
          context.board[0][5].piece.name == "D2" &&
          context.board[1][5].piece.name == "D2" &&
          context.board[2][5].piece.name == "D2" &&
          context.board[0][4].piece.name == "D2" &&
          context.board[1][4].piece.name == "D2" &&
          context.board[0][3].piece.name == "D2") return true;
      } catch (e) { }
      try {
        if (
          context.board[6][0].piece.name == "D1" &&
          context.board[6][1].piece.name == "D1" &&
          context.board[6][2].piece.name == "D1" &&
          context.board[6][3].piece.name == "D1" &&
          context.board[5][0].piece.name == "D1" &&
          context.board[5][1].piece.name == "D1" &&
          context.board[5][2].piece.name == "D1" &&
          context.board[4][0].piece.name == "D1" &&
          context.board[4][1].piece.name == "D1" &&
          context.board[3][0].piece.name == "D1") return true;
      } catch (e) { }
      return false;
    }
  ]