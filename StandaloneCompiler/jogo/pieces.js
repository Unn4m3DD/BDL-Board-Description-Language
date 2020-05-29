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
  a: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
          {
            x: [-1, 0],
            y: (x) => [1, 2],
            killing: true
          },
          {
            x: [0, 1],
            y: (x) => [1, 2],
            killing: true
          },
          {
            x: [1, 2],
            y: (x) => [1, 2],
            killing: true
          },
          {
            x: [0, 1],
            y: (x) => [2, 3],
            killing: true
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
      letter: "A"
    }
  }, 
  b: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
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
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "B"
    }
  }, 
}
export default pieces;