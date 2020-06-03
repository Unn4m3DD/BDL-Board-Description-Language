import resolve_moves from "./resolve_moves.js"
import pieces from "./pieces.js"
export default [

    (context) => {
      let counter = 0;
      for (let i = 0; i < context.width; i++) {
          if (context.board[i][context.width - i - 1] != null &&
          context.board[i][context.width - i - 1].piece != null &&
            context.board[i][context.width - i - 1].piece.name != null &&
            context.board[i][context.width - i - 1].piece.name == "p") counter++;
        }
        console.log(counter);
        if(counter == 9) return true; 
    return false;
    }
  ]