
import renderer from "./renderer.js";
const { generate_table, render } = renderer
import initial_status from "./initial_status.js";
import gameLogic from "./gameLogic.js";
import rules from "./rules.js"
const { create_context_from_initial_status_and_rules } = gameLogic
const context = create_context_from_initial_status_and_rules(initial_status, rules)


let table = generate_table("board", rules.height, rules.width);

render(context, table)

import auto_bdl_plugin from "./abdl.js"
auto_bdl_plugin(context, table);