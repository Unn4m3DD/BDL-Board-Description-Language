import ABDLVar from "./AbdlVar.js"
const sleep = (milliseconds) => {
  return new Promise(resolve => setTimeout(resolve, milliseconds))
}
const range = (a, b) => {
  const result = [];
  for (let i = a; i <= b; i++) result.push(i);
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
  let v2 = new ABDLVar(10);
  let v1 = v0.less_than(v2);
  let v4 = new ABDLVar(1);
  while (v1.getValue() != 0) {
    if (new ABDLVar(isPrime(v0)).getValue() != 0) {
      console.log(v0.toString());
    }
    let v3 = v0.add(v4);
    v0 = v3;
    v1 = v0.less_than(v2);
  }
}
function isPrime(v5) {
  let v7 = v5.div(new ABDLVar(2));
  let v6 = new ABDLVar(2).less_than(v7);
  while (v6.getValue() != 0) {
    let v9 = v5.rem(new ABDLVar(2));
    let v8 = v9.equal(new ABDLVar(0));
    if (v8.getValue() != 0) {
      return new ABDLVar(0);
    }
    let v10 = v7.add(new ABDLVar(1));
    v10 = new ABDLVar(2);
    v6 = v10.less_than(v7);
  }
  return new ABDLVar(1);
}
