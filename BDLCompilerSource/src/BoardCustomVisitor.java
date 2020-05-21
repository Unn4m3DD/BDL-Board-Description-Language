import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;
import java.util.Map;
//TODO invariant explicit
public class BoardCustomVisitor extends BoardBaseVisitor<Object> {
    int width = 8, height = 8;
    Map<String, String> files = new HashMap<>();

    @Override
    public Object visitGame(BoardParser.GameContext ctx) {
        String[] fileNames = {"/rules.js",
                "/pieces.js",
                "/initial_status.js",
                "/invariants.js",
                "/finishing.js"};

        for (int i = 0; i < 5; i++) {
            String result = (String) visit(ctx.getChild(i));
            files.put(fileNames[i], result);
        }
        return files;
    }

    @Override
    public Object visitRuleSet(BoardParser.RuleSetContext ctx) {
        StringBuilder result = new StringBuilder("export default {\n");
        for (var rule : ctx.ruleDef())
            result.append((String) visit(rule));
        result.append("}");
        return result.toString();
    }

    @Override
    public Object visitRuleProp(BoardParser.RulePropContext ctx) {
        StringBuilder result = new StringBuilder();
        int value = Integer.parseInt(ctx.INT().getText());
        if (ctx.getChild(0).getText().equals("width")) {
            width = value;
        } else if ((ctx.getChild(0).getText().equals("height"))) {
            height = value;
        }
        result.append("  " + ctx.getChild(0).getText() + ": " + value + "," + '\n');
        return result.toString();
    }

