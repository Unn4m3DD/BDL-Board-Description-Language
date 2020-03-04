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
  horse: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
      {
        x: [2, 3],
        y: (x) => [1, 2],
        killing: true
      },
      {
        x: [2, 3],
        y: (x) => [-1, 0],
        killing: true
      },
      {
        x: [-2, -1],
        y: (x) => [1, 2],
        killing: true
      },
      {
        x: [-2, -1],
        y: (x) => [-1, 0],
        killing: true
      },
      {
        x: [1, 2],
        y: (x) => [2, 3],
        killing: true
      },
      {
        x: [1, 2],
        y: (x) => [-2, -1],
        killing: true
      },
      {
        x: [-1, 0],
        y: (x) => [2, 3],
        killing: true
      },
      {
        x: [-1, 0],
        y: (x) => [-2, -1],
        killing: true
      },
    ]
      return result
    },
    can_jump: false,
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "h"
    }
  },
  tower: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
      {
        x: [-8, 0],
        y: (x) => [0, 1],
        killing: true
      },
      {
        x: [1, 9],
        y: (x) => [0, 1],
        killing: true
      },
      {
        x: [0, 1],
        y: (x) => [-8, 0],
        killing: true
      },
      {
        x: [0, 1],
        y: (x) => [1, 9],
        killing: true
      },
    ]
      return result
    },
    can_jump: false,
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "t"
    }
  },
  bishop: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
      {
        x: [-8, 0],
        y: (x) => [x, x + 1],
        killing: true
      },
      {
        x: [1, 9],
        y: (x) => [x, x + 1],
        killing: true
      },
    ]
      return result
    },
    can_jump: false,
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "b"
    }
  },
  queen: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
      {
        x: [-8, 0],
        y: (x) => [0, 1],
        killing: true
      },
      {
        x: [1, 9],
        y: (x) => [0, 1],
        killing: true
      },
      {
        x: [0, 1],
        y: (x) => [-8, 0],
        killing: true
      },
      {
        x: [0, 1],
        y: (x) => [1, 9],
        killing: true
      },
      {
        x: [-8, 0],
        y: (x) => [x, x + 1],
        killing: true
      },
      {
        x: [1, 9],
        y: (x) => [x, x + 1],
        killing: true
      },
    ]
      return result
    },
    can_jump: false,
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "q"
    }
  },
  king: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
      {
        x: [-1, 0],
        y: (x) => [0, 1],
        killing: true
      },
      {
        x: [1, 2],
        y: (x) => [0, 1],
        killing: true
      },
      {
        x: [0, 1],
        y: (x) => [-1, 0],
        killing: true
      },
      {
        x: [0, 1],
        y: (x) => [1, 2],
        killing: true
      },
      {
        x: [-1, 0],
        y: (x) => [x, x + 1],
        killing: true
      },
      {
        x: [1, 2],
        y: (x) => [x, x + 1],
        killing: true
      },
    ]
      return result
    },
    can_jump: false,
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "k"
    }
  },
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
      letter: "p"
    }
  },
}

export default pieces
