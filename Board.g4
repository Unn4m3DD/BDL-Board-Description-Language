grammar Board;

game: pieces initial_status rules invariants finish ;
//game: finish ;

pieces: 'pieces{' piece+ '}' ;

initial_status: 'initial_status{' pieces_inital '}';

pieces_inital : 'pieces{' (piece_initial+) '}';

rules: 'rules{' (property ':' (VALUE|property))+ explicit? '}' ;

invariants: 'invariants{' (invariant_replace_this+ | explicit) '}' ;

invariant_replace_this: ((invariant '(' name (',' name)* ')')+ | explicit);

finish: 'finish{' (invariant_replace_this+ | explicit) '}' ;


piece: name '{' ((moves property*) | explicit) '}';

piece_initial: name '{' (positions property?|explicit) '}' ;

positions: 'positions{' move+ '}';

moves: 'moves{' move+ '}' ;

move:  direction
     | coordenates
     | explicit; 

direction: ('vertical' pair|'horizontal' pair|'diagonal' pair|coordenates);

coordenates: 'x'':' x ',' 'y' ':' y ;

pair: '(' VALUE? ',' VALUE? ')' ;
x: VALUE | interval ;
y: VALUE | interval ;
interval: '[' VALUE ',' VALUE ']' ;
explicit: 'explicit«' ~('»')+ '»';


name: STRING;
invariant: STRING;
property: STRING; 
STRING: [_a-zA-Z]+;
VALUE: '-'? ([0-9]+ '.')? [0-9]+;
WS: [ \t\n\r]+ -> skip ;