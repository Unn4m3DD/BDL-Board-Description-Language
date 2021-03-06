package Compiler;

import SymbolTable.*;
import antlr4Gen.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Triple;

import java.util.HashMap;
import java.util.Map;

public class TypeInfer extends AbdlBaseVisitor<String> {
    SymbolTable st;

    public TypeInfer(SymbolTable st) {
        this.st = st;
    }

    Map<Triple<String, String, String>, String> opMap = new HashMap<>() {{
        put(new Triple<>("int", "+", "int"), ("int"));
        put(new Triple<>("int", "+", "string"), ("string"));
        put(new Triple<>("int", "+", "point"), ("point"));
        put(new Triple<>("string", "+", "int"), ("string"));
        put(new Triple<>("string", "+", "string"), ("string"));
        put(new Triple<>("string", "+", "point"), ("string"));
        put(new Triple<>("point", "+", "int"), ("point"));
        put(new Triple<>("point", "+", "string"), ("string"));
        put(new Triple<>("point", "+", "point"), ("point"));
        put(new Triple<>("int", "-", "int"), ("int"));
        put(new Triple<>("int", "-", "point"), ("point"));
        put(new Triple<>("point", "-", "int"), ("point"));
        put(new Triple<>("point", "-", "point"), ("point"));
        put(new Triple<>("int", "*", "int"), ("int"));
        put(new Triple<>("int", "*", "string"), ("string"));
        put(new Triple<>("int", "*", "point"), ("point"));
        put(new Triple<>("string", "*", "int"), ("string"));
        put(new Triple<>("point", "*", "int"), ("point"));
        put(new Triple<>("point", "*", "point"), ("point"));
        put(new Triple<>("int", "/", "int"), ("int"));
        put(new Triple<>("int", "/", "point"), ("point"));
        put(new Triple<>("point", "/", "int"), ("point"));
        put(new Triple<>("point", "/", "point"), ("point"));
        put(new Triple<>("int", "%", "int"), ("int"));
        put(new Triple<>("int", "%", "point"), ("point"));
        put(new Triple<>("point", "%", "int"), ("point"));
        put(new Triple<>("point", "%", "point"), ("point"));
        put(new Triple<>("int", "/=", "int"), ("int"));
        put(new Triple<>("int", "==", "int"), ("int"));
        put(new Triple<>("string", "==", "string"), ("int"));
        put(new Triple<>("string", "/=", "string"), ("int"));
        put(new Triple<>("point", "==", "point"), ("int"));
        put(new Triple<>("point", "/=", "point"), ("int"));
        put(new Triple<>("int", "<", "int"), ("int"));
        put(new Triple<>("int", "<=", "int"), ("int"));
        put(new Triple<>("int", ">", "int"), ("int"));
        put(new Triple<>("int", ">=", "int"), ("int"));
        put(new Triple<>("int", "||", "int"), ("int"));
        put(new Triple<>("int", "&&", "int"), ("int"));
    }};

    @Override
    public String visitExprWidth(AbdlParser.ExprWidthContext ctx) {
        return "int";
    }

    @Override
    public String visitExprString(AbdlParser.ExprStringContext ctx) {
        return "string";
    }

    @Override
    public String visitExprPoint(AbdlParser.ExprPointContext ctx) {
        return "point";
    }

    @Override
    public String visitExprNull(AbdlParser.ExprNullContext ctx) {
        return "";
    }

    @Override
    public String visitExprHeight(AbdlParser.ExprHeightContext ctx) {
        return "int";
    }

    @Override
    public String visitExprCurrPlayer(AbdlParser.ExprCurrPlayerContext ctx) {
        return "int";
    }

    @Override
    public String visitExprMoveCount(AbdlParser.ExprMoveCountContext ctx) {
        return "int";
    }

    @Override
    public String visitExprPointIndex(AbdlParser.ExprPointIndexContext ctx) {
        return "int";
    }

    @Override
    public String visitExprBoard(AbdlParser.ExprBoardContext ctx) {
        if (ctx.board().prop.getText().equals("piece_name"))
            return "string";
        else
            return "int";
    }

