import targeting_invariants from "./invariants.js"
export default (moves, current_x, current_y, context, resolve_recursively) => {
  return (event) => {
    for (let x = 0; x < context.board.length; x++)
      for (let y = 0; y < context.board[x].length; y++)
        context.board[x][y].target = false
    for (let move of moves({ current_x, current_y, context })) {
      if (move.x[0] > 0)
        outer1:
        for (let x = move.x[0]; x < move.x[1]; x++) {
          let bound = move.y(x)
          if (bound[0] > 0)
            for (let y = bound[0]; y < bound[1]; y++) {
              if (context.board[current_x + x])
                if (context.board[current_x + x][current_y + y]) {
                  if (context.board[current_x + x][current_y + y].piece)
                    if (!move.killing
                      || context.board[current_x + x][current_y + y].piece.owner === context.board[current_x][current_y].piece.owner)
                      if (!context.board[current_x][current_y].piece.can_jump)
                        break outer1
                  let invariant_check = true;
                  if (resolve_recursively)
                    for (const invariant of targeting_invariants)
                      invariant_check = invariant_check && invariant(context, current_x, current_y, current_x + x, current_y + y)
                  if (invariant_check)
                    context.board[current_x + x][current_y + y]["target"] = true
                  if (context.board[current_x + x][current_y + y].piece)
                    if (!context.board[current_x][current_y].piece.can_jump)
                      break outer1
                }
            }
          else {
            for (let y = bound[1] - 1; y >= bound[0]; y--) {
              if (context.board[current_x + x])
                if (context.board[current_x + x][current_y + y]) {
                  if (context.board[current_x + x][current_y + y].piece)
                    if (!move.killing
                      || context.board[current_x + x][current_y + y].piece.owner === context.board[current_x][current_y].piece.owner)
                      if (!context.board[current_x][current_y].piece.can_jump)
                        break outer1
                  let invariant_check = true;
                  if (resolve_recursively)
                    for (const invariant of targeting_invariants)
                      invariant_check = invariant_check && invariant(context, current_x, current_y, current_x + x, current_y + y)
                  if (invariant_check)
                    context.board[current_x + x][current_y + y]["target"] = true
                  if (context.board[current_x + x][current_y + y].piece)
                    if (!context.board[current_x][current_y].piece.can_jump)
                      break outer1
                }
            }
          }
        }
      else {
        outer2:
        for (let x = move.x[1] - 1; x >= move.x[0]; x--) {
          let bound = move.y(x)
          if (bound[0] > 0) {
            for (let y = bound[0]; y < bound[1]; y++) {
              if (context.board[current_x + x])
                if (context.board[current_x + x][current_y + y]) {
                  if (context.board[current_x + x][current_y + y].piece)
                    if (!move.killing
                      || context.board[current_x + x][current_y + y].piece.owner === context.board[current_x][current_y].piece.owner)
                      if (!context.board[current_x][current_y].piece.can_jump)
                        break outer2
                  let invariant_check = true;
                  if (resolve_recursively)
                    for (const invariant of targeting_invariants)
                      invariant_check = invariant_check && invariant(context, current_x, current_y, current_x + x, current_y + y)
                  if (invariant_check)
                    context.board[current_x + x][current_y + y]["target"] = true
                  if (context.board[current_x + x][current_y + y].piece)
                    if (!context.board[current_x][current_y].piece.can_jump)
                      break outer2
                }
            }
          }
          else {
            for (let y = bound[1] - 1; y >= bound[0]; y--) {
              if (context.board[current_x + x])
                if (context.board[current_x + x][current_y + y]) {
                  if (context.board[current_x + x][current_y + y].piece)
                    if (!move.killing
                      || context.board[current_x + x][current_y + y].piece.owner === context.board[current_x][current_y].piece.owner)
                      if (!context.board[current_x][current_y].piece.can_jump)
                        break outer2
                  let invariant_check = true;
                  if (resolve_recursively)
                    for (const invariant of targeting_invariants)
                      invariant_check = invariant_check && invariant(context, current_x, current_y, current_x + x, current_y + y)
                  if (invariant_check)
                    context.board[current_x + x][current_y + y]["target"] = true

                  if (context.board[current_x + x][current_y + y].piece)
                    if (!context.board[current_x][current_y].piece.can_jump)
                      break outer2
                }
            }
          }
        }
      }
    }

  }
}