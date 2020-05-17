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
  let v0 = new ABDLVar(1);
  console.log(fact(v0).toString());
  let v1 = new ABDLVar(2);
  console.log(fact(v1).toString());
  let v2 = new ABDLVar(3);
  console.log(fact(v2).toString());
  let v3 = new ABDLVar(4);
  console.log(fact(v3).toString());
  let v4 = new ABDLVar(5);
  console.log(fact(v4).toString());
}
function fact(v5){
  let v6 = v5.equal(new ABDLVar(1));
  if (v6.getValue() != 0) {
     return new ABDLVar(1);
  }
  let v8 = v5.sub(new ABDLVar(1));
  let v7 = fact(v8).mul(v5);
  return v7;
}