    @Override
    public String visitExprInt(AbdlParser.ExprIntContext ctx) {
        return "int";
    }

    @Override
    public String visitExprID(AbdlParser.ExprIDContext ctx) {
        Symbol resolved = st.resolve(ctx.ID().getText());
        if (!(resolved instanceof Variable)) {
            //tested
            System.err.println("Undefined variable " + getLineFormatted(ctx.start) + ": " + ctx.ID().getText());
            return "";
        }
        return ((Variable) resolved).getType();
    }

    @Override
    public String visitExprOp(AbdlParser.ExprOpContext ctx) {
        String type1 = visit(ctx.expr(0));
        String type2 = visit(ctx.expr(1));
        String op = ctx.op.getText();
        String result = opMap.getOrDefault(new Triple<>(type1, op, type2), "");
        if (result.equals("")) {
            type1 = type1.equals("") ? "undefined" : type1;
            type2 = type2.equals("") ? "undefined" : type2;
            //tested
            System.err.println("Operation undefined between types " +
                    getLineFormatted(ctx.start) + ": " + type1 + " " + op + " " + type2
            );
        }
        return result;
    }

    @Override
    public String visitExprFunctionCall(AbdlParser.ExprFunctionCallContext ctx) {
        Function function = ((Function) st.resolve(ctx.funcName.getText()));
        if (function == null)
            return "";
        return function.getReturnType();
    }

    String getLineFormatted(Token start) {
        return "(" + start.getLine() + ":" + start.getCharPositionInLine() + ")";
    }
}
/*

  new HashMap<Pair, String>(){{
    put(new Triplet("int", "int", "+"), ("int"));
    put(new Triplet("string", "int", "+"), ("string"));
  }}
  if(type1.equals("int") && type2.equals("int"))
      return "int";
  for line in file:
    items = line.split(" ")
    print('put(new Triplet("' + items[0] + '", "' + items[1] + '", "' + items[2] + '"), ("' + items[4] + '"));')

  int + int       ->  int
  int + string    ->  string
  int + point     ->  point
  string + int    ->  string
  string + string ->  string
  string + point  ->  string
  point + int     ->  point
  point + string  ->  string
  point + point   ->  point
  int - int       ->  int
  int - string    ->  undefined
  int - point     ->  point
  string - int    ->  undefined
  string - string ->  undefined
  string - point  ->  undefined
  point - int     ->  point
  point - string  ->  undefined
  point - point   ->  point
  int * int       ->  int
  int * string    ->  string
  int * point     ->  point
  string * int    ->  string
  string * string ->  undefined
  string * point  ->  undefined
  point * int     ->  point
  point * string  ->  undefined
  point * point   ->  point
  int / int       ->  int
  int / string    ->  undefined
  int / point     ->  point
  string / int    ->  undefined
  string / string ->  undefined
  string / point  ->  undefined
  point / int     ->  point
  point / string  ->  undefined
  point / point   ->  point
  int % int       ->  int
  int % string    ->  undefined
  int % point     ->  point
  string % int    ->  undefined
  string % string ->  undefined
  string % point  ->  undefined
  point % int     ->  point
  point % string  ->  undefined
  point % point   ->  point
  int (== | !=) int       ->  int
  int (== | !=) string    ->  undefined
  int (== | !=) point     ->  undefined
  string (== | !=) int    ->  undefined
  string (== | !=) string ->  int
  string (== | !=) point  ->  undefined
  point (== | !=) int     ->  undefined
  point (== | !=) string  ->  undefined
  point (== | !=) point   ->  int
  int (< | <= | > | >=) int       ->  int
  int (< | <= | > | >=) string    ->  undefined
  int (< | <= | > | >=) point     ->  undefined
  string (< | <= | > | >=) int    ->  undefined
  string (< | <= | > | >=) string ->  undefined
  string (< | <= | > | >=) point  ->  undefined
  point (< | <= | > | >=) int     ->  undefined
  point (< | <= | > | >=) string  ->  undefined
  point (< | <= | > | >=) point   ->  undefined

* */