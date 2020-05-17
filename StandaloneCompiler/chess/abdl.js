import ABDLVar from "./AbdlVar.js"
const sleep = (milliseconds) => {
  return new Promise(resolve => setTimeout(resolve, milliseconds))
}
const range = (a, b) => {
  const result = [];
  for (let i = a.getValue(); i <= b.getValue(); i++) result.push(new ABDLVar(i));
  return result;
}
const move = async (origin, destination, table) => {
  try {
    table[origin.getValue()[0]][origin.getValue()[1]].onclick();
    render(context, table)
    table[destination.getValue()[0]][destination.getValue()[1]].onclick();
    render(context, table)
    await sleep(1000);
    return new ABDLVar(1);
  } catch (e) {
    return new ABDLVar(0);
  }
}
const can_move = async (origin, destination, table) => {
  if (!table[origin.getValue()[0]][origin.getValue()[1]]) return new ABDLVar(0);
  table[origin.getValue()[0]][origin.getValue()[1]].onclick();
  render(context, table)
  if (!!table[destination.getValue()[0]][destination.getValue()[1]].onclick)
    return new ABDLVar(1);
  else
    return new ABDLVar(0);
}
export default async (context, table) => {
  let v0 = new ABDLVar(context.current_player);
  console.log(v0.toString());
  let v2 = new ABDLVar(6);
  let v3 = new ABDLVar(0);
  let v1 = new ABDLVar([v2, v3]);
  let v5 = new ABDLVar(5);
  let v6 = new ABDLVar(0);
  let v4 = new ABDLVar([v5, v6]);
  console.log(can_move(v1, v4).toString());
  let v8 = new ABDLVar(6);
  let v9 = new ABDLVar(0);
  let v7 = new ABDLVar([v8, v9]);
  let v11 = new ABDLVar(5);
  let v12 = new ABDLVar(0);
  let v10 = new ABDLVar([v11, v12]);
    await move(v7, v10, table);
}
