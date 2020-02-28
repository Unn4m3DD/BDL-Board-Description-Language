
import renderer from "./renderer.js";
const { generate_table, render } = renderer
import initial_status from "./initial_status.js";
import gameLogic from "./gameLogic.js";
const { create_context_from_initial_status } = gameLogic
const context = create_context_from_initial_status(initial_status)


let table = generate_table("board", initial_status.height, initial_status.width);

render(context, table)