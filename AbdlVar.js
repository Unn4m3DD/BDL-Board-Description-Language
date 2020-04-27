class AbdlVar {
  constructor(value) {
    this.value = value;
  }
  add(other) { // '+'
  }
  sub(other) { // '-'
  }
  mul(other) { // '*'
  }
  div(other) { // '/'
  }
  rem(other) { // '%'
  }
  less_than(other) { // '<'
  }
  greater_than(other) { // '>'
  }
  less_or_equal(other) { // '<='
  }
  greater_or_equal(other) { // '>='
  }
  equal(other) { // '=='
  }
  not_equal(other) { // '/='
  }
}

let i = new AbdlVar(10)

console.log(i.value)