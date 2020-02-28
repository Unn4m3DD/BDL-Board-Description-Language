import renderer from "./renderer.js";

export default (moves, current_x, current_y, context, table) => {
  const { render } = renderer
  return (event) => {
    for (let x = 0; x < context.board.length; x++)
      for (let y = 0; y < context.board[x].length; y++)
        context.board[x][y].target = false

    for (let move of moves({ current_x, current_y, context })) {
      for (let x = move.x[0]; x < move.x[1]; x++) {
        for (let y = move.y(x)[0]; y < move.y(x)[1]; y++) {
          if (context.board[current_x + x])
            if (context.board[current_x + x][current_y + y])
              context.board[current_x + x][current_y + y]["target"] = true
        }
      }
    }
    render(context, table)
  }
}