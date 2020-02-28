function reverse(array) {
  for (let i = 0; i < array.length; i++) {
    const func = array[i].y
    array[i].y = (x) => {
      const tmp = func
      return [-tmp(x)[1] + 1, -tmp(x)[0] + 1]
    }
  }
}
export default {
  tower: {
    moves: ({ current_x, current_y, context }) => [
      {
        x: [1, 8],
        y: (x) => [0, 1]
      },
      {
        x: [-8, 0],
        y: (x) => [0, 1]
      },
      {
        x: [0, 1],
        y: (x) => [1, 8]
      },
      {
        x: [0, 1],
        y: (x) => [-8, 0]
      }
    ],
    can_jump: false,
    representation: {
      img: "",
      letter: "T"
    }
  },

  horse: {
    moves: ({ current_x, current_y, context }) => [
      {
        x: [2, 3],
        y: (x) => [1, 2]
      },
      {
        x: [2, 3],
        y: (x) => [-1, 0]
      },
      {
        x: [-2, -1],
        y: (x) => [1, 2]
      },
      {
        x: [-3, -2],
        y: (x) => [-1, 0]
      },
      {
        x: [1, 2],
        y: (x) => [2, 3],
      },
      {
        x: [-1, 0],
        y: (x) => [2, 3],
      },
      {
        x: [1, 2],
        y: (x) => [-2, -1],
      },
      {
        x: [-1, 0],
        y: (x) => [-2, -1],
      },
    ],
    can_jump: true,
    representation: {
      img: "",
      letter: "H"
    }
  },
  bishop: {
    moves: ({ current_x, current_y, context }) => [
      {
        x: [1, 8],
        y: (x) => [x, x + 1]
      },
      {
        x: [-8, 0],
        y: (x) => [x, x + 1]
      },
      {
        x: [1, 8],
        y: (x) => [-x, -x + 1]
      },
      {
        x: [-8, 0],
        y: (x) => [-x, -x + 1]
      },
    ],
    can_jump: false,
    representation: {
      img: "",
      letter: "B"
    }
  },
  king: {
    moves: ({ current_x, current_y, context }) => [
      {
        x: [1, 2],
        y: (x) => [-1, 2]
      },
      {
        x: [-1, 0],
        y: (x) => [-1, 2]
      },
      {
        x: [0, 1],
        y: (x) => [1, 2]
      },
      {
        x: [0, 1],
        y: (x) => [-1, 0]
      },
    ],
    can_jump: false,
    representation: {
      img: "",
      letter: "K"
    }
  },
  queen: {
    moves: ({ current_x, current_y, context }) => [
      {
        x: [1, 8],
        y: (x) => [0, 1]
      },
      {
        x: [-8, 0],
        y: (x) => [0, 1]
      },
      {
        x: [0, 1],
        y: (x) => [1, 8]
      },
      {
        x: [0, 1],
        y: (x) => [-8, 0]
      },
      {
        x: [1, 8],
        y: (x) => [x, x + 1]
      },
      {
        x: [-8, 0],
        y: (x) => [x, x + 1]
      },
      {
        x: [1, 8],
        y: (x) => [-x, -x + 1]
      },
      {
        x: [-8, 0],
        y: (x) => [-x, -x + 1]
      }
    ],
    can_jump: false,
    representation: {
      img: "",
      letter: "Q"
    }
  },
  pawn: {
    moves: ({ current_x, current_y, context }) => {
      const mirrored = context.board[current_x][current_y].mirrored
      let result = [
        {
          x: [0, 1],
          y: (x) => [1, 2]
        }
      ]
      if (current_y === 1 || current_y === context.height - 2)
        result.push({
          x: [0, 1],
          y: (x) => [2, 3]
        })

      if (
        context.board[current_x + 1]
        && context.board[current_x + 1][current_y + mirrored ? -1 : 1]
        && context.board[current_x + 1][current_y + mirrored ? -1 : 1].piece
        && context.board[current_x + 1][current_y + mirrored ? -1 : 1].piece !== null
        && context.board[current_x + 1][current_y + mirrored ? -1 : 1].piece.owner !== context.current_player)
        result.push({
          x: [1, 2],
          y: (x) => [1, 2]
        })
      if (
        context.board[current_x - 1]
        && context.board[current_x - 1][current_y + mirrored ? -1 : 1]
        && context.board[current_x - 1][current_y + mirrored ? -1 : 1].piece
        && context.board[current_x - 1][current_y + mirrored ? -1 : 1].piece !== null
        && context.board[current_x - 1][current_y + mirrored ? -1 : 1].piece.owner !== context.current_player)
        result.push({
          x: [-1, 0],
          y: (x) => [1, 2]
        })
      if (mirrored)
        reverse(result)

      return result
    },
    can_jump: false,
    representation: {
      img: "",
      letter: "P"
    }
  }
}