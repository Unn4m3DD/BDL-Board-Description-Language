grammar Abdl;

program: functDef* main functDef* EOF;

main: 'main:' statements* 'end' 'main' ';';

functDef: Type? func_name=ID '(' typedArgs ')' ':' statements* 'end' ID ';';
//loop: FOR

block: forStatement | whileStatement | ifStatement;
statements: varDeclaration
          | varAttrib
          | functionCall ';'
          | returnStat
          | block;

forStatement: 'for' var=ID 'from' bottom=(Int | ID) 'to' up=(Int | ID) 'do' statements* 'done;';
whileStatement: 'while' expr 'do' statements* 'done;';
ifStatement: 'if' expr 'then' statements* elseIf* else? 'endif;';
elseIf: 'else' 'if' expr 'then' statements*;
else: 'else' statements*;
varDeclaration: 'let' ID (':' Type)? ('=' expr)? ';';
varAttrib: var=ID '=' expr;
functionCall: 'can_move' '(' point ',' point ')'
             |'move' '(' point ',' point ')'
             | ID '(' args ')';
returnStat: 'return' expr ';';
expr:  expr ('+' | '-' | '*' | '/' | '%' | '<' | '<=' | '>' | '>=' | '==' | '/=') expr #ExprOp
     | '(' expr ')' #Parent
     | Int #ExprInt
     | 'null' #ExprNull
     | String #ExprString
     | 'width' #ExprWidth
     | 'height' #ExprHeight
     | 'current_player' #ExprCurrPlayer
     | ID #ExprID
     | point #ExprPoint
     | functionCall #EpxrFunctionCall


args: expr? (',' expr)*;

typedArgs: (ID ':' Type)? (',' (ID ':' Type))*;

point: '['expr ','expr']';
board: 'board' point '.' ('piece_name' | 'owner');
Type: 'int' | 'point' | 'string';
String: '"' ('\\"'|'\\'|.)*? '"'
       |'\'' ('\\\''|'\\'|.)*? '\'';
ID: [_a-zA-Z][_a-zA-Z0-9]*;
Int: [0-9]+;
Comment: ('//' .*? '\r'? '\n' | '/*' .*? '*/') -> skip;
WS: [ \n\r\t] -> skip;
ERRORS: .;