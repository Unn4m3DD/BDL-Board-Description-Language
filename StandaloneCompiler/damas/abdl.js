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
  try{
    if (!!table[destination.getValue()[0]][destination.getValue()[1]].onclick)
      return new ABDLVar(1);
    else
      return new ABDLVar(0);
  } catch(e){ return new ABDLVar(0) }
}
export default {
  on_move: async (arg_context, arg_table, arg_render) => {
      let v58 = new ABDLVar(context.current_player);
      let v59 = new ABDLVar(1);
      let v57 = v58.equal(v59);
      if (v57.getValue() != 0) {
         let v60 = new ABDLVar();
         return v60;
      }
      let v61 = new ABDLVar( await f0());
    },
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
    let v56 = new ABDLVar( await f0());
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
         let v23 = new ABDLVar([v14, v19]);
         let v24 = (await f1(v23));
         let v26 = new ABDLVar(0);
         let v25 = (await f2(v24)).greater_than(v26);
         if (v25.getValue() != 0) {
            let v27 = new ABDLVar([v14, v19]);
            v3 = v27;
            v7 = v24;
         }
      }
    }
  }
  console.log(v7.toString());
  let v28 = v3.not_equal(v7);
  if (v28.getValue() != 0) {
     let v29 = v3.add(v7);
     await move(v3, v29);
  }
}
async function f1(v30){
  let v32 = new ABDLVar(0);
  let v33 = new ABDLVar(0);
  let v31 = new ABDLVar([v32, v33]);
  let v34 = v31;
  let v35 = new ABDLVar(0);
  let v36 = new ABDLVar(2);
  for(let v37 of range(v35,v36)) {
    let v38 = new ABDLVar(0);
    let v39 = new ABDLVar(2);
    for(let v40 of range(v38,v39)) {
      let v42 = new ABDLVar([v37, v40]);
      let v41 = v30.add(v42);
      if ((await can_move(v30, v41)).getValue() != 0) {
         console.log(v30.toString());
         console.log(v40.toString());
         let v44 = new ABDLVar([v37, v40]);
         let v43 = v30.add(v44);
         console.log(v43.toString());
         let v45 = new ABDLVar([v37, v40]);
         v34 = v45;
      }
    }
  }
  return v34;
}
async function f2(v46){
  let v50 = new ABDLVar(0);
  let v49 = new ABDLVar(v46.getValue()[v50.getValue()]);
  let v51 = new ABDLVar(2);
  let v48 = v49.pow(v51);
  let v54 = new ABDLVar(1);
  let v53 = new ABDLVar(v46.getValue()[v54.getValue()]);
  let v55 = new ABDLVar(2);
  let v52 = v53.pow(v55);
  let v47 = v48.add(v52);
  return v47;
}