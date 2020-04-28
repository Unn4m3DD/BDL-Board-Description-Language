export default class AbdlVar {
  constructor(value) {
    if (typeof value == 'number')
      value = Math.floor(value);
    if (typeof value == 'object')
      value = [Math.floor(value[0]), Math.floor(value[1])];
    this.value = value;
  }
  add(other) { // '+'
    let e1 = this.getValue()
    let e2 = other.getValue()
    //int + int       ->  int
    if (this.getType() == 'number' && other.getType() == 'number')
      return new AbdlVar(e1 + e2);
    //int + string    ->  string
    if (this.getType() == 'number' && other.getType() == 'string')
      return new AbdlVar(e1 + "" + e2);
    //int + point    ->  point
    if (this.getType() == 'number' && other.getType() == 'object')
      return new AbdlVar([e1 + e2[0], e1 + e2[1]]);
    //string + int    ->  string
    if (this.getType() == 'string' && other.getType() == 'number')
      return new AbdlVar(e1 + "" + e2)
    //string + string ->  string
    if (this.getType() == 'string' && other.getType() == 'string')
      return new AbdlVar(e1 + e2)
    //string + point  ->  string
    if (this.getType() == 'string' && other.getType() == 'object')
      return new AbdlVar(e1 + "[" + e2 + "]")
    //point + int     ->  point
    if (this.getType() == 'object' && other.getType() == 'number')
      return new AbdlVar([e2 + e1[0], e2 + e1[1]])
    //point + string  ->  string
    if (this.getType() == 'object' && other.getType() == 'string')
      return new AbdlVar("[" + e1 + "]" + e2)
    //point + point   ->  point
    if (this.getType() == 'object' && other.getType() == 'object')
      return new AbdlVar([e1[0] + e2[0], e1[1] + e2[1]])
  }
  sub(other) { // '-'
    let e1 = this.getValue()
    let e2 = other.getValue()
    //int - int       ->  int
    if (this.getType() == 'number' && other.getType() == 'number')
      return new AbdlVar(e1 - e2);
    //int - point -> point    
    if (this.getType() == 'number' && other.getType() == 'object')
      return new AbdlVar([e1 - e2[0], e1 - e2[1]]);
    //point - int     ->  point
    if (this.getType() == 'object' && other.getType() == 'number')
      return new AbdlVar([e1[0] - e2, e1[1] - e2]);
    //point - point   ->  point
    if (this.getType() == 'object' && other.getType() == 'object')
      return new AbdlVar([e1[0] - e2[0], e1[1] - e2[1]]);
    return null;
  }
  mul(other) { // '*'
    let e1 = this.getValue()
    let e2 = other.getValue()
    //int * int   ->  int
    if (this.getType() == 'number' && other.getType() == 'number')
      return new AbdlVar(e1 * e2);
    //int * string ->  string
    if (this.getType() == 'number' && other.getType() == 'string')
      return new AbdlVar(e2.repeat(e1))
    //int * point -> point    
    if (this.getType() == 'number' && other.getType() == 'object')
      return new AbdlVar([e1 * e2[0], e1 * e2[1]]);
    //string * int    ->  string
    if (this.getType() == 'string' && other.getType() == 'number')
      return new AbdlVar(e1.repeat(e2))
    //point * int     ->  point
    if (this.getType() == 'object' && other.getType() == 'number')
      return new AbdlVar([e1[0] * e2, e1[1] * e2]);
    //point * point   ->  point
    if (this.getType() == 'object' && other.getType() == 'object')
      return new AbdlVar([e1[0] * e2[0], e1[1] * e2[1]]);
    return null;
  }
  div(other) { // '/'
    let e1 = this.getValue()
    let e2 = other.getValue()
    //int / int       ->  int
    if (this.getType() == 'number' && other.getType() == 'number')
      return new AbdlVar(e1 / e2);
    //int / point -> point    
    if (this.getType() == 'number' && other.getType() == 'object')
      return new AbdlVar([e1 / e2[0], e1 / e2[1]]);
    //point / int     ->  point
    if (this.getType() == 'object' && other.getType() == 'number')
      return new AbdlVar([e1[0] / e2, e1[1] / e2]);
    //point / point   ->  point
    if (this.getType() == 'object' && other.getType() == 'object')
      return new AbdlVar([e1[0] / e2[0], e1[1] / e2[1]]);
    return null;
  }
  rem(other) { // '%'
    let e1 = this.getValue()
    let e2 = other.getValue()
    //int % int       ->  int
    if (this.getType() == 'number' && other.getType() == 'number')
      return new AbdlVar(e1 % e2);
    //int % point -> point    
    if (this.getType() == 'number' && other.getType() == 'object')
      return new AbdlVar([e1 % e2[0], e1 % e2[1]]);
    //point % int     ->  point
    if (this.getType() == 'object' && other.getType() == 'number')
      return new AbdlVar([e1[0] % e2, e1[1] % e2]);
    //point % point   ->  point
    if (this.getType() == 'object' && other.getType() == 'object')
      return new AbdlVar([e1[0] % e2[0], e1[1] % e2[1]]);
  }
  less_than(other) { // '<'
    let e1 = this.getValue()
    let e2 = other.getValue()
    if (this.getType() == 'number' && other.getType() == 'number')
      return new AbdlVar(e1 < e2 ? 1 : 0);
  }
  greater_than(other) { // '>'
    let e1 = this.getValue()
    let e2 = other.getValue()
    if (this.getType() == 'number' && other.getType() == 'number')
      return new AbdlVar(e1 > e2 ? 1 : 0);
  }
  less_or_equal(other) { // '<='
    let e1 = this.getValue()
    let e2 = other.getValue()
    if (this.getType() == 'number' && other.getType() == 'number')
      return new AbdlVar(e1 <= e2 ? 1 : 0);
  }
  greater_or_equal(other) { // '>='
    let e1 = this.getValue()
    let e2 = other.getValue()
    if (this.getType() == 'number' && other.getType() == 'number')
      return new AbdlVar(e1 >= e2 ? 1 : 0);
  }
  equal(other) { // '=='
    let e1 = this.getValue()
    let e2 = other.getValue()
    if (this.getType() == 'number' && other.getType() == 'number'
      || this.getType() == 'string' && other.getType() == 'string'
      || this.getType() == 'object' && other.getType() == 'object')
      return new AbdlVar(e1 === e2 ? 1 : 0);
  }
  not_equal(other) { // '/='
    let e1 = this.getValue()
    let e2 = other.getValue()
    if (this.getType() == 'number' && other.getType() == 'number'
      || this.getType() == 'string' && other.getType() == 'string'
      || this.getType() == 'object' && other.getType() == 'object')
      return new AbdlVar(e1 === e2 ? 0 : 1);
  }

  getType() {
    return typeof this.value;
  }

  getValue() {
    return this.value;
  }
  toString() {
    if (this.getType() == 'number' || this.getType() == 'string')
      return this.getValue()
    return "[" + this.getValue() + "]"
  }
}

