let e1 = this.getValue()
let e2 = other.getValue()
if (this.getType() == 'number' && other.getType() == 'number')
  return new AbdlVar();

if (this.getType() == 'number' && other.getType() == 'string')
  return new AbdlVar();

if (this.getType() == 'number' && other.getType() == 'object')
  return new AbdlVar();

if (this.getType() == 'string' && other.getType() == 'number')
  return new AbdlVar();

if (this.getType() == 'string' && other.getType() == 'string')
  return new AbdlVar();

if (this.getType() == 'string' && other.getType() == 'object')
  return new AbdlVar();

if (this.getType() == 'object' && other.getType() == 'number')
  return new AbdlVar();

if (this.getType() == 'object' && other.getType() == 'string')
  return new AbdlVar();

if (this.getType() == 'object' && other.getType() == 'object')
  return new AbdlVar();