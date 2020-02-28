export default {
  width: 8,
  height: 8,
  pieces: {
    king: {
      mirrored: true,
      positions: [{
        x: 4, y: 0,
      }]
    },
    queen: {
      mirrored: true,
      positions: [{
        x: 3, y: 0,
      }]
    },
    bishop: {
      mirrored: true,
      positions: [
        { x: 2, y: 0 },
        { x: 5, y: 0 },
      ]
    },
    horse: {
      mirrored: true,
      positions: [
        { x: 1, y: 0 },
        { x: 6, y: 0 },
      ]
    },
    tower: {
      mirrored: true,
      positions: [
        { x: 0, y: 0 },
        { x: 7, y: 0 },
      ]
    },
    pawn: {
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