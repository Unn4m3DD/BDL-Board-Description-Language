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
  D1: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
          {
            x: [-2, -1],
            y: (x) => [-2, -1],
            killing: false
          },
          {
            x: [-2, -1],
            y: (x) => [-1, 0],
            killing: false
          },
          {
            x: [-2, -1],
            y: (x) => [0, 1],
            killing: false
          },
          {
            x: [-2, -1],
            y: (x) => [1, 2],
            killing: false
          },
          {
            x: [-2, -1],
            y: (x) => [2, 3],
            killing: false
          },
          {
            x: [-1, 0],
            y: (x) => [-2, -1],
            killing: false
          },
          {
            x: [-1, 0],
            y: (x) => [-1, 0],
            killing: false
          },
          {
            x: [-1, 0],
            y: (x) => [0, 1],
            killing: false
          },
          {
            x: [-1, 0],
            y: (x) => [1, 2],
            killing: false
          },
          {
            x: [-1, 0],
            y: (x) => [2, 3],
            killing: false
          },
          {
            x: [0, 1],
            y: (x) => [-2, -1],
            killing: false
          },
          {
            x: [0, 1],
            y: (x) => [-1, 0],
            killing: false
          },
          {
            x: [0, 1],
            y: (x) => [0, 1],
            killing: false
          },
          {
            x: [0, 1],
            y: (x) => [1, 2],
            killing: false
          },
          {
            x: [0, 1],
            y: (x) => [2, 3],
            killing: false
          },
          {
            x: [1, 2],
            y: (x) => [-2, -1],
            killing: false
          },
          {
            x: [1, 2],
            y: (x) => [-1, 0],
            killing: false
          },
          {
            x: [1, 2],
            y: (x) => [0, 1],
            killing: false
          },
          {
            x: [1, 2],
            y: (x) => [1, 2],
            killing: false
          },
          {
            x: [1, 2],
            y: (x) => [2, 3],
            killing: false
          },
          {
            x: [2, 3],
            y: (x) => [-2, -1],
            killing: false
          },
          {
            x: [2, 3],
            y: (x) => [-1, 0],
            killing: false
          },
          {
            x: [2, 3],
            y: (x) => [0, 1],
            killing: false
          },
          {
            x: [2, 3],
            y: (x) => [1, 2],
            killing: false
          },
          {
            x: [2, 3],
            y: (x) => [2, 3],
            killing: false
          },
      ]

const mirrored = context.board[current_x][current_y].piece.mirrored
      if (mirrored)
        reverse(result)
      return result
    },
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "D"
    }
  }, 
  D2: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
          {
            x: [-2, -1],
            y: (x) => [-2, -1],
            killing: false
          },
          {
            x: [-2, -1],
            y: (x) => [-1, 0],
            killing: false
          },
          {
            x: [-2, -1],
            y: (x) => [0, 1],
            killing: false
          },
          {
            x: [-2, -1],
            y: (x) => [1, 2],
            killing: false
          },
          {
            x: [-2, -1],
            y: (x) => [2, 3],
            killing: false
          },
          {
            x: [-1, 0],
            y: (x) => [-2, -1],
            killing: false
          },
          {
            x: [-1, 0],
            y: (x) => [-1, 0],
            killing: false
          },
          {
            x: [-1, 0],
            y: (x) => [0, 1],
            killing: false
          },
          {
            x: [-1, 0],
            y: (x) => [1, 2],
            killing: false
          },
          {
            x: [-1, 0],
            y: (x) => [2, 3],
            killing: false
          },
          {
            x: [0, 1],
            y: (x) => [-2, -1],
            killing: false
          },
          {
            x: [0, 1],
            y: (x) => [-1, 0],
            killing: false
          },
          {
            x: [0, 1],
            y: (x) => [0, 1],
            killing: false
          },
          {
            x: [0, 1],
            y: (x) => [1, 2],
            killing: false
          },
          {
            x: [0, 1],
            y: (x) => [2, 3],
            killing: false
          },
          {
            x: [1, 2],
            y: (x) => [-2, -1],
            killing: false
          },
          {
            x: [1, 2],
            y: (x) => [-1, 0],
            killing: false
          },
          {
            x: [1, 2],
            y: (x) => [0, 1],
            killing: false
          },
          {
            x: [1, 2],
            y: (x) => [1, 2],
            killing: false
          },
          {
            x: [1, 2],
            y: (x) => [2, 3],
            killing: false
          },
          {
            x: [2, 3],
            y: (x) => [-2, -1],
            killing: false
          },
          {
            x: [2, 3],
            y: (x) => [-1, 0],
            killing: false
          },
          {
            x: [2, 3],
            y: (x) => [0, 1],
            killing: false
          },
          {
            x: [2, 3],
            y: (x) => [1, 2],
            killing: false
          },
          {
            x: [2, 3],
            y: (x) => [2, 3],
            killing: false
          },
      ]

const mirrored = context.board[current_x][current_y].piece.mirrored
      if (mirrored)
        reverse(result)
      return result
    },
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "D"
    }
  }, 
}
export default pieces;