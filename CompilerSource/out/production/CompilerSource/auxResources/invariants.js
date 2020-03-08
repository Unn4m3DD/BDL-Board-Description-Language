import resolve_moves from "./resolve_moves.js";
import pieces from "./pieces.js";
export default [
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
          temp_board[target_x][target_y].piece = { ...temp_board[current_x][current_y].piece }
          temp_board[current_x][current_y].piece = null
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
            false)()
          if (temp_board[target_x]
            && temp_board[target_x][target_y]
            && temp_board[target_x][target_y].target)
            return false
        }
      }
    }
    return true;
  },
  (context, current_x, current_y, target_x, target_y) => {
    if (!context.board[current_x][current_y].piece)
      return true

    for (let x = 0; x < context.width; x++) {
      for (let y = 0; y < context.width; y++) {
        if (x === target_x && y === target_y)
          continue
        if (context.board[x][y].piece
          && context.board[x][y].piece.owner !== context.board[current_x][current_y].piece.owner) {
          let temp_board = JSON.parse(JSON.stringify(context.board))
          temp_board[target_x][target_y].piece = { ...temp_board[current_x][current_y].piece }
          temp_board[current_x][current_y].piece = null
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
            false)()
          const targets = temp_board.map((e) => e.map((e2) => e2.target))
          for (let i = 0; i < context.width; i++) {
            for (let j = 0; j < context.width; j++) {
              if (targets[i][j] &&
                temp_board[i][j].piece &&
                (temp_board[i][j].piece.name === "king"))
                return false
            }
          }
        }
      }
    }
    return true
  },
(context, current_x, current_y, target_x, target_y) => {
    if (!context.board[current_x][current_y].piece ||
      context.board[current_x][current_y].piece.name !== "pawn")
      return true

    if (target_x === current_x) {
      if (!context.board[target_x][target_y].piece) {
        if (Math.abs(current_y - target_y) < 2)
          return true
        if (!context.board[current_x][current_y].piece.mirrored ?
          current_y === 1 : current_y === context.height - 2)
          return true
      }
    }

    if (context.board[target_x][target_y].piece !== null)
      if (context.board[target_x][target_y].piece.owner !==
        context.board[current_x][current_y].piece.owner)
        return true
    return false
  },
]
