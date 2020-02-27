export default {
  generate_table: (target_id, height, width) => {
    let table_body = document.createElement("tbody")
    for (let x = 0; x < height; x++) {
      let table_row = document.createElement("tr")
      for (let y = 0; y < width; y++) {
        table_row.appendChild(document.createElement("td"))
      }
      table_body.appendChild(table_row)
    }
    document.getElementById(target_id).appendChild(table_body)
  },
  render: (board, table) => {
    for (let x = 0; x < board.length; x++) {
      for (let y = 0; y < board[x].length; y++) {

      }
    }
  }
}
