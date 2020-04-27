class AbdlVar {
  constructor(value) {
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
    return new AbdlVar(e1 > e2 ? 1 : 0);
  }
  less_or_equal(other) { // '<='
    let e1 = this.getValue()
    let e2 = other.getValue()
    return new AbdlVar(e1 <= e2 ? 1 : 0);
  }
  greater_or_equal(other) { // '>='
    let e1 = this.getValue()
    let e2 = other.getValue()
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
  //int + int       ->  int
  try {
    console.log(int.toString() + " + " + int.toString() + " = " + int.add(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " - " + int.toString() + " = " + int.sub(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " * " + int.toString() + " = " + int.mul(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " / " + int.toString() + " = " + int.div(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " % " + int.toString() + " = " + int.rem(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " < " + int.toString() + " = " + int.less_than(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " <= " + int.toString() + " = " + int.less_or_equal(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " == " + int.toString() + " = " + int.equal(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " /= " + int.toString() + " = " + int.not_equal(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " >= " + int.toString() + " = " + int.greater_or_equal(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " > " + int.toString() + " = " + int.greater_than(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " + " + string.toString() + " = " + int.add(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " - " + string.toString() + " = " + int.sub(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " * " + string.toString() + " = " + int.mul(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " / " + string.toString() + " = " + int.div(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " % " + string.toString() + " = " + int.rem(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " < " + string.toString() + " = " + int.less_than(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " <= " + string.toString() + " = " + int.less_or_equal(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " == " + string.toString() + " = " + int.equal(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " /= " + string.toString() + " = " + int.not_equal(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " >= " + string.toString() + " = " + int.greater_or_equal(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " > " + string.toString() + " = " + int.greater_than(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " + " + point.toString() + " = " + int.add(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " - " + point.toString() + " = " + int.sub(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " * " + point.toString() + " = " + int.mul(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " / " + point.toString() + " = " + int.div(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " % " + point.toString() + " = " + int.rem(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " < " + point.toString() + " = " + int.less_than(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " <= " + point.toString() + " = " + int.less_or_equal(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " == " + point.toString() + " = " + int.equal(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " /= " + point.toString() + " = " + int.not_equal(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " >= " + point.toString() + " = " + int.greater_or_equal(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(int.toString() + " > " + point.toString() + " = " + int.greater_than(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " + " + int.toString() + " = " + string.add(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " - " + int.toString() + " = " + string.sub(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " * " + int.toString() + " = " + string.mul(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " / " + int.toString() + " = " + string.div(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " % " + int.toString() + " = " + string.rem(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " < " + int.toString() + " = " + string.less_than(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " <= " + int.toString() + " = " + string.less_or_equal(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " == " + int.toString() + " = " + string.equal(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " /= " + int.toString() + " = " + string.not_equal(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " >= " + int.toString() + " = " + string.greater_or_equal(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " > " + int.toString() + " = " + string.greater_than(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " + " + string.toString() + " = " + string.add(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " - " + string.toString() + " = " + string.sub(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " * " + string.toString() + " = " + string.mul(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " / " + string.toString() + " = " + string.div(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " % " + string.toString() + " = " + string.rem(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " < " + string.toString() + " = " + string.less_than(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " <= " + string.toString() + " = " + string.less_or_equal(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " == " + string.toString() + " = " + string.equal(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " /= " + string.toString() + " = " + string.not_equal(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " >= " + string.toString() + " = " + string.greater_or_equal(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " > " + string.toString() + " = " + string.greater_than(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " + " + point.toString() + " = " + string.add(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " - " + point.toString() + " = " + string.sub(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " * " + point.toString() + " = " + string.mul(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " / " + point.toString() + " = " + string.div(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " % " + point.toString() + " = " + string.rem(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " < " + point.toString() + " = " + string.less_than(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " <= " + point.toString() + " = " + string.less_or_equal(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " == " + point.toString() + " = " + string.equal(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " /= " + point.toString() + " = " + string.not_equal(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " >= " + point.toString() + " = " + string.greater_or_equal(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(string.toString() + " > " + point.toString() + " = " + string.greater_than(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " + " + int.toString() + " = " + point.add(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " - " + int.toString() + " = " + point.sub(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " * " + int.toString() + " = " + point.mul(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " / " + int.toString() + " = " + point.div(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " % " + int.toString() + " = " + point.rem(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " < " + int.toString() + " = " + point.less_than(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " <= " + int.toString() + " = " + point.less_or_equal(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " == " + int.toString() + " = " + point.equal(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " /= " + int.toString() + " = " + point.not_equal(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " >= " + int.toString() + " = " + point.greater_or_equal(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " > " + int.toString() + " = " + point.greater_than(int).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " + " + string.toString() + " = " + point.add(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " - " + string.toString() + " = " + point.sub(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " * " + string.toString() + " = " + point.mul(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " / " + string.toString() + " = " + point.div(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " % " + string.toString() + " = " + point.rem(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " < " + string.toString() + " = " + point.less_than(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " <= " + string.toString() + " = " + point.less_or_equal(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " == " + string.toString() + " = " + point.equal(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " /= " + string.toString() + " = " + point.not_equal(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " >= " + string.toString() + " = " + point.greater_or_equal(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " > " + string.toString() + " = " + point.greater_than(string).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " + " + point.toString() + " = " + point.add(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " - " + point.toString() + " = " + point.sub(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " * " + point.toString() + " = " + point.mul(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " / " + point.toString() + " = " + point.div(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " % " + point.toString() + " = " + point.rem(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " < " + point.toString() + " = " + point.less_than(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " <= " + point.toString() + " = " + point.less_or_equal(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " == " + point.toString() + " = " + point.equal(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " /= " + point.toString() + " = " + point.not_equal(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " >= " + point.toString() + " = " + point.greater_or_equal(point).toString())
  } catch (e) {
    console.log(null)
  }
  try {
    console.log(point.toString() + " > " + point.toString() + " = " + point.greater_than(point).toString())
  } catch (e) {
    console.log(null)
  }
}

testAbdlVars()