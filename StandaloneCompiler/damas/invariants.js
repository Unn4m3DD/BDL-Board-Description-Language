import resolve_moves from "./resolve_moves.js";
import pieces from "./pieces.js";
export default [

    (context, current_x, current_y, target_x, target_y) => {
      if(context.board[current_x][current_y].piece.name != "D1" &&
        context.board[current_x][current_y].piece.name != "D2")
        return true;
        
      if(Math.abs(current_x - target_x) < 2 && Math.abs(current_y - target_y) < 2)
        return true;

      let x_must_be_enemy = (target_x - current_x) / 2 + current_x;
      let y_must_be_enemy = (target_y - current_y) / 2 + current_y;
      if(context.board[current_x] &&
        context.board[current_x][current_y] &&
        context.board[current_x][current_y].piece &&
        context.board[current_x][current_y].piece.name == "D1")
        if(context.board[x_must_be_enemy] &&
          context.board[x_must_be_enemy][y_must_be_enemy] &&
          context.board[x_must_be_enemy][y_must_be_enemy].piece &&
          context.board[x_must_be_enemy][y_must_be_enemy].piece.name == "D2")
          return true;
      if(context.board[current_x] &&
        context.board[current_x][current_y] &&
        context.board[current_x][current_y].piece &&
        context.board[current_x][current_y].piece.name == "D2")
        if(context.board[x_must_be_enemy] &&
          context.board[x_must_be_enemy][y_must_be_enemy] &&
          context.board[x_must_be_enemy][y_must_be_enemy].piece &&
          context.board[x_must_be_enemy][y_must_be_enemy].piece.name == "D1")
          return true;

      return false;
    }
  ]
