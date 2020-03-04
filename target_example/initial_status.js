export default {
  pieces: {
    king: {
      owner: 0,
      mirrored: true,
      positions: [{
        x: 4, y: 0,
      }]
    },
    queen: {
      owner: 0,
      mirrored: true,
      positions: [{
        x: 3, y: 0,
      }]
    },
    bishop: {
      owner: 0,
      mirrored: true,
      positions: [
        { x: 2, y: 0 },
        { x: 5, y: 0 },
      ]
    },
    horse: {
      owner: 0,
      mirrored: true,
      positions: [
        { x: 1, y: 0 },
        { x: 6, y: 0 },
      ]
    },
    tower: {
      owner: 0,
      mirrored: true,
      positions: [
        { x: 0, y: 0 },
        { x: 7, y: 0 },
      ]
    },
    pawn: {
      owner: 0,
      mirrored: true,
      positions: [
        { x: 0, y: 1 },
        { x: 1, y: 1 },
        { x: 2, y: 1 },
        { x: 3, y: 1 },
        { x: 4, y: 1 },
        { x: 5, y: 1 },
        { x: 6, y: 1 },
        { x: 7, y: 1 },
      ]
    },
  }
}