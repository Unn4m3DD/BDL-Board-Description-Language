import ABDLVar from "./AbdlVar.js"
const sleep = (milliseconds) => {
  return new Promise(resolve => setTimeout(resolve, milliseconds))
}
const range = (a, b) => {
  const result = [];
  for (let i = a.getValue(); i <= b.getValue(); i++) result.push(new ABDLVar(i));
  return result;
}
const move = async (origin, destination, table, render, context) => {
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
const can_move = (origin, destination, table, render, context) => {
  if (!table[origin.getValue()[0]][origin.getValue()[1]].onclick) return new ABDLVar(0);
  table[origin.getValue()[0]][origin.getValue()[1]].onclick();
  render(context, table)
  if (!!table[destination.getValue()[0]][destination.getValue()[1]].onclick)
    return new ABDLVar(1);
  else
    return new ABDLVar(0);
}
export default async (context, table, render) => {
  let v0 = new ABDLVar(context.current_player);
  console.log(v0.toString());
  let v2 = new ABDLVar(1);
  let v4 = new ABDLVar(context.width);
  let v5 = new ABDLVar(2);
  let v3 = v4.sub(v5);
  let v1 = new ABDLVar([v2, v3]);
  let v7 = new ABDLVar(1);
  let v9 = new ABDLVar(context.width);
  let v10 = new ABDLVar(3);
  let v8 = v9.sub(v10);
  let v6 = new ABDLVar([v7, v8]);
  console.log((await move(v1, v6, table, render, context)).toString());
}
