grammar Board;

game: rules piecesDescription initialStatus invariants finish EOF;

//pieces{}
piecesDescription: 'pieces{' pieceDescription+ '}' ;

pieceDescription: name '{' ((moves pieceDescriptionProperty*) | explicit*) '}';

pieceDescriptionProperty: canJump|onEndReached|mirrored;

//initial_status{}
initialStatus: 'initial_status{' piecesInitialStatus '}';

piecesInitialStatus : 'pieces{' (pieceInitialStatus+) '}';

pieceInitialStatus: name '{' (positions pieceInitialStatusProperty*|explicit*) '}' ;

pieceInitialStatusProperty: mirrored|owner;

owner: 'owner' ':' VALUE;


onEndReached: 'on_end_reached' ':' endReachedFunctions;

endReachedFunctions: endReachedKnownFunctions | explicit;

endReachedKnownFunctions: spawnFunction ;

spawnFunction: 'spawn(' stringArray ')';

stringArray: STRING (',' STRING)*;

canJump: 'can_jump' (':' bool)?;

mirrored: 'mirrored' (':' bool)?;


positions: 'positions{' coordinates+ '}';

//rules{}
rules: 'rules{' ((ruleDef)+|explicit*) '}' ;

ruleDef:  firstPlayer|width|height|coloring|playerChange;

firstPlayer: 'first_player' ':' VALUE;
width: 'width' ':' VALUE;
height: 'height' ':' VALUE;
coloring: 'coloring' ':' knownColorings;
knownColorings: 'alternate';
playerChange: 'player_change' ':' knownPlayerChanges;
knownPlayerChanges: 'alternate';


//invariants{}
invariants: 'invariants{' (function+ | explicit) '}' ;


//finish{}
finish: 'finish{' (function+ | explicit) '}' ;


function: ((invariant '(' name (',' name)* ')')+ | explicit);


moves: 'moves{' move+ '}' ;

move:  (direction|coordinates|explicit) (',' moveProperty)*;

moveProperty: killing;

killing: 'kills' (':' bool)?;

direction: (languageKeywords pair|coordinates|explicit);

coordinates: 'x'':' x ',' 'y' ':' y ;
bool: 'true'|'false';

pair: '(' VALUE? ',' VALUE? ')' ;
x: VALUE | interval ;
y: VALUE | interval ;
interval: '[' VALUE ',' VALUE ']' ;
explicit: 'explicit{|' explicitContent '|}';
explicitContent:  (~('|}')|'='|'>'|'<')*;
languageKeywords: ('vertical'|'horizontal'|'diagonal') ;

name: STRING;
invariant: STRING;
STRING: [_a-zA-Z]+;
VALUE: '-'? [0-9]+ ([0-9]+ '.')?;
WS: [ \t\n\r]+ -> skip ;
