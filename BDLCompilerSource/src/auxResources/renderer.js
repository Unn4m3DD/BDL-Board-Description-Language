//import pieces from "./pieces.js";
import pieces from "./pieces.js";
import get_onclick_from_piece_moves from "./resolve_moves.js"
import rules from "./rules.js"
import finishing_rules from "./finishing.js"
const { player_change_rule, board_coloring_rule } = rules
const functions = {
  colorize_table: (table, context) => {
    let last_color = ""
    for (let x = 0; x < context.height; x++) {
      for (let y = 0; y < context.width; y++) {
        last_color = board_coloring_rule(x, y, last_color)
        table[x][y].style.backgroundColor = last_color
      }
    }
  },
  generate_table: (target_id, height, width) => {
    let old_table = []
    let table_body = document.createElement("tbody")
    for (let x = 0; x < height; x++) {
      old_table.push([])
      let table_row = document.createElement("tr")
      for (let y = 0; y < width; y++) {
        old_table[x].push(document.createElement("td"))
        table_row.appendChild(old_table[x][y])
      }
      table_body.appendChild(table_row)
    }
    document.getElementById(target_id).appendChild(table_body)

    function transpose(mat) {
      for (var i = 0; i < mat.length; i++) {
        for (var j = 0; j < i; j++) {
          const tmp = mat[i][j];
          mat[i][j] = mat[j][i];
          mat[j][i] = tmp;
        }
      }
    }
    transpose(old_table)
    return old_table
  },
  render: (context, table) => {
    const { board } = context
    functions.colorize_table(table, context)
    for (let x = 0; x < board.length; x++) {
      for (let y = 0; y < board[x].length; y++) {

        if (board[x][y].target) {
          table[x][y].style.backgroundColor = "rgba(100, 200, 100, 100)"
          table[x][y].onclick = (event) => {
            context.move_count++;
            player_change_rule(context)
            for (let x = 0; x < context.board.length; x++) {
              for (let y = 0; y < context.board[x].length; y++) {
                context.board[x][y].target = false
                table[x][y].onclick = (event) => { }
              }
            }
            board[x][y].piece = board[context.focused.x][context.focused.y].piece
            board[context.focused.x][context.focused.y].piece = null
            if (!board[x][y].piece.mirrored) {
              if (y === context.height - 1)
                pieces[board[x][y].piece.name].on_end_reached(context, x, y)
            } else {
              if (y === 0)
                pieces[board[x][y].piece.name].on_end_reached(context, x, y)
            }

            functions.render(context, table)
          }
        }
        else if (board[x][y].piece) {
          table[x][y].innerText = pieces[board[x][y].piece.name].representation.letter
          if (board[x][y].piece.owner == 0)
            table[x][y].className = "p1"

          if (board[x][y].piece.owner == 1)
            table[x][y].className = "p2"
          if (context.current_player === board[x][y].piece.owner)
            table[x][y].onclick = () => {
              context.focused.x = x
              context.focused.y = y
              get_onclick_from_piece_moves(pieces[board[x][y].piece.name].moves, x, y, context, true)()
              functions.render(context, table)
            }
        }
        else {
          table[x][y].onclick = () => { }
          table[x][y].innerText = ""
          table[x][y].className = ""
        }
      }
    }
    let finished = true;
    for (const rule of finishing_rules) {
      finished = finished & rule(context)
    }
    if (finished) {
      alert("Game Finished")
    }
  }
}
export default functions;
