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
  try{
    return new ABDLVar(context.board[a.getValue()[0]][a.getValue()[1]].piece.name)
  } catch(e){
    return new ABDLVar("");
  }
}
const getOwner = (a) => {
  try{
    return new ABDLVar(context.board[a.getValue()[0]][a.getValue()[1]].piece.owner)
  } catch(e){
    return new ABDLVar(0);
  }
}
const move = async (origin, destination) => {
  try {
    table[origin.getValue()[0]][origin.getValue()[1]].onclick();
    render(context, table)
    await sleep(1000);
    table[destination.getValue()[0]][destination.getValue()[1]].onclick();
    render(context, table)
    return new ABDLVar(1);
  } catch (e) {
    return new ABDLVar(0);
  }
}
const can_move = (origin, destination) => {
  if (!table[origin.getValue()[0]][origin.getValue()[1]].onclick) return new ABDLVar(0);
  table[origin.getValue()[0]][origin.getValue()[1]].onclick();
  render(context, table)
  if (!!table[destination.getValue()[0]][destination.getValue()[1]].onclick)
    return new ABDLVar(1);
  else
    return new ABDLVar(0);
}
export default async (arg_context, arg_table, arg_render) => {
  context = arg_context;
  table = arg_table;
  render = arg_render;
  let v0 = new ABDLVar(0);
  let v2 = new ABDLVar(context.width);
  let v3 = new ABDLVar(1);
  let v1 = v2.sub(v3);
  for(let v4 of range(v0,v1)) {
    let v7 = new ABDLVar(" -> ");
    let v6 = v4.add(v7);
    let v5 = v6.add((get(v4)));
    console.log(v5.toString());
  }
}
function get(v8){
  let v10 = new ABDLVar(context.height);
  let v9 = v10.sub(new ABDLVar(1));
  for(let v11 of range(new ABDLVar(0),v9)) {
    let v13 = new ABDLVar([v8, v11]);
    let v14 = new ABDLVar("");
    let v12 = (getName(v13)).not_equal(v14);
    if (v12.getValue() != 0) {
       return v11;
    }
  }
}