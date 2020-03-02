grammar Board;

game: pieces ; //initial_status rules invariant finish ;

pieces: 'pieces{' pieceMove+ | explicit '}' ;

initial_status: 'pieces{' (piecePos+ PROPERTY?) | explicit '}' ;

rules: 'rules{' (PROPERTY ':' (VALUE|PROPERTY))+ explicit? '}' ;

invariants: 'invariants{' invariant+ | explicit '}' ;

invariant: INVARIANTE '(' NAME (',' NAME)* ')' ;

finish: 'finish{' invariant+ | explicit '}' ;


pieceMove: NAME '{' moves PROPERTY* '}' ;

piecePos: NAME '{' position '}' ;

position: 'position{' move+ '}';

moves: 'moves{' move+ '}' ;

move:  direction
     | coordenates
     | explicit;

direction: ('vertical'|'horizontal'|'diagonal') '(' x ',' y ')';

coordenates: 'x: ' x ',y:' y ;


x: VALUE | interval ;
y: VALUE | interval ;
interval: '[' VALUE ',' VALUE ']' ;
explicit: 'explicit{' ANY '}';


INVARIANTE: STRING ;
PROPERTY: STRING ; 
NAME: STRING ;
STRING: [_a-zA-Z]+ ;
VALUE: '-'? ([0-9]+ '.')? [0-9]+ ;
WS: [ \t\n\r]+ -> skip ;
ANY: .+ ; 