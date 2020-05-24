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
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "H"
    }
  }, 
  tower: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
        {
          x: [-10, 0],
          y: (x) => [0, 1],
          killing: true
        },
        {
          x: [1, 11],
          y: (x) => [0, 1],
          killing: true
        },
        {
          x: [0, 1],
          y: (x) => [-10, 0],
          killing: true
        },
        {
          x: [0, 1],
          y: (x) => [1, 11],
          killing: true
        },
      ]
      return result
    },
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "T"
    }
  }, 
  bishop: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
        {
          x: [-10, 0],
          y: (x) => [x, x + 1],
          killing: true
        },
        {
          x: [1, 11],
          y: (x) => [x, x + 1],
          killing: true
        },
        {
          x: [-10, 0],
          y: (x) => [-x, -x + 1],
          killing: true
        },
        {
          x: [1, 11],
          y: (x) => [-x, -x + 1],
          killing: true
        },
      ]
      return result
    },
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "B"
    }
  }, 
  queen: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
        {
          x: [-10, 0],
          y: (x) => [0, 1],
          killing: true
        },
        {
          x: [1, 11],
          y: (x) => [0, 1],
          killing: true
        },
        {
          x: [0, 1],
          y: (x) => [-10, 0],
          killing: true
        },
        {
          x: [0, 1],
          y: (x) => [1, 11],
          killing: true
        },
        {
          x: [-10, 0],
          y: (x) => [x, x + 1],
          killing: true
        },
        {
          x: [1, 11],
          y: (x) => [x, x + 1],
          killing: true
        },
        {
          x: [-10, 0],
          y: (x) => [-x, -x + 1],
          killing: true
        },
        {
          x: [1, 11],
          y: (x) => [-x, -x + 1],
          killing: true
        },
      ]
      return result
    },
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "Q"
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
        {
          x: [-1, 0],
          y: (x) => [-x, -x + 1],
          killing: true
        },
        {
          x: [1, 2],
          y: (x) => [-x, -x + 1],
          killing: true
        },
      ]
      return result
    },
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "K"
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
          x: [0, 1],
          y: (x) => [0, 0],
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
    on_end_reached:  (context, current_x, current_y) => {
      let response = ""
      while (!{"queen" : 1, "bishop" : 1, "tower" : 1, "horse" : 1}[response]) {
        let msg = "Select one: "
        let sep = ""
        for (let i in {"queen" : 1, "bishop" : 1, "tower" : 1, "horse" : 1}) {
          msg += sep + i
          sep = ", "
        }
        response = prompt(msg)
      }
      context.board[current_x][current_y].piece.name = response
    },
    representation: {
      img: "",
      letter: "P"
    }
  }, 
}
export default pieces;