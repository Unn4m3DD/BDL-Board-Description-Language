grammar Board;
game: ruleSet pieceDescriptions initialPiecePositions invariantList finish EOF;

ruleSet: 'rules' '{' ruleDef* '}'; //aceita argumentos em qualquer ordem
ruleDef:
     'first_player' ':' INT                            #ruleProp
    | 'width' ':' INT                                  #ruleProp
    | 'height' ':' INT                                 #ruleProp
    | 'coloring' ':' ('alternate' | explicitParsed)         #ruleColoring
    | 'player_change' ':' ('alternate' | explicitParsed)    #rulePlayerChange;


pieceDescriptions: 'pieces' '{' pieceDescription* '}';
pieceDescription:
      ID '{' moves descriptionModifier* '}' #pieceIdPlusMoves
    | explicitParsed                        #pieceDescriptionExplicit;
moves: 'moves' '{' move* '}';
move: vector kills?         #moveVector
    | moveFunction kills?   #moveFunctionDescription
    | explicitParsed        #moveExplicit;

moveFunction:
      'horizontal' '(' e1 = INT? ',' e2 = INT? ')'    #moveFunctionHorizontal
    | 'vertical' '(' e1 = INT? ',' e2 = INT? ')'      #moveFunctionVertical
    | 'diagonal' '(' e1 = INT? ',' e2 = INT? ')'      #moveFunctionDiagonal
    | explicitParsed                                  #moveFunctionExplicit;

kills: ','? 'kills' ':' BOOL;
descriptionModifier:
      'can_jump' (':' BOOL)?                                            #descriptionModifierCanJump
    | 'mirrored' (':' BOOL)?                                            #descriptionModifierMirrored
    | 'on_end_reached' ':' (endReachedAlternatives | explicitParsed)    #descriptionModifierOnEndReached
    | explicitParsed                                                    #descriptionModifierExplicit;

endReachedAlternatives: 'spawn' '(' ID (',' ID)* ')';
initialPiecePositions: 'initial_piece_position' '{' initialPiecePosition* '}';
initialPiecePosition:
      ID '{' (positions | positionModifier)* '}' //snippet simples para ignorar ordem dos argumentos
    | explicitParsed;
positions: 'positions' '{' vector* '}';
positionModifier:
      'mirrored' (':' BOOL)?    #positionModifierMirrored
    | 'owner' ':' INT           #positionModifierOwner;

invariantList: 'invariants' '{' invariant* '}';
invariant:
      'cant_risk' '(' ID (',' ID)* ')'      #invariantCantRisk
    | 'protect_piece' '(' ID (',' ID)* ')'  #invariantProtectPiece
    | 'pawn_movement' '(' ID (',' ID)* ')'  #invariantPawnMovement
    | explicitParsed                        #invariantExplicit;

finish: 'finish' '{' finishingRules* '}';
finishingRules:
      'no_moves_available'  #finishingNoMovesAvailable
    | explicitParsed        #finishingExplicit;

vector: 'x' ':' e1 = interval ',' 'y' ':' e2 = interval;

interval: ('[' INT ',' INT ']')     #fullInterval
           | INT                    #degenInterval;

INT: '-'? ('0'|[1-9][0-9]*);
BOOL: 'false' | 'true';
explicitParsed: EXPLICIT;
EXPLICIT: 'explicit' ' '* EXPFRAG;
fragment EXPFRAG: '{'(EXPFRAG |'\\}' | ~'}' )*?'}';
ID:[_a-zA-Z][_a-zA-Z0-9]*;
WS: [ \t\n\r] -> skip;