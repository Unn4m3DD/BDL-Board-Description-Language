file = [
  "int + int       ->  int",
  "int + string    ->  string",
  "int + point     ->  point",
  "string + int    ->  string",
  "string + string ->  string",
  "string + point  ->  string",
  "point + int     ->  point",
  "point + string  ->  string",
  "point + point   ->  point",
  "int - int       ->  int",
  "int - string    ->  undefined",
  "int - point     ->  point",
  "string - int    ->  undefined",
  "string - string ->  undefined",
  "string - point  ->  undefined",
  "point - int     ->  point",
  "point - string  ->  undefined",
  "point - point   ->  point",
  "int * int       ->  int",
  "int * string    ->  string",
  "int * point     ->  point",
  "string * int    ->  string",
  "string * string ->  undefined",
  "string * point  ->  undefined",
  "point * int     ->  point",
  "point * string  ->  undefined",
  "point * point   ->  point",
  "int / int       ->  int",
  "int / string    ->  undefined",
  "int / point     ->  point",
  "string / int    ->  undefined",
  "string / string ->  undefined",
  "string / point  ->  undefined",
  "point / int     ->  point",
  "point / string  ->  undefined",
  "point / point   ->  point",
  "int % int       ->  int",
  "int % string    ->  undefined",
  "int % point     ->  point",
  "string % int    ->  undefined",
  "string % string ->  undefined",
  "string % point  ->  undefined",
  "point % int     ->  point",
  "point % string  ->  undefined",
  "point % point   ->  point",
  "int != int       ->  int",
  "int != string    ->  undefined",
  "int != point     ->  undefined",
  "int == int       ->  int",
  "int == string    ->  undefined",
  "int == point     ->  undefined",
  "string == int    ->  undefined",
  "string == string ->  int",
  "string == point  ->  undefined",
  "string != int    ->  undefined",
  "string != string ->  int",
  "string != point  ->  undefined",
  "point == int     ->  undefined",
  "point == string  ->  undefined",
  "point == point   ->  int",
  "point != int     ->  undefined",
  "point != string  ->  undefined",
  "point != point   ->  int",
  "int < int       ->  int",
  "int < string    ->  undefined",
  "int < point     ->  undefined",
  "string < int    ->  undefined",
  "string < string ->  undefined",
  "string < point  ->  undefined",
  "point < int     ->  undefined",
  "point < string  ->  undefined",
  "point < point   ->  undefined",
  "int < int       ->  int",
  "int < string    ->  undefined",
  "int < point     ->  undefined",
  "string < int    ->  undefined",
  "string < string ->  undefined",
  "string < point  ->  undefined",
  "point < int     ->  undefined",
  "point < string  ->  undefined",
  "point < point   ->  undefined",
  "int <= int       ->  int",
  "int <= string    ->  undefined",
  "int <= point     ->  undefined",
  "string <= int    ->  undefined",
  "string <= string ->  undefined",
  "string <= point  ->  undefined",
  "point <= int     ->  undefined",
  "point <= string  ->  undefined",
  "point <= point   ->  undefined",
  "int <= int       ->  int",
  "int <= string    ->  undefined",
  "int <= point     ->  undefined",
  "string <= int    ->  undefined",
  "string <= string ->  undefined",
  "string <= point  ->  undefined",
  "point <= int     ->  undefined",
  "point <= string  ->  undefined",
  "point <= point   ->  undefined",
  "int > int       ->  int",
  "int > string    ->  undefined",
  "int > point     ->  undefined",
  "string > int    ->  undefined",
  "string > string ->  undefined",
  "string > point  ->  undefined",
  "point > int     ->  undefined",
  "point > string  ->  undefined",
  "point > point   ->  undefined",
  "int > int       ->  int",
  "int > string    ->  undefined",
  "int > point     ->  undefined",
  "string > int    ->  undefined",
  "string > string ->  undefined",
  "string > point  ->  undefined",
  "point > int     ->  undefined",
  "point > string  ->  undefined",
  "point > point   ->  undefined",
  "int >= int       ->  int",
  "int >= string    ->  undefined",
  "int >= point     ->  undefined",
  "string >= int    ->  undefined",
  "string >= string ->  undefined",
  "string >= point  ->  undefined",
  "point >= int     ->  undefined",
  "point >= string  ->  undefined",
  "point >= point   ->  undefined",
  "int >= int       ->  int",
  "int >= string    ->  undefined",
  "int >= point     ->  undefined",
  "string >= int    ->  undefined",
  "string >= string ->  undefined",
  "string >= point  ->  undefined",
  "point >= int     ->  undefined",
  "point >= string  ->  undefined",
  "point >= point   ->  undefined",
]
for line in file:
    items = line.split()
    if(items[4] != "undefined"):
      print('put(new Triple("' + items[0] + '", "' + items[1] + '", "' + items[2] + '"), ("' + items[4] + '"));')
    