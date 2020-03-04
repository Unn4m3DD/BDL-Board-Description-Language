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
  pawn: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
      {
        x: [0, 1],
        y: (x) => [1, 3],
        killing: true
      },
      {
        x: [1, 2],
        y: (x) => [1, 2],
        killing: true
      },
      {
        x: [-8, 0],
        y: (x) => [0, 1],
        killing: false
      },
      {
        x: [1, 9],
        y: (x) => [0, 1],
        killing: false
      },
    ]
      return result
    },
    on_end_reached: (context, current_x, current_y) => {
      let response = ""
      while (!["pawn", "tower"][response]) {
        let msg = "Select one: "
        let sep = ""
        for (let i in ["pawn", "tower"]) {
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
  bishop: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
      {
        x: [8, 9],
        y: (x) => [x, x + 1],
        killing: true
      },
    ]
      return result
    },
    on_end_reached: (context, current_x, current_y) => {
      let response = ""
      while (!["pawn", "tower"][response]) {
        let msg = "Select one: "
        let sep = ""
        for (let i in ["pawn", "tower"]) {
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
      letter: "B"
    }
  },
}

export default pieces
