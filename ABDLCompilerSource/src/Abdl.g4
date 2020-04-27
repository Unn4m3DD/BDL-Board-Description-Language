grammar Abdl;

program: stats EOF;
stats: ';';


function: Type? func_name=String '(' args+=(String ':' Type)? (',' args+=(Type String))* '):'
//loop: FOR

For: 'for';
Type: 'int' | 'point' | 'string';
String: [a-zA-Z]+;
WS: [ \n\r\t] -> skip;
ERRORS: .;