const sleep = (milliseconds) => {
  return new Promise(resolve => setTimeout(resolve, milliseconds))
}
export default async (context, table) => {
  console.log(context.board)
  let v1 = 2
  let v2 = 3
  let v3 = v2 + v1
  let v4 = context.height - v3
  let v5 = context.height - v3 - 1
  let v6 = 1
  // move([1, height - a + b],[1, height - a + b - 1])
  try {
    table[v6][v4].onclick();
    render(context, table)
    table[v6][v5].onclick();
    render(context, table)
    await sleep(1000);
  } catch (e) {

  }
}