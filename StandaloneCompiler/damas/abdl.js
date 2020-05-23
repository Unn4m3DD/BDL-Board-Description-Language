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
  on_move: async (arg_context, arg_table, arg_render) => {
      let v78 = new ABDLVar(context.current_player);
      let v79 = new ABDLVar(1);
      let v77 = v78.equal(v79);
      if (v77.getValue() != 0) {
         let v80 = new ABDLVar( await f0());
      }
    },
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
  }
}
async function f0(){
  let v1 = new ABDLVar(0);
  let v3 = new ABDLVar(context.height);
  let v4 = new ABDLVar(1);
  let v2 = v3.sub(v4);
  let v0 = new ABDLVar([v1, v2]);
  let v5 = v0;
  let v8 = new ABDLVar(context.width);
  let v9 = new ABDLVar(1);
  let v7 = v8.sub(v9);
  let v10 = new ABDLVar(0);
  let v6 = new ABDLVar([v7, v10]);
  let v11 = v6;
  let v14 = new ABDLVar(context.width);
  let v15 = new ABDLVar(1);
  let v13 = v14.sub(v15);
  let v16 = new ABDLVar(0);
  let v12 = new ABDLVar([v13, v16]);
  let v17 = v12;
  let v18 = new ABDLVar(0);
  let v20 = new ABDLVar(context.width);
  let v21 = new ABDLVar(1);
  let v19 = v20.sub(v21);
  for(let v22 of range(v18,v19)) {
    let v23 = new ABDLVar(0);
    let v25 = new ABDLVar(context.height);
    let v26 = new ABDLVar(1);
    let v24 = v25.sub(v26);
    for(let v27 of range(v23,v24)) {
      let v29 = new ABDLVar([v22, v27]);
      let v30 = new ABDLVar(1);
      let v28 = (getOwner(v29)).equal(v30);
      if (v28.getValue() != 0) {
         let v31 = new ABDLVar([v22, v27]);
         let v32 = (await f1(v31, v5));
         let v33 = (await f2(v32, v5)).less_than((await f2(v11, v5)));
         if (v33.getValue() != 0) {
            v11 = v32;
            let v34 = new ABDLVar([v22, v27]);
            v17 = v34;
         }
      }
    }
  }
  await move(v17, v11);
}
async function f1(v35, v36){
  let v39 = new ABDLVar(context.width);
  let v40 = new ABDLVar(1);
  let v38 = v39.sub(v40);
  let v41 = new ABDLVar(0);
  let v37 = new ABDLVar([v38, v41]);
  let v42 = v37;
  let v43 = new ABDLVar(-2);
  let v44 = new ABDLVar(2);
  for(let v45 of range(v43,v44)) {
    let v46 = new ABDLVar(-2);
    let v47 = new ABDLVar(2);
    for(let v48 of range(v46,v47)) {
      let v50 = new ABDLVar([v45, v48]);
      let v49 = v35.add(v50);
      if ((await can_move(v35, v49)).getValue() != 0) {
         let v53 = new ABDLVar([v45, v48]);
         let v52 = v35.add(v53);
         let v51 = (await f2(v52, v36)).less_than((await f2(v42, v36)));
         if (v51.getValue() != 0) {
            let v56 = new ABDLVar([v45, v48]);
            let v55 = v35.add(v56);
            let v54 = (await f2(v55, v36)).less_than((await f2(v35, v36)));
            if (v54.getValue() != 0) {
               let v58 = new ABDLVar([v45, v48]);
               let v57 = v35.add(v58);
               v42 = v57;
            }
         }
      }
    }
  }
  return v42;
}
async function f2(v59, v60){
  let v64 = new ABDLVar(0);
  let v63 = new ABDLVar(v59.getValue()[v64.getValue()]);
  let v66 = new ABDLVar(0);
  let v65 = new ABDLVar(v60.getValue()[v66.getValue()]);
  let v62 = v63.sub(v65);
  let v69 = new ABDLVar(1);
  let v68 = new ABDLVar(v59.getValue()[v69.getValue()]);
  let v71 = new ABDLVar(1);
  let v70 = new ABDLVar(v60.getValue()[v71.getValue()]);
  let v67 = v68.sub(v70);
  let v61 = (await f3(v62)).add((await f3(v67)));
  return v61;
}
async function f3(v72){
  let v74 = new ABDLVar(0);
  let v73 = v72.greater_than(v74);
  if (v73.getValue() != 0) {
     return v72;
  }
  else {
     let v76 = new ABDLVar(0);
     let v75 = v76.sub(v72);
     return v75;
  }
}