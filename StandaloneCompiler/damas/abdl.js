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
export default {
  on_move: async (arg_context, arg_table, arg_render) => {
      let v0 = new ABDLVar(0);
      let v2 = new ABDLVar(context.width);
      let v3 = new ABDLVar(1);
      let v1 = v2.sub(v3);
      for(let v4 of range(v0,v1)) {
        let v5 = new ABDLVar(0);
        let v7 = new ABDLVar(context.height);
        let v8 = new ABDLVar(1);
        let v6 = v7.sub(v8);
        for(let v9 of range(v5,v6)) {
          let v11 = new ABDLVar([v4, v9]);
          let v12 = new ABDLVar("D1");
          let v10 = (getName(v11)).equal(v12);
          if (v10.getValue() != 0) {
             let v15 = new ABDLVar(", ");
             let v14 = v4.add(v15);
             let v13 = v14.add(v9);
             console.log(v13.toString());
          }
        }
      }
    },
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
  }
}
