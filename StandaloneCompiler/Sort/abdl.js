import ABDLVar from "./AbdlVar.js"
var context;
var table;
var render;
const sleep = (milliseconds) => {
  return new Promise(resolve => setTimeout(resolve, milliseconds))
}
const range = (a, b) => {
  const result = [];
  for (let i = a.getValue(); i <= b.getValue(); i++) result.push(new ABDLVar(i));
  return result;
}
const getName = (a) => {
  try {
    return new ABDLVar(context.board[a.getValue()[0]][a.getValue()[1]].piece.name)
  } catch (e) {
    return new ABDLVar("");
  }
}
const getOwner = (a) => {
  try {
    return new ABDLVar(context.board[a.getValue()[0]][a.getValue()[1]].piece.owner)
  } catch (e) {
    return new ABDLVar(-1);
  }
}
const move = async (origin, destination) => {
  try {
    table[origin.getValue()[0]][origin.getValue()[1]].onclick();
    render(context, table)
    await sleep(10);
    table[destination.getValue()[0]][destination.getValue()[1]].onclick();
    render(context, table)
    return new ABDLVar(1);
  } catch (e) {
    return new ABDLVar(0);
  }
}
const can_move = async (origin, destination) => {
  let result
  try{
    if (!table[origin.getValue()[0]][origin.getValue()[1]].onclick) return new ABDLVar(0);
      table[origin.getValue()[0]][origin.getValue()[1]].onclick();
  } catch(e) { return new ABDLVar(0); }
  render(context, table)
  try {
    if (
      table[destination.getValue()[0]][destination.getValue()[1]].style.backgroundColor ==
      "rgb(100, 200, 100)"
    )//rgb(100, 200, 100)
      result = new ABDLVar(1);
    else
      result = new ABDLVar(0);
  } catch (e) { result = new ABDLVar(0); }
  context.focused.x = -1;
  context.focused.y = -1;
  render(context, table);
  return result
}
export default {
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
    let v17 = new ABDLVar(0);
    let v18 = v17;
    let v20 = new ABDLVar(0);
    let v19 = v18.equal(v20);
    while (v19.getValue() != 0) {
      let v21 = new ABDLVar(1);
      v18 = v21;
      let v22 = new ABDLVar(0);
      let v24 = new ABDLVar(context.width);
      let v25 = new ABDLVar(2);
      let v23 = v24.sub(v25);
      for(let v26 of range(v22,v23)) {
        let v29 = new ABDLVar(1);
        let v28 = v26.add(v29);
        let v27 = (await f0(v26)).less_than((await f0(v28)));
        if (v27.getValue() != 0) {
           let v32 = new ABDLVar(1);
           let v31 = v26.add(v32);
           let v30 = new ABDLVar( await f1(v26, v31));
           let v33 = new ABDLVar(0);
           v18 = v33;
        }
      }
      v20 = new ABDLVar(0);
      v19 = v18.equal(v20);

    }
  }
}
async function f0(v0){
  let v1 = new ABDLVar(0);
  let v3 = new ABDLVar(context.height);
  let v4 = new ABDLVar(1);
  let v2 = v3.sub(v4);
  for(let v5 of range(v1,v2)) {
    let v7 = new ABDLVar([v0, v5]);
    let v8 = new ABDLVar("");
    let v6 = (getName(v7)).not_equal(v8);
    if (v6.getValue() != 0) {
       return v5;
    }
  }
}
async function f1(v9, v10){
  let v11 = (await f0(v9));
  let v12 = (await f0(v10));
  let v13 = new ABDLVar([v9, v11]);
  let v14 = new ABDLVar([v9, v12]);
  await move(v13, v14);
  let v15 = new ABDLVar([v10, v12]);
  let v16 = new ABDLVar([v10, v11]);
  await move(v15, v16);
}