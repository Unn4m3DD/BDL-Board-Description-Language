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
    await sleep(1000);
    table[destination.getValue()[0]][destination.getValue()[1]].onclick();
    render(context, table)
    return new ABDLVar(1);
  } catch (e) {
    return new ABDLVar(0);
  }
}
const can_move = async (origin, destination) => {
  let result
  if (!table[origin.getValue()[0]][origin.getValue()[1]].onclick) return new ABDLVar(0);
  table[origin.getValue()[0]][origin.getValue()[1]].onclick();
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
  on_move: async (arg_context, arg_table, arg_render) => {
      let v61 = new ABDLVar(context.current_player);
      let v62 = new ABDLVar(1);
      let v60 = v61.equal(v62);
      if (v60.getValue() != 0) {
         let v63 = new ABDLVar();
         return v63;
      }
      let v64 = new ABDLVar( await f0());
    },
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
    let v59 = new ABDLVar( await f0());
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
  let v10 = new ABDLVar(context.width);
  let v11 = new ABDLVar(1);
  let v9 = v10.sub(v11);
  for(let v12 of range(v8,v9)) {
    let v13 = new ABDLVar(0);
    let v15 = new ABDLVar(context.height);
    let v16 = new ABDLVar(1);
    let v14 = v15.sub(v16);
    for(let v17 of range(v13,v14)) {
      let v19 = new ABDLVar([v12, v17]);
      let v20 = new ABDLVar(0);
      let v18 = (getOwner(v19)).equal(v20);
      if (v18.getValue() != 0) {
         let v21 = new ABDLVar([v12, v17]);
         let v22 = (await f1(v21));
         console.log(v22.toString());
         console.log(v7.toString());
         let v24 = new ABDLVar([v12, v17]);
         let v25 = new ABDLVar([v12, v17]);
         let v23 = (await f2(v22, v24)).greater_than((await f2(v7, v25)));
         if (v23.getValue() != 0) {
            let v26 = new ABDLVar([v12, v17]);
            v3 = v26;
            v7 = v22;
         }
      }
    }
  }
  let v27 = v3.not_equal(v7);
  if (v27.getValue() != 0) {
     let v28 = v3.add(v7);
     await move(v3, v28);
  }
}
async function f1(v29){
  let v30 = v29;
  let v31 = new ABDLVar(0);
  let v32 = new ABDLVar(2);
  for(let v33 of range(v31,v32)) {
    let v34 = new ABDLVar(-2);
    let v35 = new ABDLVar(0);
    for(let v36 of range(v34,v35)) {
      let v37 = new ABDLVar([v33, v36]);
      if ((await can_move(v29, v37)).getValue() != 0) {
         let v39 = new ABDLVar([v33, v36]);
         let v38 = (await f2(v39, v29)).greater_than((await f2(v30, v29)));
         if (v38.getValue() != 0) {
            let v41 = new ABDLVar([v33, v36]);
            let v40 = v41.sub(v29);
            v30 = v40;
         }
      }
    }
  }
  return v30;
}
async function f2(v42, v43){
  let v48 = new ABDLVar(0);
  let v47 = new ABDLVar(v42.getValue()[v48.getValue()]);
  let v50 = new ABDLVar(0);
  let v49 = new ABDLVar(v43.getValue()[v50.getValue()]);
  let v46 = v47.sub(v49);
  let v51 = new ABDLVar(2);
  let v45 = v46.pow(v51);
  let v55 = new ABDLVar(1);
  let v54 = new ABDLVar(v42.getValue()[v55.getValue()]);
  let v57 = new ABDLVar(1);
  let v56 = new ABDLVar(v43.getValue()[v57.getValue()]);
  let v53 = v54.sub(v56);
  let v58 = new ABDLVar(2);
  let v52 = v53.pow(v58);
  let v44 = v45.add(v52);
  return v44;
}