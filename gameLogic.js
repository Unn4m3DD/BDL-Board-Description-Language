import create_board from "./create_board.js"

export default {
  create_context_from_initial_status: (initial_status) => {
    let board = create_board(initial_status.width, initial_status.height)
    for (let piece_name in initial_status.pieces) {
      let current_piece = initial_status.pieces[piece_name]

      for (let position of current_piece.positions) {
        board[position.x][position.y] = {

          target: false,
          piece: {
            name: piece_name,
            owner: 0,
            mirrored: false,
          }
        }
        if (current_piece.mirrored)
          board[position.x][(initial_status.height - 1) - position.y] = {
            target: false,
            piece: {
              name: piece_name,
              owner: 1,
              mirrored: true,
            }
          }
      }
    }
    return {
      focused: { x: 1, y: 1 },
      height: initial_status.height,
      width: initial_status.width,
      current_player: initial_status.first_player,
      board,
    }
  }
}