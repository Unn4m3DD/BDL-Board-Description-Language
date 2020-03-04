import resolve_moves from "./resolve_moves.js";
//import pieces from "./pieces.js";
import pieces from "./generated_pieces.js";

export default {
  first_player: 0,
  width: 8,
  height: 8,
  board_coloring_rule: (x, y, last_color) => {
    if (y === 0) last_color = last_color === "#ffffff" ? "#c90" : "#ffffff"
    last_color = last_color === "#ffffff" ? "#c90" : "#ffffff"
    return last_color
  },
  player_change_rule: (context) => {
    context.current_player = context.current_player === 0 ? 1 : 0
  },
  finishing_rules: [
    (context) => {
      for (let x = 0; x < context.width; x++) {
        for (let y = 0; y < context.width; y++) {
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
              for (let j = 0; j < context.width; j++)
                if (targets[i][j]) return false
          }
        }
      }
      return true
    }
  ]
}