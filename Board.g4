grammar Board;

game: pieces_description* initial_status* rules* invariants* finish* ;

//pieces{}
pieces_description: 'pieces{' piece_description+ '}' ;

piece_description: name '{' ((moves property*) | explicit*) '}';

//initial_status{}
initial_status: 'initial_status{' pieces_inital_status '}';

pieces_inital_status : 'pieces{' (piece_initial_status+) '}';

piece_initial_status: name '{' (positions property?|explicit*) '}' ;

positions: 'positions{' coordinates+ '}';

//rules{}
rules: 'rules{' ((rule)+|explicit*) '}' ;

rule: property ':' (VALUE|property|explicit) ;

//invariants{}
invariants: 'invariants{' (function+ | explicit) '}' ;


//finish{}
finish: 'finish{' (function+ | explicit) '}' ;


function: ((invariant '(' name (',' name)* ')')+ | explicit);


moves: 'moves{' move+ '}' ;

move:  direction
     | coordinates
     | explicit; 

direction: ('vertical' pair|'horizontal' pair|'diagonal' pair|coordinates);

coordinates: 'x'':' x ',' 'y' ':' y ;

pair: '(' VALUE? ',' VALUE? ')' ;
x: VALUE | interval ;
y: VALUE | interval ;
interval: '[' VALUE ',' VALUE ']' ;
explicit: 'explicit«' (~('»')|'='|'>'|'<')* '»';


name: STRING;
invariant: STRING;
property: STRING; 
STRING: [_a-zA-Z]+;
VALUE: '-'? ([0-9]+ '.')? [0-9]+;
WS: [ \t\n\r]+ -> skip ;