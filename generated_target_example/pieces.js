function reverse(array) {
  for (let i = 0; i < array.length; i++) {
    const func = array[i].y
    array[i].y = (x) => {
      const tmp = func
      return [-tmp(x)[1] + 1, -tmp(x)[0] + 1]
    }
  }
}
const pieces = {
  queen: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
      {
        x: [0, 1],
        y: (x) => [-20, 0],
        killing: true
      },
      {
        x: [0, 1],
        y: (x) => [1, 21],
        killing: true
      },
      {
        x: [-20, 0],
        y: (x) => [x, x + 1],
        killing: true
      },
      {
        x: [-20, 0],
        y: (x) => [-x, -x + 1],
        killing: true
      },
      {
        x: [1, 21],
        y: (x) => [x, x + 1],
        killing: true
      },
      {
        x: [1, 21],
        y: (x) => [-x, -x + 1],
        killing: true
      },
    ]
      return result
    },
    can_jump: false,
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "Q"
    }
  },
  pawn: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
      {
        x: [0, 1],
        y: (x) => [1, 3],
        killing: false
      },
      {
        x: [1, 2],
        y: (x) => [1, 2],
        killing: true
      },
      {
        x: [-1, 0],
        y: (x) => [1, 2],
        killing: true
      },
    ]
      const mirrored = context.board[current_x][current_y].piece.mirrored
      if (mirrored)
        reverse(result)
      return result
    },
    on_end_reached: (context, current_x, current_y) => {
      let response = ""
      while (!["queen", "bishop", "tower", "horse"][response]) {
        let msg = "Select one: "
        let sep = ""
        for (let i in ["queen", "bishop", "tower", "horse"]) {
          msg += sep + i
          sep = ", "
        }
        response = prompt(msg)
      }
      context.board[current_x][current_y].piece.name = response
    },
    can_jump: false,
    representation: {
      img: "",
      letter: "P"
    }
  },
}

export default pieces
