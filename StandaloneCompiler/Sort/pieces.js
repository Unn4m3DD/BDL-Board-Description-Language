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
  p: {
    moves: ({ current_x, current_y, context }) => {
      const result = [
        {
          x: [0, 1],
          y: (x) => [-12, 0],
          killing: true
        },
        {
          x: [0, 1],
          y: (x) => [1, 13],
          killing: true
        },
      ]
      return result
    },
    on_end_reached: (context, current_x, current_y) => { },
    representation: {
      img: "",
      letter: "P"
    }
  }, 
}
export default pieces;