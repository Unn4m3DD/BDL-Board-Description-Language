# ABDL - Auto BDL

## ABDL is a BDL moves programming language - 1.0

## Download

Download abdl compiler [here](https://github.com/Unn4m3DD/BDL-Board-Description-Language/raw/master/StandaloneCompiler/ABDLCompiler.jar).
Download example, matePastor.abdl [here](https://github.com/Unn4m3DD/BDL-Board-Description-Language/raw/master/StandaloneCompiler/matePastor.abdl).

## Usage

[ABDLCompiler](https://github.com/Unn4m3DD/BDL-Board-Description-Language/raw/master/StandaloneCompiler/ABDLCompiler.jar) usage:

``` shell
  java -jar ABDLCompiler.jar [source_file_name] [destination_directory_name]
```

## Syntax

All abdl files must have a main or a on_move function, main is called when the program starts and on_move is called every time a player finishes a movement.

**Main:**

``` abdl
main:
  //statements;
end main;
```

**On move:**

``` 
on_move:
  //statements;
end on_move;
```

**<a name="stats"></a>Statements:**
| Statements          | Syntax             |
|---------------|------------------|
| Variable declaration  | `let varName : varType = expr;` |
| Variable attribution   | `varName = expr;` |
| For loop        | `for varName from expr to expr do statements; done;` |  
| While loop        | `while expr do statements; done;` |  
| If | `if expr then statements; end if;` |
| ElseIf | `else if expr then statements;` |
| Else | `else statements;` |
| Return statement | `return expr;` |
| Function Call | `functionName(args);` |

The language supports three variable types:

| Type | Default |
|---------------|------------------|
| int | 0 |
| string | "" |
| point | [0, 0] |

**Variable declaration:**

Every variable that is declared must either have an explicit type or an initialization with an expr from which the type is inferred.

**Globally defined Variables:**

| Variable | Type | Value |
|-|-|-|
| `current_player` | int |current player, either 0 or 1|
| `width` | int |board width |
| `height` | int |board height |
| `board[x, y].piece_name` | string |name of [x, y] pieces |
| `board[x, y].owner` | int |owner of [x, y] pieces |
| `move_count` | int |number of movements |

**Globally defined functions:**

| Name | Return |
|-|-|
| `can_move(point, point);` | returns 1 if the move is possible, 0 otherwise
| `move(point, point);` | returns 1 if the move was successful, 0 otherwise
| `print(any);` | returns void

**Functions:**

Function defenition:

``` abdl
returnType functionName(args):
  //statements;
end functionName;
```

Example:

``` abdl
int isPrime(n : int):
  //statements;
end isPrime;
```

***<a name="args"></a>fArgs:***
One or more comma separated pairs of type varName : varType.

The return type is optional and not being present means that it doesn't return.
The statements are the same as referred [here](#stats);

Operations:

| Types                          | Meaning                               | Example                                       |
|--------------------------------|---------------------------------------|-----------------------------------------------|
| int op int                     | Commonly used operations              | `1 + 2 == 3` |
| any + string or string + any   | Concatenation of both operands        | `"a" + [1, 2] = "a[1,2]"` |
| int \* string or string \* int | Repeating the string int times        | `"a" * 2 == "aa"` |
| int op point and point op int  | Operating with single elements        | `[a, b] op c = [a op c, b op c]` |
| point op point                 | Operation element by element          | `[x1, y1] op [x2, y2] = [x1 op x2, y1 op y2]` |
| point\[int\]                   | Indexing a point                      | `[2, 3][0] == 2` |

Operations available between types (Extensive):

| + | int | string | point
|-----|---------|------|-----|
| int | int | string | point |
| string | string | string | string |
| point | point | string | point |

| * | int | string | point
|-----|---------|------|-----|
| int | int | string | point |
| string | string | undefined | undefined |
| point | point | undefined | point |

| -, /, %, ^ | int | string | point
|-----|---------|------|-----|
| int | int | undefined | point |
| string | undefined | undefined | undefined |
| point | point | undefined | point |

| ==, /= | int | string | point
|-----|---------|------|-----|
| int | int | undefined | undefined |
| string | undefined | int | undefined |
| point | undefined | undefined | int |

| <=, <, >, >= | int | string | point
|-----|---------|------|-----|
| int | int | undefined | undefined |
| string | undefined | undefined | undefined |
| point | undefined | undefined | undefined |
