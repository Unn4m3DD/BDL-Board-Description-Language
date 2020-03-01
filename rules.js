import resolve_moves from "./resolve_moves.js";
import pieces from "./pieces.js";

export default {
  targeting_invariants: [
    (context, current_x, current_y, target_x, target_y) => {
      if (!context.board[current_x][current_y].piece ||
        context.board[current_x][current_y].piece.name !== "king")
        return true
      for (let x = 0; x < context.width; x++) {
        for (let y = 0; y < context.width; y++) {
          if (x === current_x && y === current_y)
            continue
          if (context.board[x][y].piece
            && context.board[x][y].piece.owner !== context.board[current_x][current_y].piece.owner) {
            let temp_board = JSON.parse(JSON.stringify(context.board))
            resolve_moves(
              pieces[context.board[x][y].piece.name].moves,
              x,
              y,
              {
                board: temp_board,
                height: context.height,
                width: context.width,
                current_player: context.current_player,
                focused: context.focused
              },
              false)()
            console.log(
              context.board[x][y].piece.name,
              temp_board.map((e) => e.map((e2) => e2.target)))
            if (temp_board[target_x]
              && temp_board[target_x][target_y]
              && temp_board[target_x][target_y].target)
              return false
          }
        }
      }
      return true;
    }
  ]
}