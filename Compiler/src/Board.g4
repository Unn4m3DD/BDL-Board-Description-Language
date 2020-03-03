grammar Board;

game: rules piecesDescription initialStatus invariants finish EOF;

//pieces{}
piecesDescription: 'pieces{' pieceDescription+ '}' ;

pieceDescription: name '{' ((moves property*) | explicit*) '}';

//initial_status{}
initialStatus: 'initial_status{' piecesInitialStatus '}';

piecesInitialStatus : 'pieces{' (pieceInitialStatus+) '}';

pieceInitialStatus: name '{' (positions property?|explicit*) '}' ;

positions: 'positions{' coordinates+ '}';

//rules{}
rules: 'rules{' ((ruleDef)+|explicit*) '}' ;

ruleDef: property ':' (VALUE|property|explicit) ;

//invariants{}
invariants: 'invariants{' (function+ | explicit) '}' ;


//finish{}
finish: 'finish{' (function+ | explicit) '}' ;


function: ((invariant '(' name (',' name)* ')')+ | explicit);


moves: 'moves{' move+ '}' ;

move:  direction
     | coordinates
     | explicit;

direction: (languageKeywords pair|coordinates|explicit);

coordinates: 'x'':' x ',' 'y' ':' y ;

pair: '(' VALUE? ',' VALUE? ')' ;
x: VALUE | interval ;
y: VALUE | interval ;
interval: '[' VALUE ',' VALUE ']' ;
explicit: 'explicit{|' (~('|}')|'='|'>'|'<')*? '|}';

languageKeywords: ('vertical'|'horizontal'|'diagonal') ;

name: STRING;
invariant: STRING;
property: STRING;
STRING: [_a-zA-Z]+;
VALUE: '-'? ([0-9]+ '.')? [0-9]+;
WS: [ \t\n\r]+ -> skip ;