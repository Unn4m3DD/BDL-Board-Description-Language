grammar Abdl;
//TODO fukin nested shit, declaraçoes dentro de if e tals
program: functDef* main functDef* EOF;

main: 'main' ':' statements* ('end' 'main'|'endmain') ';';

functDef: Type? func_name=ID '(' typedArgs ')' ':' statements* 'end' ID ';';
//loop: FOR

block: forStatement | whileStatement | ifStatement;
statements: varDeclaration
          | varAttrib
          | functionCallStatement
          | returnStat
          | block;
functionCallStatement: functionCall ';';
forStatement: 'for' var=ID 'from' bottom=expr 'to' up=expr 'do' statements* 'done' ';';
whileStatement: 'while' expr 'do' statements* 'done' ';';
ifStatement: 'if' expr 'then' statements* elseIf* elseStatement? ('end' 'if'|'endif') ';';
elseIf: 'else' 'if' expr 'then' statements*;
elseStatement: 'else' statements*;
varDeclaration: 'let' ID (':' Type)? ('=' expr)? ';';
varAttrib: var=ID '=' expr ';';
functionCall: funcName='can_move' '('args ')' #CanMoveCall
             | funcName='move' '('args ')' #MoveCall
             | funcName='print' '(' args ')' #PrintCall
             | funcName=ID '(' args ')' #FuncCall;
returnStat: 'return' expr ';';
expr: <assoc=right> expr op='^' expr #ExprOp
     | expr op=('*' | '/' | '%') expr #ExprOp //TODO pow
     | expr op=('+' | '-' ) expr #ExprOp
     | expr op=( '<' | '<=' | '>' | '>=' | '==' | '/=') expr #ExprOp
     | funcName=(ID|'can_move'|'move') '(' args ')' #ExprFunctionCall
     | board #ExprBoard
     | '(' expr ')' #Parent
     | Int #ExprInt
     | String #ExprString
     | point #ExprPoint
     | 'null' #ExprNull
     | 'width' #ExprWidth
     | 'height' #ExprHeight
     | 'current_player' #ExprCurrPlayer
     | ID #ExprID;


args: expr? (',' expr)*;

typedArgs: (ID ':' Type)? (',' (ID ':' Type))*;

point: '['expr ','expr']';
board: 'board' point '.' prop=('piece_name' | 'owner');
Type: 'int' | 'point' | 'string';
String: '"' ('\\"'|'\\'|.)*? '"'
       |'\'' ('\\\''|'\\'|.)*? '\'';
ID: [_a-zA-Z][_a-zA-Z0-9]*;
Int: [0-9]+;
Comment: ('//' .*? '\r'? '\n' | '/*' .*? '*/') -> skip;
WS: [ \n\r\t] -> skip;
ERRORS: .;