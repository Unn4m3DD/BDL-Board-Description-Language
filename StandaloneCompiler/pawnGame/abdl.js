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
  let v8 = new ABDLVar(0);
  let v10 = new ABDLVar(context.width);
  let v11 = new ABDLVar(1);
  let v9 = v10.sub(v11);
  let v7 = new ABDLVar([v8, v9]);
  let v13 = new ABDLVar(0);
  let v15 = new ABDLVar(context.width);
  let v16 = new ABDLVar(2);
  let v14 = v15.sub(v16);
  let v12 = new ABDLVar([v13, v14]);
  await move(v7, v12);
  let v18 = new ABDLVar(1000);
  let v17 = new ABDLVar( await f0(v18));
}
async function f0(v0){
  let v1 = new ABDLVar("its not you bra <3");
  console.log(v1.toString());
  let v3 = new ABDLVar(2);
  let v4 = new ABDLVar(0);
  let v2 = v3.equal(v4);
  if (v2.getValue() != 0) {
     let v5 = new ABDLVar(2);
     let v6 = v5;
  }
}