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
    await sleep(50);
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
  let v1 = v0;
  let v3 = new ABDLVar(0);
  let v2 = v1.equal(v3);
  while (v2.getValue() != 0) {
    let v4 = new ABDLVar(1);
    v1 = v4;
    let v5 = new ABDLVar(0);
    let v7 = new ABDLVar(context.width);
    let v8 = new ABDLVar(2);
    let v6 = v7.sub(v8);
    for(let v9 of range(v5,v6)) {
      let v12 = new ABDLVar(1);
      let v11 = v9.add(v12);
      let v10 = (await get(v9)).less_than((await get(v11)));
      if (v10.getValue() != 0) {
         console.log(v9.toString());
         let v15 = new ABDLVar(1);
         let v14 = v9.add(v15);
         let v13 = new ABDLVar( await swap(v9, v14));
         let v16 = new ABDLVar(0);
         v1 = v16;
      }
    }
    v3 = new ABDLVar(0);
    v2 = v1.equal(v3);

  }
}
async function get(v17){
  let v19 = new ABDLVar(context.height);
  let v18 = v19.sub(new ABDLVar(1));
  for(let v20 of range(new ABDLVar(0),v18)) {
    let v22 = new ABDLVar([v17, v20]);
    let v23 = new ABDLVar("");
    let v21 = (getName(v22)).not_equal(v23);
    if (v21.getValue() != 0) {
       return v20;
    }
  }
}
async function swap(v24, v25){
  let v26 = (await get(v24));
  let v27 = (await get(v25));
  let v28 = new ABDLVar([v24, v26]);
  let v29 = new ABDLVar([v24, v27]);
  await move(v28, v29);
  let v30 = new ABDLVar([v25, v27]);
  let v31 = new ABDLVar([v25, v26]);
  await move(v30, v31);
}