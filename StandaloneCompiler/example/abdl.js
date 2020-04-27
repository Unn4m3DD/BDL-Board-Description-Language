const sleep = (milliseconds) => {
  return new Promise(resolve => setTimeout(resolve, milliseconds))
}

function $(string) {
  console.log(string)
}

export default async (context, table) => {
  $("td-menu")
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
