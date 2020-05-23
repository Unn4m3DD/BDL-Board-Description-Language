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
      let v52 = new ABDLVar(context.current_player);
      let v53 = new ABDLVar(1);
      let v51 = v52.equal(v53);
      if (v51.getValue() != 0) {
         let v54 = new ABDLVar();
         return v54;
      }
      let v55 = new ABDLVar( await f0());
    },
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
    let v50 = new ABDLVar( await f0());
  }
}
async function f0(){
  let v1 = new ABDLVar(0);
  let v2 = new ABDLVar(0);
  let v0 = new ABDLVar([v1, v2]);
  let v3 = v0;
  let v5 = new ABDLVar(0);
  let v6 = new ABDLVar(0);
  let v4 = new ABDLVar([v5, v6]);
  let v7 = v4;
  let v8 = new ABDLVar(0);
  let v9 = v8;
  let v10 = new ABDLVar(0);
  let v12 = new ABDLVar(context.width);
  let v13 = new ABDLVar(1);
  let v11 = v12.sub(v13);
  for(let v14 of range(v10,v11)) {
    let v15 = new ABDLVar(0);
    let v17 = new ABDLVar(context.height);
    let v18 = new ABDLVar(1);
    let v16 = v17.sub(v18);
    for(let v19 of range(v15,v16)) {
      let v21 = new ABDLVar([v14, v19]);
      let v22 = new ABDLVar(0);
      let v20 = (getOwner(v21)).equal(v22);
      if (v20.getValue() != 0) {
         let v24 = new ABDLVar([v14, v19]);
         let v23 = (await null((await null(v24)))).greater_than(v9);
         if (v23.getValue() != 0) {
            let v25 = new ABDLVar([v14, v19]);
            v3 = v25;
            let v26 = new ABDLVar([v14, v19]);
            v7 = (await null(v26));
         }
      }
    }
  }
  let v27 = v3.not_equal(v7);
  if (v27.getValue() != 0) {
     await move(v3, v7);
  }
}
async function f1(v28){
  let v30 = new ABDLVar(0);
  let v31 = new ABDLVar(0);
  let v29 = new ABDLVar([v30, v31]);
  let v32 = v29;
  let v33 = new ABDLVar(0);
  let v34 = new ABDLVar(2);
  for(let v35 of range(v33,v34)) {
    let v36 = new ABDLVar(0);
    let v37 = new ABDLVar(2);
    for(let v38 of range(v36,v37)) {
      let v40 = new ABDLVar([v35, v38]);
      let v39 = v28.add(v40);
      if ((await null(v28, v39)).getValue() != 0) {
         let v42 = v35.add(v38);
         let v41 = v42.greater_than(v32);
         if (v41.getValue() != 0) {
            let v43 = new ABDLVar([v35, v38]);
            v32 = v43;
         }
      }
    }
  }
  return v32;
}
async function f2(v44){
  let v48 = new ABDLVar(0);
  let v47 = new ABDLVar(v44.getValue()[v48]);
  let v46 = v47.add(v44);
  let v49 = new ABDLVar(1);
  let v45 = new ABDLVar(v46.getValue()[v49]);
  return v45;
}