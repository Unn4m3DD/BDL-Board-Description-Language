export default (width, height) => {
  let board = []
  for (let i = 0; i < width; i++) {
    board.push([])
    for (let j = 0; j < height; j++) {
      board[i].push({
        target: false,
        piece: null
      })
    }
  }
  return board
}