    @Override
    public Object visitRuleColoring(BoardParser.RuleColoringContext ctx) {
        StringBuilder result = new StringBuilder("  ");
        result.append("board_coloring_rule");
        result.append(": ");
        try {
            if (ctx.explicitParsed() != null)
                result.append((String) visit(ctx.explicitParsed()));
            else if (ctx.getChild(2).getText().equals("alternate"))
                result.append("(x, y, last_color) => {\n" +
                        "      if(y == 0)\n" +
                        "        last_color = (x % 2 == 0) ? \"#c90\" : \"#ffffff\";\n" +
                        "      last_color = last_color === \"#ffffff\" ? \"#c90\" : \"#ffffff\"\n" +
                        "      return last_color\n" +
                        "    }");
            else
                throw new Exception("Unknown coloring: " + ctx.getChild(2).getText());
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        result.append(",\n");
        return result.toString();
    }

    @Override
    public Object visitRulePlayerChange(BoardParser.RulePlayerChangeContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("  player_change_rule ");
        result.append(": ");
        try {
            if (ctx.explicitParsed() != null)
                result.append((String) visit(ctx.explicitParsed()));
            else if (ctx.getChild(2).getText().equals("alternate"))
                result.append("(context) => {\n" +
                        "    context.current_player = context.current_player === 0 ? 1 : 0\n" +
                        "  }");
            else
                throw new Exception("Unknown player change rule: " + ctx.getChild(2).getText());
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        result.append(",\n");
        return result.toString();
    }


    @Override
    public Object visitPieceDescriptions(BoardParser.PieceDescriptionsContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("function reverse(array) {\n" +
                "  for (let i = 0; i < array.length; i++) {\n" +
                "    const func = array[i].y\n" +
                "    array[i].y = (x) => {\n" +
                "      const tmp = func\n" +
                "      return [-tmp(x)[1] + 1, -tmp(x)[0] + 1]\n" +
                "    }\n" +
                "  }\n" +
                "}\n" +
                "const pieces = {\n");

        for (var piece : ctx.pieceDescription()) {
            result.append("  ");
            result.append((String) visit(piece));
            result.append(", \n");
        }
        result.append("}\n" +
                "export default pieces;");
        return result.toString();
    }

    @Override
    public Object visitPieceIdPlusMoves(BoardParser.PieceIdPlusMovesContext ctx) {
        boolean mirrored = false, canJump = false;
        String onEndReached = "    on_end_reached: (context, current_x, current_y) => { },";
        StringBuilder explicits = new StringBuilder();
        for (var modifier : ctx.descriptionModifier()) {
            if (modifier instanceof BoardParser.DescriptionModifierMirroredContext) {
                mirrored = (Boolean) visit(modifier);
            } else if (modifier instanceof BoardParser.DescriptionModifierCanJumpContext) {
                canJump = (Boolean) visit(modifier);
            } else if (modifier instanceof BoardParser.DescriptionModifierOnEndReachedContext) {
                onEndReached = (String) visit(modifier);
            } else if (modifier instanceof BoardParser.DescriptionModifierExplicitContext) {
                explicits.append((String) visit(modifier));
                explicits.append("\n");
            } else {
                System.err.println("Something went wrong: line " + ctx.start.getLine());
            }
        }


        StringBuilder result = new StringBuilder(ctx.ID().getText());
        result.append(": {\n");
        result.append((String) visit(ctx.moves()));
        result.append(explicits.toString());
        result.append(onEndReached);
        result.append("\n");
        result.append("    representation: {\n" +
                "      img: \"\",\n" +
                "      letter: \"");
        result.append(ctx.ID().getText().toUpperCase().charAt(0));
        result.append("\"\n");
        result.append("    }\n" +
                "  }");
        return result.toString().replaceAll("%s",
                (mirrored ? "\nconst mirrored = context.board[current_x][current_y].piece.mirrored\n" +
                        "      if (mirrored)\n" +
                        "        reverse(result)\n" : ""));
    }


    @Override
    public Object visitDescriptionModifierOnEndReached(BoardParser.DescriptionModifierOnEndReachedContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("    on_end_reached: ");
        if (ctx.explicitParsed() != null)
            result.append(visit(ctx.explicitParsed()));
        else if (ctx.endReachedAlternatives() != null) {
            result.append(visit(ctx.endReachedAlternatives()));
        }
        result.append(",");
        return result.toString();
    }

    @Override
    public Object visitEndReachedAlternatives(BoardParser.EndReachedAlternativesContext ctx) {
        if (ctx.getChild(0).getText().equals("spawn")) {
            StringBuilder array = new StringBuilder("{");
            String sep = "";
            for (var id : ctx.ID()) {
                array.append(sep);
                array.append('"');
                array.append(id.getText());
                array.append("\" : 1");
                sep = ", ";
            }
            array.append('}');
            String template = " (context, current_x, current_y) => {\n" +
                    "      let response = \"\"\n" +
                    "      while (!%s[response]) {\n" +
                    "        let msg = \"Select one: \"\n" +
                    "        let sep = \"\"\n" +
                    "        for (let i in %s) {\n" +
                    "          msg += sep + i\n" +
                    "          sep = \", \"\n" +
                    "        }\n" +
                    "        response = prompt(msg)\n" +
                    "      }\n" +
                    "      context.board[current_x][current_y].piece.name = response\n" +
                    "    }";
            return String.format(template, array.toString(), array.toString());
        } else {
            System.err.println("Something went wrong: line " + ctx.start.getLine());
            System.exit(1);
            return null;
        }
    }

    @Override
    public Object visitDescriptionModifierExplicit(BoardParser.DescriptionModifierExplicitContext ctx) {
        return visit(ctx.explicitParsed());
    }

    @Override
    public Object visitDescriptionModifierCanJump(BoardParser.DescriptionModifierCanJumpContext ctx) {
        return ctx.BOOL() == null ? true : ctx.BOOL().getText().equals("true") ? true : false;
    }

    @Override
    public Object visitDescriptionModifierMirrored(BoardParser.DescriptionModifierMirroredContext ctx) {
        return ctx.BOOL() == null ? true : ctx.BOOL().getText().equals("true") ? true : false;
    }

    @Override
    public Object visitMoves(BoardParser.MovesContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("    moves: ({ current_x, current_y, context }) => {\n" +
                "      const result = [\n");
        for (var move : ctx.move()) {
            result.append(visit(move));
        }
        result.append("      ]\n" +
                "%s" +
                "      return result\n" +
                "    },\n");
        return result.toString();
    }

    @Override
    public Object visitMoveVector(BoardParser.MoveVectorContext ctx) {
        IntervalContainer[] intervals = (IntervalContainer[]) visit(ctx.vector());
        IntervalContainer xInterval = intervals[0];
        IntervalContainer yInterval = intervals[1];
        StringBuilder result = new StringBuilder();
        for (int x = xInterval.getLeft(); x < xInterval.getRight(); x++) {
            for (int y = yInterval.getLeft(); y < yInterval.getRight(); y++) {
                result.append("          {\n");
                result.append(String.format("            x: [%s, %s],\n", x, x + 1));
                result.append(String.format("            y: (x) => [%s, %s],\n", y, y + 1));
                result.append(String.format("            killing: %s\n", ctx.kills() == null ? "true" : visit(ctx.kills())));
                result.append("          },\n");
            }
        }
        return result.toString();
    }


    private IntervalContainer[] parseMoveFunctionInterval(Token e1, Token e2, ParserRuleContext ctx) {
        int right = (width > height ? width : height) + 2;
        int left = -right;
        if (e1 != null)
            left = Integer.parseInt(e1.getText());
        if (e2 != null)
            right = Integer.parseInt(e2.getText());
        if (right < left) {
            System.err.println("Intervals must be not empty: line " + ctx.start.getLine());
            System.exit(1);
        }
        IntervalContainer[] result = new IntervalContainer[2];
        if ((left < 0 && right < 0) || (0 < left && 0 < right)) {
            result[0] = new IntervalContainer(left, right + 1);
            result[1] = new IntervalContainer(0, 0);
        } else if (left < 0 && 0 < right) {
            result[0] = new IntervalContainer(left, 0);
            result[1] = new IntervalContainer(1, right + 1);
        }
        return result;
    }

    @Override
    public Object visitMoveFunctionDescription(BoardParser.MoveFunctionDescriptionContext ctx) {
        String kills = ctx.kills() == null ? "true" : (String) visit(ctx.kills());
        return ((String) visit(ctx.moveFunction())).replaceAll("%s", kills);
    }

    @Override
    public Object visitMoveFunctionDiagonal(BoardParser.MoveFunctionDiagonalContext ctx) {
        IntervalContainer[] intervals = parseMoveFunctionInterval(ctx.e1, ctx.e2, ctx);
        String template =
                "        {\n" +
                        "          x: %b0,\n" +
                        "          y: (x) => [x, x + 1],\n" +
                        "          killing: %s\n" +
                        "        },\n" +
                        "        {\n" +
                        "          x: %b1,\n" +
                        "          y: (x) => [x, x + 1],\n" +
                        "          killing: %s\n" +
                        "        },\n" +
                        "        {\n" +
                        "          x: %b0,\n" +
                        "          y: (x) => [-x, -x + 1],\n" +
                        "          killing: %s\n" +
                        "        },\n" +
                        "        {\n" +
                        "          x: %b1,\n" +
                        "          y: (x) => [-x, -x + 1],\n" +
                        "          killing: %s\n" +
                        "        },\n";
        template = template.replaceAll("%b0", intervals[0].toString());
        template = template.replaceAll("%b1", intervals[1].toString());
        return template;
    }

    @Override
    public Object visitMoveFunctionVertical(BoardParser.MoveFunctionVerticalContext ctx) {
        IntervalContainer[] intervals = parseMoveFunctionInterval(ctx.e1, ctx.e2, ctx);
        String template =
                "        {\n" +
                        "          x: [0, 1],\n" +
                        "          y: (x) => %b0,\n" +
                        "          killing: %s\n" +
                        "        },\n" +
                        "        {\n" +
                        "          x: [0, 1],\n" +
                        "          y: (x) => %b1,\n" +
                        "          killing: %s\n" +
                        "        },\n";
        template = template.replaceAll("%b0", intervals[0].toString());
        template = template.replaceAll("%b1", intervals[1].toString());
        return template;
    }

    @Override
    public Object visitMoveFunctionHorizontal(BoardParser.MoveFunctionHorizontalContext ctx) {
        IntervalContainer[] intervals = parseMoveFunctionInterval(ctx.e1, ctx.e2, ctx);
        String template =
                "        {\n" +
                        "          x: %b0,\n" +
                        "          y: (x) => [0, 1],\n" +
                        "          killing: %s\n" +
                        "        },\n" +
                        "        {\n" +
                        "          x: %b1,\n" +
                        "          y: (x) => [0, 1],\n" +
                        "          killing: %s\n" +
                        "        },\n";
        template = template.replaceAll("%b0", intervals[0].toString());
        template = template.replaceAll("%b1", intervals[1].toString());
        return template;
    }

    @Override
    public Object visitInitialPiecePositions(BoardParser.InitialPiecePositionsContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("export default {\n");
        result.append("  pieces: {\n");
        for (var piecePositions : ctx.initialPiecePosition()) {
            result.append((String) visit(piecePositions));
        }
        result.append("  }\n");
        result.append("}");
        return result.toString();
    }

    @Override
    public Object visitInitialPiecePosition(BoardParser.InitialPiecePositionContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("    " + ctx.ID().getText() + ": {\n");
        result.append((String) visit(ctx.positions(0)));
        boolean mirrored = false;
        int owner = 0;
        for (var modifier : ctx.positionModifier()) {
            if (modifier instanceof BoardParser.PositionModifierMirroredContext) {
                mirrored = (Boolean) visit(modifier);
            } else if (modifier instanceof BoardParser.PositionModifierOwnerContext) {
                owner = (Integer) visit(modifier);
            } else {
                System.err.println("Something went wrong: line " + ctx.start.getLine());
            }
        }
        result.append(String.format("      mirrored: %s,\n", mirrored ? "true" : "false"));
        result.append(String.format("      owner: %s,\n", owner));
        result.append("    },\n");
        return result.toString();
    }

    @Override
    public Object visitPositions(BoardParser.PositionsContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("      positions: [\n");
        for (var position : ctx.vector()) {
            IntervalContainer[] intervals = (IntervalContainer[]) visit(position);
            for (int x = intervals[0].getLeft(); x < intervals[0].getRight(); x++) {
                for (int y = intervals[1].getLeft(); y < intervals[1].getRight(); y++) {
                    result.append(String.format("        { x: %s, y: %s },\n", x, y));
                }
            }
        }
        result.append("      ],\n");
        return result.toString();
    }

    @Override
    public Object visitInvariantList(BoardParser.InvariantListContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("import resolve_moves from \"./resolve_moves.js\";\n" +
                "import pieces from \"./pieces.js\";\n" +
                "export default [\n");
        for (var invariant : ctx.invariant()) {
            result.append((String) visit(invariant));
        }
        result.append("]\n");
        return result.toString();
    }

    @Override
    public Object visitInvariantPawnMovement(BoardParser.InvariantPawnMovementContext ctx) {
        if (ctx.ID().size() == 0) {
            System.err.println("pawn_movement takes at least 1 argument: line " + ctx.start.getLine());
            System.exit(1);
        }
        String condition = "";
        String sep = "";
        for (var id : ctx.ID()) {
            condition += sep + "context.board[current_x][current_y].piece.name !== \"" + id.getText() + "\"";
            sep = " ||\n      ";
        }
        String template = "(context, current_x, current_y, target_x, target_y) => {\n" +
                "    if (!context.board[current_x][current_y].piece ||\n" +
                "      %s)\n" +
                "      return true\n" +
                "\n" +
                "    if (target_x === current_x) {\n" +
                "      if (!context.board[target_x][target_y].piece) {\n" +
                "        if (Math.abs(current_y - target_y) < 2)\n" +
                "          return true\n" +
                "        if (!context.board[current_x][current_y].piece.mirrored ?\n" +
                "          current_y === 1 : current_y === context.height - 2)\n" +
                "          return true\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    if (context.board[target_x][target_y].piece !== null)\n" +
                "      if (context.board[target_x][target_y].piece.owner !==\n" +
                "        context.board[current_x][current_y].piece.owner)\n" +
                "        return true\n" +
                "    return false\n" +
                "  },\n";
        return String.format(template, condition);
    }

    @Override
    public Object visitInvariantProtectPiece(BoardParser.InvariantProtectPieceContext ctx) {
        if (ctx.ID().size() == 0) {
            System.err.println("protect_piece takes at least 1 argument: line " + ctx.start.getLine());
            System.exit(1);
        }
        String condition = "";
        String sep = "";
        for (var id : ctx.ID()) {
            condition += sep + "temp_board[i][j].piece.name === \"" + id.getText() + "\"";
        }
        String template = "  (context, current_x, current_y, target_x, target_y) => {\n" +
                "    if (!context.board[current_x][current_y].piece)\n" +
                "      return true\n" +
                "\n" +
                "    for (let x = 0; x < context.width; x++) {\n" +
                "      for (let y = 0; y < context.width; y++) {\n" +
                "        if (x === target_x && y === target_y)\n" +
                "          continue\n" +
                "        if (context.board[x][y].piece\n" +
                "          && context.board[x][y].piece.owner !== context.board[current_x][current_y].piece.owner) {\n" +
                "          let temp_board = JSON.parse(JSON.stringify(context.board))\n" +
                "          temp_board[target_x][target_y].piece = { ...temp_board[current_x][current_y].piece }\n" +
                "          temp_board[current_x][current_y].piece = null\n" +
                "          resolve_moves(\n" +
                "            pieces[temp_board[x][y].piece.name].moves,\n" +
                "            x,\n" +
                "            y,\n" +
                "            {\n" +
                "              board: temp_board,\n" +
                "              height: context.height,\n" +
                "              width: context.width,\n" +
                "              current_player: context.current_player,\n" +
                "              focused: context.focused\n" +
                "            },\n" +
                "            false)()\n" +
                "          const targets = temp_board.map((e) => e.map((e2) => e2.target))\n" +
                "          for (let i = 0; i < context.width; i++) {\n" +
                "            for (let j = 0; j < context.width; j++) {\n" +
                "              if (targets[i][j] &&\n" +
                "                temp_board[i][j].piece &&\n" +
                "                (%s))\n" +
                "                return false\n" +
                "            }\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "    return true\n" +
                "  },\n";
        return String.format(template, condition);
    }

    @Override
    public Object visitInvariantCantRisk(BoardParser.InvariantCantRiskContext ctx) {
        if (ctx.ID().size() == 0) {
            System.err.println("cant_risk takes at least 1 argument: line " + ctx.start.getLine());
            System.exit(1);
        }
        String condition = "";
        String sep = "";
        for (var id : ctx.ID()) {
            condition += sep + "context.board[current_x][current_y].piece.name !== \"" + id.getText() + "\"";
            sep = " ||\n      ";
        }
        String template = "(context, current_x, current_y, target_x, target_y) => {\n" +
                "    if (!context.board[current_x][current_y].piece ||\n" +
                "      %s)\n" +
                "      return true\n" +
                "    for (let x = 0; x < context.width; x++) {\n" +
                "      for (let y = 0; y < context.width; y++) {\n" +
                "        if (x === current_x && y === current_y)\n" +
                "          continue\n" +
                "        if (context.board[x][y].piece\n" +
                "          && context.board[x][y].piece.owner !== context.board[current_x][current_y].piece.owner) {\n" +
                "          let temp_board = JSON.parse(JSON.stringify(context.board))\n" +
                "          temp_board[target_x][target_y].piece = { ...temp_board[current_x][current_y].piece }\n" +
                "          temp_board[current_x][current_y].piece = null\n" +
                "          resolve_moves(\n" +
                "            pieces[temp_board[x][y].piece.name].moves, \n" +
                "            x,\n" +
                "            y,\n" +
                "            {\n" +
                "              board: temp_board,\n" +
                "              height: context.height,\n" +
                "              width: context.width,\n" +
                "              current_player: context.current_player,\n" +
                "              focused: context.focused\n" +
                "            },\n" +
                "            false)()\n" +
                "          if (temp_board[target_x]\n" +
                "            && temp_board[target_x][target_y]\n" +
                "            && temp_board[target_x][target_y].target)\n" +
                "            return false\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "    return true;\n" +
                "  },\n";
        return String.format(template, condition);
    }

    @Override
    public Object visitFinish(BoardParser.FinishContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("import resolve_moves from \"./resolve_moves.js\"\n" +
                "import pieces from \"./pieces.js\"\n" +
                "export default [\n");
        for (var rule : ctx.finishingRules()) {
            result.append((String) visit(rule));
        }
        result.append("]");
        return result.toString();
    }


    @Override
    public Object visitFinishingNoMovesAvailable(BoardParser.FinishingNoMovesAvailableContext ctx) {
        return "  (context) => {\n" +
                "    for (let x = 0; x < context.width; x++) {\n" +
                "      for (let y = 0; y < context.width; y++) {\n" +
                "        if (context.board[x][y].piece\n" +
                "          && context.board[x][y].piece.owner === context.current_player) {\n" +
                "          let temp_board = JSON.parse(JSON.stringify(context.board))\n" +
                "          resolve_moves(\n" +
                "            pieces[temp_board[x][y].piece.name].moves,\n" +
                "            x,\n" +
                "            y,\n" +
                "            {\n" +
                "              board: temp_board,\n" +
                "              height: context.height,\n" +
                "              width: context.width,\n" +
                "              current_player: context.current_player,\n" +
                "              focused: context.focused\n" +
                "            },\n" +
                "            true)()\n" +
                "          const targets = temp_board.map((e) => e.map((e2) => e2.target))\n" +
                "          for (let i = 0; i < context.width; i++)\n" +
                "            for (let j = 0; j < context.width; j++)\n" +
                "              if (targets[i][j]) return false\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "    return true\n" +
                "  },\n";

    }

    @Override
    public Object visitFinishingExplicit(BoardParser.FinishingExplicitContext ctx) {
        return visit(ctx.explicitParsed());
    }

    @Override
    public Object visitInvariantExplicit(BoardParser.InvariantExplicitContext ctx) {
        return visit(ctx.explicitParsed());
    }

    @Override
    public Object visitMoveFunctionExplicit(BoardParser.MoveFunctionExplicitContext ctx) {
        return visit(ctx.explicitParsed());
    }

    @Override
    public Object visitPositionModifierMirrored(BoardParser.PositionModifierMirroredContext ctx) {
        return ctx.BOOL() == null ? true : ctx.BOOL().getText().equals("true") ? true : false;
    }

    @Override
    public Object visitPositionModifierOwner(BoardParser.PositionModifierOwnerContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Object visitKills(BoardParser.KillsContext ctx) {
        return ctx.BOOL() == null ? "true" : ctx.BOOL().getText();
    }

    @Override
    public Object visitMoveExplicit(BoardParser.MoveExplicitContext ctx) {
        return visit(ctx.explicitParsed());
    }

    @Override
    public Object visitPieceDescriptionExplicit(BoardParser.PieceDescriptionExplicitContext ctx) {
        return visit(ctx.explicitParsed());
    }


    @Override
    public Object visitVector(BoardParser.VectorContext ctx) {
        return new IntervalContainer[]{
                (IntervalContainer) visit(ctx.e1),
                (IntervalContainer) visit(ctx.e2)
        };
    }

    @Override
    public Object visitFullInterval(BoardParser.FullIntervalContext ctx) {
        return new IntervalContainer(Integer.parseInt(ctx.INT(0).getText()), Integer.parseInt(ctx.INT(1).getText()) + 1);
    }

    @Override
    public Object visitDegenInterval(BoardParser.DegenIntervalContext ctx) {
        Integer number = Integer.parseInt(ctx.INT().getText());
        return new IntervalContainer(number, number + 1);
    }

    @Override
    public Object visitExplicitParsed(BoardParser.ExplicitParsedContext ctx) {
        String txt = ctx.EXPLICIT().getText();
        txt = txt.substring(8).trim(); //cleans explicit
        return txt.substring(1, txt.length() - 1); //cleans {}
    }

    class IntervalContainer {
        private int left, right;

        public IntervalContainer(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public int getRight() {
            return right;
        }

        public int getLeft() {
            return left;
        }

        @Override
        public String toString() {
            return "[" + left + ", " + right + "]";
        }
    }
}
