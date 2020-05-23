grammar Abdl;
program: (functDef | onMove | main)* EOF;

main: 'main' ':' statements* ('end' 'main'|'endmain') ';';

functDef: Type? funcName=ID '(' typedArgs ')' ':' statements* 'end' (funcName2=ID{$funcName.text.equals($funcName2.text)}?) ';';

onMove: 'on_move' ':' statements* 'end' 'on_move' ';';

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
//TODO verificar que expr é point
expr:  expr '[' expr ']' #ExprPointIndex
     | <assoc=right> expr op='^' expr #ExprOp
     | expr op=('*' | '/' | '%') expr #ExprOp
     | expr op=('+' | '-' ) expr #ExprOp
     | expr op=( '<' | '<=' | '>' | '>=' | '==' | '/=') expr #ExprOp
     | funcName=('can_move'| 'move'| ID) '(' args ')' #ExprFunctionCall
     | board #ExprBoard
     | '(' expr ')' #Parent
     | Int #ExprInt
     | String #ExprString
     | point #ExprPoint
     | 'null' #ExprNull
     | 'width' #ExprWidth
     | 'height' #ExprHeight
     | 'current_player' #ExprCurrPlayer
     | 'move_count' #ExprMoveCount
     | ID #ExprID;


args: expr? (',' expr)*;

typedArgs: (ID ':' Type)? (',' (ID ':' Type))*;

point: '['expr ','expr']';
board: 'board' point '.' prop=('piece_name' | 'owner');
Type: 'int' | 'point' | 'string';
String: '"' ('\\"'|'\\'|.)*? '"'
       |'\'' ('\\\''|'\\'|.)*? '\'';
ID: [_a-zA-Z][_a-zA-Z0-9]*; 
Int: '-'?[0-9]+;
Comment: ('//' .*? '\r'? '\n' | '/*' .*? '*/') -> skip;
WS: [ \n\r\t] -> skip;
ERRORS: .;