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
      let v64 = new ABDLVar(context.current_player);
      let v65 = new ABDLVar(1);
      let v63 = v64.equal(v65);
      if (v63.getValue() != 0) {
         let v66 = new ABDLVar();
         return v66;
      }
      let v67 = new ABDLVar( await f0());
    },
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
    let v62 = new ABDLVar( await f0());
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
         let v25 = (await f2(v24)).greater_than((await f2(v7)));
         if (v25.getValue() != 0) {
            let v26 = new ABDLVar([v14, v19]);
            v3 = v26;
            v7 = v24;
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
  let v31 = new ABDLVar(0);
  let v32 = new ABDLVar(0);
  let v30 = new ABDLVar([v31, v32]);
  let v33 = v30;
  let v34 = new ABDLVar(0);
  let v35 = new ABDLVar(2);
  for(let v36 of range(v34,v35)) {
    let v37 = new ABDLVar(-2);
    let v38 = new ABDLVar(0);
    for(let v39 of range(v37,v38)) {
      let v42 = new ABDLVar("->");
      let v41 = v29.add(v42);
      let v44 = new ABDLVar([v36, v39]);
      let v43 = v29.add(v44);
      let v40 = v41.add(v43);
      console.log(v40.toString());
      let v46 = new ABDLVar([v36, v39]);
      let v45 = v29.add(v46);
      console.log((await can_move(v29, v45)).toString());
      let v48 = new ABDLVar([v36, v39]);
      let v47 = v29.add(v48);
      if ((await can_move(v29, v47)).getValue() != 0) {
         let v50 = new ABDLVar([v36, v39]);
         let v49 = (await f2(v50)).greater_than((await f2(v33)));
         if (v49.getValue() != 0) {
            let v51 = new ABDLVar([v36, v39]);
            v33 = v51;
         }
      }
    }
  }
  return v33;
}
async function f2(v52){
  let v56 = new ABDLVar(0);
  let v55 = new ABDLVar(v52.getValue()[v56.getValue()]);
  let v57 = new ABDLVar(2);
  let v54 = v55.pow(v57);
  let v60 = new ABDLVar(1);
  let v59 = new ABDLVar(v52.getValue()[v60.getValue()]);
  let v61 = new ABDLVar(2);
  let v58 = v59.pow(v61);
  let v53 = v54.add(v58);
  return v53;
}