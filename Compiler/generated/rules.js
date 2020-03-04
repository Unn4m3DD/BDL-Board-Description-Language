export default {
  first_player: 0,
  width: 8,
  height: 8,
  board_coloring_rule: (x, y, last_color) => {
    if (y === 0) last_color = last_color === "#ffffff" ? "#c90" : "#ffffff"
    last_color = last_color === "#ffffff" ? "#c90" : "#ffffff"
    return last_color
  },
}
