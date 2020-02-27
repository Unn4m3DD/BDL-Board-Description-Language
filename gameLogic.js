export default {
  create_context_from_initial_status: (initial_status) => {
    let board = []
    for (let i = 0; i < initial_status.width; i++) {
      board.push([])
      for (let j = 0; j < initial_status.height; j++) {
        board[i].push([])
      }
    }
    for (let piece_name in initial_status.pieces) {
      let current_piece = initial_status.pieces[piece_name]
      for (let position of current_piece.positions) {
        board[position.x][position.y] = {
          piece: {
            name: piece_name,
            owner: 0
          }
        }
        if (current_piece.mirrored)
          board[position.x][height - position.y] = {
            piece: {
              name: piece_name,
              owner: 1
            }
          }
      }

    }
  }
}