export default {
  generate_table: (target_id, height, width) => {
    let table = []
    let table_body = document.createElement("tbody")
    for (let x = 0; x < height; x++) {
      table.push([])
      let table_row = document.createElement("tr")
      for (let y = 0; y < width; y++) {
        table[x].push(document.createElement("td"))
        table_row.appendChild(table[x][y])
      }
      table_body.appendChild(table_row)
    }
    document.getElementById(target_id).appendChild(table_body)
    return table
  },
  render: (context, table) => {
    for (let x = 0; x < board.length; x++) {
      for (let y = 0; y < board[x].length; y++) {

      }
    }
  }
}
