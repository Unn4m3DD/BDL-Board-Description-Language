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
      let v63 = new ABDLVar("player");
      let v64 = new ABDLVar(context.current_player);
      let v62 = v63.add(v64);
      console.log(v62.toString());
    },
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
    let v1 = new ABDLVar(4);
    let v3 = new ABDLVar(context.height);
    let v4 = new ABDLVar(2);
    let v2 = v3.sub(v4);
    let v0 = new ABDLVar([v1, v2]);
    let v6 = new ABDLVar(4);
    let v8 = new ABDLVar(context.height);
    let v9 = new ABDLVar(4);
    let v7 = v8.sub(v9);
    let v5 = new ABDLVar([v6, v7]);
    await move(v0, v5);
    let v11 = new ABDLVar(4);
    let v12 = new ABDLVar(1);
    let v10 = new ABDLVar([v11, v12]);
    let v14 = new ABDLVar(4);
    let v15 = new ABDLVar(3);
    let v13 = new ABDLVar([v14, v15]);
    await move(v10, v13);
    let v17 = new ABDLVar(3);
    let v19 = new ABDLVar(context.height);
    let v20 = new ABDLVar(1);
    let v18 = v19.sub(v20);
    let v16 = new ABDLVar([v17, v18]);
    let v23 = new ABDLVar(context.width);
    let v24 = new ABDLVar(1);
    let v22 = v23.sub(v24);
    let v25 = new ABDLVar(3);
    let v21 = new ABDLVar([v22, v25]);
    await move(v16, v21);
    let v27 = new ABDLVar(1);
    let v28 = new ABDLVar(0);
    let v26 = new ABDLVar([v27, v28]);
    let v30 = new ABDLVar(2);
    let v31 = new ABDLVar(2);
    let v29 = new ABDLVar([v30, v31]);
    await move(v26, v29);
    let v33 = new ABDLVar(5);
    let v35 = new ABDLVar(context.height);
    let v36 = new ABDLVar(1);
    let v34 = v35.sub(v36);
    let v32 = new ABDLVar([v33, v34]);
    let v38 = new ABDLVar(2);
    let v40 = new ABDLVar(context.height);
    let v41 = new ABDLVar(4);
    let v39 = v40.sub(v41);
    let v37 = new ABDLVar([v38, v39]);
    await move(v32, v37);
    let v44 = new ABDLVar(context.width);
    let v45 = new ABDLVar(2);
    let v43 = v44.sub(v45);
    let v46 = new ABDLVar(0);
    let v42 = new ABDLVar([v43, v46]);
    let v49 = new ABDLVar(context.width);
    let v50 = new ABDLVar(3);
    let v48 = v49.sub(v50);
    let v51 = new ABDLVar(2);
    let v47 = new ABDLVar([v48, v51]);
    await move(v42, v47);
    let v54 = new ABDLVar(context.width);
    let v55 = new ABDLVar(1);
    let v53 = v54.sub(v55);
    let v56 = new ABDLVar(3);
    let v52 = new ABDLVar([v53, v56]);
    let v59 = new ABDLVar(context.width);
    let v60 = new ABDLVar(3);
    let v58 = v59.sub(v60);
    let v61 = new ABDLVar(1);
    let v57 = new ABDLVar([v58, v61]);
    await move(v52, v57);
  }
}
