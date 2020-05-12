import ABDLVar from "./AbdlVar"
const sleep = (milliseconds) => {
  return new Promise(resolve => setTimeout(resolve, milliseconds))
}
const range = (a, b) => {
  const result = [];
  for (let i = a; i <= b; i++) result.push(i);
  return result;
}
const move = (origin, destination, table) => {
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
const can_move = (origin, destination, table) => {
  if (!table[origin.getValue()[0]][origin.getValue()[1]]) return new ABDLVar(0);
  table[origin.getValue()[0]][origin.getValue()[1]].onclick();
  render(context, table)
  if (!!table[destination.getValue()[0]][destination.getValue()[1]].onclick)
    return new ABDLVar(1);
  else
    return new ABDLVar(0);
}
export default async (context, table) => {
  let v1 = 1;
  let v2 = 3
  let v3 = v2 + v1
  if (true) {
    let v1 = 3
    console.log(v1)
  }
  let v4 = context.height - v3
  let v5 = context.height - v3 - 1
  let v6 = 1
  // move([1, height - a + b],[1, height - a + b - 1], table)
  try {
    table[v6][v4].onclick();
    render(context, table)
    table[v6][v5].onclick();
    render(context, table)
    await sleep(1000);
  } catch (e) {

  }
}
