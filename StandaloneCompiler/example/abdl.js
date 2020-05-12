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
  let v0 = new ABDLVar(0);
  let v1 = new ABDLVar(2);
  let v2 = new ABDLVar(10);
  for (let v3 of range(v1, v2)) {
    if (isPrime(v3).getValue() != 0) {
      console.log(v3.toString());
    }
  }
}
function isPrime(v4) {
  let v5 = v4.div(new ABDLVar(2));
  for (let v6 of range(new ABDLVar(2), v5)) {
    let v8 = v4.rem(v6);
    let v7 = v8.equal(new ABDLVar(0));
    if (v7.getValue() != 0) {
      return new ABDLVar(0);
    }
  }
  return new ABDLVar(1);
}
