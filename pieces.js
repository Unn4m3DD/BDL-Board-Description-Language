export default {
  tower: {
    moves: ({ current_x, current_y, context }) => [
      {
        x: [1, 8],
        y: (x) => [0, 1]
      },
      {
        x: [-8, -1],
        y: (x) => [0, 1]
      },
      {
        x: [0, 1],
        y: (x) => [1, 8]
      },
      {
        x: [0, 1],
        y: (x) => [-8, -1]
      }
    ],
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
        x: [-8, -1],
        y: (x) => [x, x + 1]
      },
      {
        x: [1, 8],
        y: (x) => [-x, -x + 1]
      },
      {
        x: [-8, -1],
        y: (x) => [-x, -x + 1]
      },
    ],
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
        x: [-8, -1],
        y: (x) => [0, 1]
      },
      {
        x: [0, 1],
        y: (x) => [1, 8]
      },
      {
        x: [0, 1],
        y: (x) => [-8, -1]
      },
      {
        x: [1, 8],
        y: (x) => [x, x + 1]
      },
      {
        x: [-8, -1],
        y: (x) => [x, x + 1]
      },
      {
        x: [1, 8],
        y: (x) => [-x, -x + 1]
      },
      {
        x: [-8, -1],
        y: (x) => [-x, -x + 1]
      }
    ],
    representation: {
      img: "",
      letter: "Q"
    }
  },
  pawn: {
    moves: ({ current_x, current_y, context }) => {
      let result = [
        {
          x: [0, 1],
          y: (x) => [1, 2]
        }
      ]

      if (current_y === 1)
        result.push({
          x: [0, 1],
          y: (x) => [2, 3]
        })

      if (
        context.board[current_x + 1]
        && context.board[current_x + 1][current_y + 1]
        && context.board[current_x + 1][current_y + 1].piece
        && context.board[current_x + 1][current_y + 1].piece !== null
        && context.board[current_x + 1][current_y + 1].piece.owner !== context.current_player)
        result.push({
          x: [1, 2],
          y: (x) => [1, 2]
        })
      if (
        context.board[current_x - 1]
        && context.board[current_x - 1][current_y + 1]
        && context.board[current_x - 1][current_y + 1].piece
        && context.board[current_x - 1][current_y + 1].piece !== null
        && context.board[current_x - 1][current_y + 1].piece.owner !== context.current_player)
        result.push({
          x: [-1, 0],
          y: (x) => [1, 2]
        })
      return result
    },
    representation: {
      img: "",
      letter: "P"
    }
  }
}