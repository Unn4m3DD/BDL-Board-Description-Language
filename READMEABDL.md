# ABDL - Auto BDL

## ABDL is a BDL moves programming language - 1.0

## Download

Download abdl compiler [here](https://github.com/Unn4m3DD/BDL-Board-Description-Language/raw/master/StandaloneCompiler/ABDLCompiler.jar).
Download example, chess.bdl [here](https://github.com/Unn4m3DD/BDL-Board-Description-Language/raw/master/StandaloneCompiler/chess.bdl).

## Usage

[abdl compiler](https://github.com/Unn4m3DD/BDL-Board-Description-Language/raw/master/StandaloneCompiler/ABDLCompiler.jar) usage:

``` shell
  java -jar ABDLCompiler.jar [source_file_name] [destination_directory_name]
```

## Syntax

All abdl files must have a main:

**Main:**

``` abdl
main:
  statements;
end main;
```
**<a name="stats"></a>Statements:**
| Statements          | Syntax             | 
|---------------|------------------|
| Var declaration  | let varName : varType = expr; |
| Var atribution   | varName = expr;     |
| For loop        | for varName from expr to expr do statements; done; |  
| While loop        | while expr do statements; done; |  
| If statement | if expr then statements; end if; |
| ElseIf statement | else if expr then statements; |
| Else statement | else statements; |
| Return statement | return expr; |
| Function Call | functionName(args); |

The language supports three variable types:

| Type | Null initialization |
|---------------|------------------|
| int | 0 |
| string | "" |
| point | [0, 0] |

**Variable declaration:**

Every variable that is declared must either have an explicit type or an initialization with an expr from which the type is infered.

Operations available between types:
|| int | string | point |
|-|---------------|------------------|-|
|int| [all](#all) | + * | + - * / ^ % |
|string|+ *|+ == != | + |
|point|+ - * / ^ %| + | + - * / ^ % == != |

***<a name="all"></a>all:***
\+ \- \* / ^ % == != < <= > >= 

**Globally defined Variables:**

| Variable | Value |
|-|-|
| current_player | current player, either 0 or 1| 
| width | board width |
| height | board height |
| board[x][y].piece_name | piece name |
| board[x][y].owner | piece owner |

**Invariants:**

| Name | Return |
|-|-|
|can_move(point, point);| returns 1 if the move is possible, 0 otherwise
|move(point, point);| returns 1 if the move was successful, 0 otherwise
|print([args](#args));| returns void

***<a name="args"></a>args:***
One or more comma separated expr.

**Functions:**

Function defenition:
```abdl
returnType functionName(fArgs):
  statements;
end functionName;
```
***<a name="fArgs"></a>fArgs:***
One or more comma separated pairs of type varName : varType.

The return type is optional and not being present is equivalent to it being void.
The statements are the same as refered [here](#stats);