const testAbdlVars = () => {
  let int = new AbdlVar(3)
  let string = new AbdlVar("s")
  let point = new AbdlVar([1, 2])
  /* Python3
for t1, t2 in zip(["int", "string", "point"], ["int", "string", "point"]):
  for op, op_text in zip(\
    ["+","-","*","/","%","==","/=","<","<=",">=",">"], \
    ["add","sub","mul","div","rem","equal","not_equal","less_than","less_or_equal","greater_or_equal","greater_than"], \
    ):
    print(\
    'console.log({}.toString() + " {} " + {}.toString() + " = " + ({}.{}({}) ? {}.{}({}).toString() : "null"))'.format(\
    t1, op, t2, t1, op_text, t2, t1, op_text, t2))
  */
  //int + int       ->  int

  console.log(int.toString() + " + " + int.toString() + " = " + (int.add(int) ? int.add(int).toString() : "null"))
  console.log(int.toString() + " - " + int.toString() + " = " + (int.sub(int) ? int.sub(int).toString() : "null"))
  console.log(int.toString() + " * " + int.toString() + " = " + (int.mul(int) ? int.mul(int).toString() : "null"))
  console.log(int.toString() + " / " + int.toString() + " = " + (int.div(int) ? int.div(int).toString() : "null"))
  console.log(int.toString() + " % " + int.toString() + " = " + (int.rem(int) ? int.rem(int).toString() : "null"))
  console.log(int.toString() + " == " + int.toString() + " = " + (int.equal(int) ? int.equal(int).toString() :
    "null"))
  console.log(int.toString() + " /= " + int.toString() + " = " + (int.not_equal(int) ? int.not_equal(int).toString() : "null"))
  console.log(int.toString() + " < " + int.toString() + " = " + (int.less_than(int) ? int.less_than(int).toString() : "null"))
  console.log(int.toString() + " <= " + int.toString() + " = " + (int.less_or_equal(int) ? int.less_or_equal(int).toString() : "null"))
  console.log(int.toString() + " >= " + int.toString() + " = " + (int.greater_or_equal(int) ? int.greater_or_equal(int).toString() : "null"))
  console.log(int.toString() + " > " + int.toString() + " = " + (int.greater_than(int) ? int.greater_than(int).toString() : "null"))
  console.log(string.toString() + " + " + string.toString() + " = " + (string.add(string) ? string.add(string).toString() : "null"))
  console.log(string.toString() + " - " + string.toString() + " = " + (string.sub(string) ? string.sub(string).toString() : "null"))
  console.log(string.toString() + " * " + string.toString() + " = " + (string.mul(string) ? string.mul(string).toString() : "null"))
  console.log(string.toString() + " / " + string.toString() + " = " + (string.div(string) ? string.div(string).toString() : "null"))
  console.log(string.toString() + " % " + string.toString() + " = " + (string.rem(string) ? string.rem(string).toString() : "null"))
  console.log(string.toString() + " == " + string.toString() + " = " + (string.equal(string) ? string.equal(string).toString() : "null"))
  console.log(string.toString() + " /= " + string.toString() + " = " + (string.not_equal(string) ? string.not_equal(string).toString() : "null"))
  console.log(string.toString() + " < " + string.toString() + " = " + (string.less_than(string) ? string.less_than(string).toString() : "null"))
  console.log(string.toString() + " <= " + string.toString() + " = " + (string.less_or_equal(string) ? string.less_or_equal(string).toString() : "null"))
  console.log(string.toString() + " >= " + string.toString() + " = " + (string.greater_or_equal(string) ? string.greater_or_equal(string).toString() : "null"))
  console.log(string.toString() + " > " + string.toString() + " = " + (string.greater_than(string) ? string.greater_than(string).toString() : "null"))
  console.log(point.toString() + " + " + point.toString() + " = " + (point.add(point) ? point.add(point).toString() : "null"))
  console.log(point.toString() + " - " + point.toString() + " = " + (point.sub(point) ? point.sub(point).toString() : "null"))
  console.log(point.toString() + " * " + point.toString() + " = " + (point.mul(point) ? point.mul(point).toString() : "null"))
  console.log(point.toString() + " / " + point.toString() + " = " + (point.div(point) ? point.div(point).toString() : "null"))
  console.log(point.toString() + " % " + point.toString() + " = " + (point.rem(point) ? point.rem(point).toString() : "null"))
  console.log(point.toString() + " == " + point.toString() + " = " + (point.equal(point) ? point.equal(point).toString() : "null"))
  console.log(point.toString() + " /= " + point.toString() + " = " + (point.not_equal(point) ? point.not_equal(point).toString() : "null"))
  console.log(point.toString() + " < " + point.toString() + " = " + (point.less_than(point) ? point.less_than(point).toString() : "null"))
  console.log(point.toString() + " <= " + point.toString() + " = " + (point.less_or_equal(point) ? point.less_or_equal(point).toString() : "null"))
  console.log(point.toString() + " >= " + point.toString() + " = " + (point.greater_or_equal(point) ? point.greater_or_equal(point).toString() : "null"))
  console.log(point.toString() + " > " + point.toString() + " = " + (point.greater_than(point) ? point.greater_than(point).toString() : "null"))
}

testAbdlVars()