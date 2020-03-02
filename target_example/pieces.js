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
  tower: {
    moves: ({ current_x, current_y, context }) => [
      {
        x: [1, 8],
        y: (x) => [0, 1],
        killing: true
      },
      {
        x: [-8, 0],
        y: (x) => [0, 1],
        killing: true
      },
      {
        x: [0, 1],
        y: (x) => [1, 8],
        killing: true
      },
      {
        x: [0, 1],
        y: (x) => [-8, 0],
        killing: true
      }
    ],
    on_end_reached: (context, current_x, current_y) => { },
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
        x: [-1, 0],
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
        y: (x) => [-2, -1],
        killing: true
      },
    ],
    on_end_reached: (context, current_x, current_y) => { },
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
        y: (x) => [x, x + 1],
        killing: true
      },
      {
        x: [-8, 0],
        y: (x) => [x, x + 1],
        killing: true
      },
      {
        x: [1, 8],
        y: (x) => [-x, -x + 1],
        killing: true
      },
      {
        x: [-8, 0],
        y: (x) => [-x, -x + 1],
        killing: true
      },
    ],
    on_end_reached: (context, current_x, current_y) => { },
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
        y: (x) => [0, 1],
        killing: true
      },
      {
        x: [1, 2],
        y: (x) => [1, 2],
        killing: true
      },
      {
        x: [1, 2],
        y: (x) => [-1, 0],
        killing: true
      },
      {
        x: [-1, 0],
        y: (x) => [0, 1],
        killing: true
      },
      {
        x: [-1, 0],
        y: (x) => [1, 2],
        killing: true
      },
      {
        x: [-1, 0],
        y: (x) => [-1, 0],
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
    ],
    on_end_reached: (context, current_x, current_y) => { },
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
        y: (x) => [0, 1],
        killing: true
      },
      {
        x: [-8, 0],
        y: (x) => [0, 1],
        killing: true
      },
      {
        x: [0, 1],
        y: (x) => [1, 8],
        killing: true
      },
      {
        x: [0, 1],
        y: (x) => [-8, 0],
        killing: true
      },
      {
        x: [1, 8],
        y: (x) => [x, x + 1],
        killing: true
      },
      {
        x: [-8, 0],
        y: (x) => [x, x + 1],
        killing: true
      },
      {
        x: [1, 8],
        y: (x) => [-x, -x + 1],
        killing: true
      },
      {
        x: [-8, 0],
        y: (x) => [-x, -x + 1],
        killing: true
      }
    ],
    on_end_reached: (context, current_x, current_y) => { },
    can_jump: false,
    representation: {
      img: "",
      letter: "Q"
    }
  },
  pawn: {
    moves: ({ current_x, current_y, context }) => {
      const mirrored = context.board[current_x][current_y].piece.mirrored
      let result = [
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
        }
      ]
      if (mirrored)
        reverse(result)
      /*
      if ((!mirrored && current_y === 1)
        || (mirrored && current_y === context.height - 2))
        result = [{
          x: [0, 1],
          y: (x) => [1, 3],
          killing: false
        }]
      if (
        context.board[current_x + 1]
        && context.board[current_x + 1][current_y + (mirrored ? -1 : 1)]
        && context.board[current_x + 1][current_y + (mirrored ? -1 : 1)].piece
        && context.board[current_x + 1][current_y + (mirrored ? -1 : 1)].piece !== null
        && context.board[current_x + 1][current_y + (mirrored ? -1 : 1)].piece.owner !== context.board[current_x][current_y].owner) {
        result.push({
          x: [1, 2],
          y: (x) => [1, 2],
          killing: true
        })
      }
      if (
        context.board[current_x - 1]
        && context.board[current_x - 1][current_y + (mirrored ? -1 : 1)]
        && context.board[current_x - 1][current_y + (mirrored ? -1 : 1)].piece
        && context.board[current_x - 1][current_y + (mirrored ? -1 : 1)].piece !== null
        && context.board[current_x - 1][current_y + (mirrored ? -1 : 1)].piece.owner !== context.board[current_x][current_y].owner)
        result.push({
          x: [-1, 0],
          y: (x) => [1, 2],
          killing: true
        })
      */
      return result
    },
    on_end_reached: (context, current_x, current_y) => {
      let response = ""
      while (!pieces[response]) {
        let msg = "Select one: "
        let sep = ""
        for (let i in pieces) {
          msg += sep + i
          sep = ", "
        }
        response = prompt(msg)
      }
      console.log(context.board)
      context.board[current_x][current_y].piece.name = response
    },
    can_jump: false,
    representation: {
      img: "",
      letter: "P"
    }
  }
}

export default pieces
