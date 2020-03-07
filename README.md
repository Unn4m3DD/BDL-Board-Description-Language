# BDL - Board Description Language

## BDL is a board game description language - 1.0.0

## Syntax

All bdl files must have 5 sections describing:

**Main rules:**

``` bdl
rules{
  first_player : 0
  width : 8
  height : 8
  coloring : alternate
  player_change : alternate
}
```

| Rule          | Type             |      Required      | Default  |
|---------------|------------------|:------------------:|:--------:|
| first_player  | number (0 or 1)  | :white_check_mark: | &#10060; |
| width         | number (> 0)     | :white_check_mark: | &#10060; |
| height        | number (> 0)     | :white_check_mark: | &#10060; |
| coloring      | enum (alternate) | :white_check_mark: | &#10060; |
| player_change | enum (alternate) | :white_check_mark: | &#10060; |

**Pieces Description:**

``` bdl
pieces{
  piece_name1{
    moves{
      x : 2, y : 1
      vertical(3, 7)
    }
    can_jump
  }
  piece_name2{
    moves{
      horizontal(1,)
      diagonal(,), kills : false
    }
  }
```

**Piece Description:**
| Property       | Type           | Meaning                                    | Required | Default  |
|----------------|----------------|--------------------------------------------|:--------:|:--------:|
| moves          | [move](#move)+ | List of piece moves                        | &#10060; | &#10060; |
| can_jump       | bool           | Piece capability of jumping over targets   | &#10060; |  false   |
| mirrored       | bool           | Piece moves depending on owner are flipped | &#10060; |  false   |
| on_end_reached | enum (spawn)   | Action to be performed when a piece reach the end of the board | &#10060; | &#10060; |

on_end_reached spawn takes in any number of arguments and gives the player a chance to spawn another piece when it reaches the end of the board.</br> `on_end_reached: spawn(tower, bishop, queen)` .

**Initial Status Description:**

``` 
initial_status{
  pieces{
    piece_name1{
      positions{
        x : 0, y : 0
      }
      mirrored
    }
    piece_name2{
      positions{
        x : [1, 8], y : 0
      }
    }
  }
}
```

**Piece Placement Description:**
| Property  | Type               | Meaning                                                                                                     | Example             | Required | Default  |
|-----------|--------------------|-------------------------------------------------------------------------------------------------------------|---------------------|:--------:|:--------:|
| positions | [vector](#vector)+ | List of initial positions                                                                                   | `x : [1, 5], y: 3` | &#10060; | &#10060; |
| mirrored  | bool               | If mirrored all positions will be mirrored vertically and piece owner will be automatically set as opposite | `mirrored` | &#10060; | false |
| owner     | number(0 or 1)     | The player that owns a piece                                                                                | `owner : 1` | &#10060; | 0 |

**Invariants Description:**

``` bdl
invariants{
  cant_risk(king)
  protect_piece(king)
  pawn_movement(pawn)
}
```

There are currently 3 available invariants and all of them receive a list of arguments.

cant_risk(piece_name1, piece_name2) means that every move in must preserve pieces 1 and 2.

protect_piece(piece_name1, piece_name2) means that every move must at least, guaranty the safety of pieces 1 and 2

pawn_movement is a function that implements the limitations on chess pawns.

``` bdl
finish{
  no_moves_available
}
```

Currently the only finishing rule available is no_moves_available, it finishes the game when no more moves can be made so that the invariants are fulfilled.

**<a name="move"></a>Move Description:**
|       Type        | Meaning                                      | Example            |
|:-----------------:|----------------------------------------------|--------------------|
| [vector](#vector) | Can move to particular relative place        | `x : 1, y : 3` |
|     vertical      | Can move vertically in a range from a to b   | `vertical(a, b)` |
|    horizontal     | Can move horizontally in a range from a to b | `horizontal(a, b)` |
|     diagonal      | Can move diagonally in a range from a to b   | `diagonal(a, b)` |

Empty arguments mean that the piece can move all the way in a particular direction, `vertical(,)` mean that a piece can move vertically all over the board.

Every move can have a property describing its ability to kill enemies `vertical(,), kills : false` , by default it's set to true.

**<a name="vector"></a>Vector:**
A vector is a tuple with 2 values indicating either a number or a range `x : 1, y : 3` or `x : [1, 5], y: 2` .

Ranges can be used to describe long lists of vectors:

`x : [1, 2], y : [2, 3]` 

Would be translated to:

``` bdl
x : 1, y: 2
x : 2, y: 2
x : 1, y: 3
x : 2, y: 3
```

Chess description file:

``` bdl
rules{
  first_player : 0
  width : 8
  height : 8
  coloring : alternate
  player_change : alternate
}
pieces{
  horse{
    moves{
      x : 2, y : 1
      x : 2, y : -1
      x : -2, y : 1
      x : -2, y : -1
      x : 1, y : 2
      x : 1, y : -2
      x : -1, y : 2
      x : -1, y : -2
    }
    can_jump
  }
  tower{
    moves{
      horizontal(,)
      vertical(,)
    }
  }
  bishop{
    moves{
      diagonal(,)
    }
  }
  queen{
    moves{
      horizontal(,)
      vertical(,)
      diagonal(,)
    }
  }
  king{
    moves{
      horizontal(-1,1)
      vertical(-1,1)
      diagonal(-1,1)
    }
  }
  pawn{
    moves{
      vertical(1,2), kills : false
      x : 1, y : 1
      x : -1, y : 1
    }
    on_end_reached: spawn(queen, bishop, tower, horse)
    mirrored
  }
}

initial_status{
  pieces{
    tower{
      positions{
        x : 0, y : 0
        x : 7, y : 0
      }
      mirrored
    }
    horse{
      positions{
        x : 1, y : 0
        x : 6, y : 0
      }
      mirrored
    }
    bishop{
      positions{
        x : 2, y : 0
        x : 5, y : 0
      }
      mirrored
    }
    queen{
      positions{
        x : 3, y : 0
      }
      mirrored
    }
    king{
      positions{
        x : 4, y : 0
      }
      mirrored
    }
    pawn{
      positions{
        x : [0, 7], y : 1
      }
      mirrored
    }
  }
}

invariants{
  cant_risk(king)
  protect_piece(king)
  pawn_movement(pawn)
}

finish{
  no_moves_available
}

```

