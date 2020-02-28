export default {
  tower: {
    moves: ({ x, y, context }) => [
      {
        x: [1, 8],
        y: (x) => [0, 0]
      },
      {
        x: [-8, -1],
        y: (x) => [0, 0]
      },
      {
        x: [0, 0],
        y: (x) => [1, 8]
      },
      {
        x: [0, 0],
        y: (x) => [-8, -1]
      }
    ],
    representation: {
      img: "",
      letter: "T"
    }
  },

  horse: {
    moves: ({ x, y, context }) => [
      {
        x: [3, 3],
        y: (x) => [1, 1]
      },
      {
        x: [3, 3],
        y: (x) => [-1, -1]
      },
      {
        x: [-3, -3],
        y: (x) => [1, 1]
      },
      {
        x: [-3, -3],
        y: (x) => [-1, -1]
      },
      {
        x: [1, 1],
        y: (x) => [3, 3],
      },
      {
        x: [-1, -1],
        y: (x) => [3, 3],
      },
      {
        x: [1, 1],
        y: (x) => [-3, -3],
      },
      {
        x: [-1, -1],
        y: (x) => [-3, -3],
      },
    ],
    representation: {
      img: "",
      letter: "H"
    }
  },
  bishop: {
    moves: ({ x, y, context }) => [
      {
        x: [1, 8],
        y: (x) => [x, x]
      },
      {
        x: [-1, -8],
        y: (x) => [x, x]
      },
      {
        x: [1, 8],
        y: (x) => [-x, -x]
      },
      {
        x: [-1, -8],
        y: (x) => [-x, -x]
      },
    ],
    representation: {
      img: "",
      letter: "B"
    }
  },
  king: {
    moves: ({ x, y, context }) => [
      {
        x: [1, 1],
        y: (x) => [-1, 1]
      },
      {
        x: [-1, -1],
        y: (x) => [-1, 1]
      },
      {
        x: [0, 0],
        y: (x) => [1, 1]
      },
      {
        x: [0, 0],
        y: (x) => [-1, -1]
      },
    ],
    representation: {
      img: "",
      letter: "K"
    }
  },
  queen: {
    moves: ({ x, y, context }) => [
      {
        x: [1, 8],
        y: (x) => [0, 0]
      },
      {
        x: [-8, -1],
        y: (x) => [0, 0]
      },
      {
        x: [0, 0],
        y: (x) => [1, 8]
      },
      {
        x: [0, 0],
        y: (x) => [-8, -1]
      },
      {
        x: [1, 8],
        y: (x) => [x, x]
      },
      {
        x: [-1, -8],
        y: (x) => [x, x]
      },
      {
        x: [1, 8],
        y: (x) => [-x, -x]
      },
      {
        x: [-1, -8],
        y: (x) => [-x, -x] 
      }
    ],
    representation: {
      img: "",
      letter: "Q"
    }
  },
  pawn: {
    moves: ({ x, y, context }) => {
      let result = [
        {
          x: [0, 0],
          y: (x) => [1, 1]
        }
      ]
      if (y === 1)
        result.push({
          x: [0, 0],
          y: (x) => [2, 2]
        })
      if (context.board[x + 1][y + 1].piece !== null
        && context.board[x + 1][y + 1].piece.owner !== context.current_player)
        result.push({
          x: [1, 1],
          y: (x) => [1, 1]
        })
      if (context.board[x - 1][y + 1].piece !== null
        && context.board[x - 1][y + 1].piece.owner !== context.current_player)
        result.push({
          x: [-1, -1],
          y: (x) => [1, 1]
        })
    },
    representation: {
      img: "",
      letter: "P"
    }
  }
}