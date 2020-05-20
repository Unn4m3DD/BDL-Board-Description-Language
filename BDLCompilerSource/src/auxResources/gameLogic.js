import create_board from "./create_board.js"

export default {
  create_context_from_initial_status_and_rules: (initial_status, rules) => {
    let board = create_board(rules.width, rules.height)
    for (let piece_name in initial_status.pieces) {
      let current_piece = initial_status.pieces[piece_name]

      for (let position of current_piece.positions) {
        board[position.x][(rules.height - 1) - position.y] = {
          target: false,
          piece: {
            name: piece_name,
            owner: current_piece.owner,
            mirrored: true,
          }
        }
        if (current_piece.mirrored)
          board[position.x][position.y] = {
            target: false,
            piece: {
              name: piece_name,
              owner: current_piece.owner === 1 ? 0 : 1,
              mirrored: false,
            }
          }
      }
    }
    return {
      focused: { x: 1, y: 1 },
      height: rules.height,
      width: rules.width,
      current_player: rules.first_player,
      move_count: 0,
      board,
    }
  }
}