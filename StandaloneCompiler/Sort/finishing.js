import resolve_moves from "./resolve_moves.js"
import pieces from "./pieces.js"
export default [
  (context) => {
    for (let x = 0; x < context.width; x++) {
      for (let y = 0; y < context.height; y++) {
        if (context.board[x][y].piece
          && context.board[x][y].piece.owner === context.current_player) {
          let temp_board = JSON.parse(JSON.stringify(context.board))
          resolve_moves(
            pieces[temp_board[x][y].piece.name].moves,
            x,
            y,
            {
              board: temp_board,
              height: context.height,
              width: context.width,
              current_player: context.current_player,
              focused: context.focused
            },
            true)()
          const targets = temp_board.map((e) => e.map((e2) => e2.target))
          for (let i = 0; i < context.width; i++)
            for (let j = 0; j < context.height; j++)
              if (targets[i][j]) return false
        }
      }
    }
    return true
  },
]