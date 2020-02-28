import pieces from "./pieces.js";

export default {
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
    for (let x = 0; x < board.length; x++) {
      for (let y = 0; y < board[x].length; y++) {
        if (board[x][y].piece) {
          table[x][y].innerText = pieces[board[x][y].piece.name].representation.letter
          if (board[x][y].piece.owner == 0)
            table[x][y].className = "p1"

          if (board[x][y].piece.owner == 1)
            table[x][y].className = "p2"
        }
      }
    }
  }
}
