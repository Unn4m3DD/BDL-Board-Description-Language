import antlr4.BoardBaseListener;
import antlr4.BoardListener;
import antlr4.BoardParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TreeListener extends BoardBaseListener {
    int width = 8, height = 8;
    //    PrintWriter piecesWriter = new PrintWriter(new File("generated/pieces.js"));
//    PrintWriter rulesWriter = new PrintWriter(new File("generated/rules.js"));
//    PrintWriter initialStatusWriter = new PrintWriter(new File("generated/initial_status.js"));
//    PrintWriter invariantsWriter = new PrintWriter(new File("generated/invariants.js"));
//    PrintWriter finishingWriter = new PrintWriter(new File("generated/finishing.js"));
    PrintWriter piecesWriter = new PrintWriter(new File("../generated_target_example/pieces.js"));
    PrintWriter rulesWriter = new PrintWriter(new File("../generated_target_example/rules.js"));
    PrintWriter initialStatusWriter = new PrintWriter(new File("../generated_target_example/initial_status.js"));
    PrintWriter invariantsWriter = new PrintWriter(new File("../generated_target_example/invariants.js"));
    PrintWriter finishingWriter = new PrintWriter(new File("../generated_target_example/finishing.js"));

    public TreeListener() throws FileNotFoundException {
    }

    @Override
    public void enterPiecesDescription(BoardParser.PiecesDescriptionContext ctx) {
        piecesWriter.println("function reverse(array) {\n" +
                "  for (let i = 0; i < array.length; i++) {\n" +
                "    const func = array[i].y\n" +
                "    array[i].y = (x) => {\n" +
                "      const tmp = func\n" +
                "      return [-tmp(x)[1] + 1, -tmp(x)[0] + 1]\n" +
                "    }\n" +
                "  }\n" +
                "}\n" +
                "const pieces = {");
    }

    @Override
    public void exitPiecesDescription(BoardParser.PiecesDescriptionContext ctx) {
        piecesWriter.println("}\n\n" +
                "export default pieces");
        piecesWriter.close();
    }

    @Override
    public void enterPieceDescription(BoardParser.PieceDescriptionContext ctx) {
        piecesWriter.println("  " + ctx.name().getText() + ": {");
    }

    @Override
    public void exitPieceDescription(BoardParser.PieceDescriptionContext ctx) {
        boolean canJumpDefined = false;
        for (int i = 0; ctx.pieceDescriptionProperty(i) != null; i++) {
            if (ctx.pieceDescriptionProperty(i).canJump() != null) canJumpDefined = true;
        }
        if (!canJumpDefined)
            piecesWriter.printf("    %s: %s,\n", "can_jump", false);

        boolean onEndReached = false;
        for (int i = 0; ctx.pieceDescriptionProperty(i) != null; i++) {
            if (ctx.pieceDescriptionProperty(i).onEndReached() != null) onEndReached = true;
        }
        if (!onEndReached)
            piecesWriter.println("    on_end_reached: (context, current_x, current_y) => { },");

        piecesWriter.printf("    representation: {\n" +
                "      img: \"\",\n" +
                "      letter: \"%s\"\n" +
                "    }\n" +
                "  },\n", ("" + ctx.name().getText().charAt(0)).toUpperCase());
    }

    @Override
    public void enterInitialStatus(BoardParser.InitialStatusContext ctx) {
        initialStatusWriter.println("export default {");
    }

    @Override
    public void exitInitialStatus(BoardParser.InitialStatusContext ctx) {
        initialStatusWriter.println("}");
        initialStatusWriter.close();
    }

    @Override
    public void enterPiecesInitialStatus(BoardParser.PiecesInitialStatusContext ctx) {
        initialStatusWriter.println("  pieces: {");
    }

    @Override
    public void exitPiecesInitialStatus(BoardParser.PiecesInitialStatusContext ctx) {
        initialStatusWriter.println("  }");
    }

    @Override
    public void enterPieceInitialStatus(BoardParser.PieceInitialStatusContext ctx) {
        initialStatusWriter.printf("    %s: {\n", ctx.name().getText());
    }

    @Override
    public void exitPieceInitialStatus(BoardParser.PieceInitialStatusContext ctx) {

        boolean definedMirrored = false;
        for (int i = 0; ctx.pieceInitialStatusProperty(i) != null; i++) {
            if (ctx.pieceInitialStatusProperty(i).mirrored() != null)
                definedMirrored = true;
        }
        if (!definedMirrored)
            initialStatusWriter.println("      mirrored: false,");
        boolean definedOwner = false;
        for (int i = 0; ctx.pieceInitialStatusProperty(i) != null; i++) {
            if (ctx.pieceInitialStatusProperty(i).owner() != null)
                definedOwner = true;
        }
        if (!definedOwner)
            initialStatusWriter.println("      owner: 0,");
        initialStatusWriter.println("    },");
    }

    @Override
    public void enterPieceInitialStatusProperty(BoardParser.PieceInitialStatusPropertyContext ctx) {
        if (ctx.mirrored() != null) {
            initialStatusWriter.println("      mirrored: " + (ctx.mirrored().bool() == null ? "true" : ctx.mirrored().bool().getText()) + ",");
        }
    }

    @Override
    public void enterOwner(BoardParser.OwnerContext ctx) {
        initialStatusWriter.println("      owner: " + ctx.VALUE().getText() + ",");
    }

    @Override
    public void enterPositions(BoardParser.PositionsContext ctx) {
        initialStatusWriter.println("      positions: [");
        for (int i = 0; ctx.coordinates(i) != null; i++) {
            int[] xBounds = new int[2];
            int[] yBounds = new int[2];
            if (ctx.coordinates(i).x().interval() != null) {
                xBounds[0] = Integer.parseInt(ctx.coordinates(i).x().interval().VALUE(0).getText());
                xBounds[1] = Integer.parseInt(ctx.coordinates(i).x().interval().VALUE(1).getText());
            } else {
                xBounds[0] = Integer.parseInt(ctx.coordinates(i).x().VALUE().getText());
                xBounds[1] = Integer.parseInt(ctx.coordinates(i).x().VALUE().getText());
            }
            if (ctx.coordinates(i).y().interval() != null) {
                yBounds[0] = Integer.parseInt(ctx.coordinates(i).y().interval().VALUE(0).getText());
                yBounds[1] = Integer.parseInt(ctx.coordinates(i).y().interval().VALUE(1).getText());
            } else {
                yBounds[0] = Integer.parseInt(ctx.coordinates(i).y().VALUE().getText());
                yBounds[1] = Integer.parseInt(ctx.coordinates(i).y().VALUE().getText());
            }
            for (int x = xBounds[0]; x <= xBounds[1]; x++) {
                for (int y = yBounds[0]; y <= yBounds[1]; y++) {
                    initialStatusWriter.printf("        { x: %s, y: %s },\n", x, y);
                }
            }
        }
    }

    @Override
    public void exitPositions(BoardParser.PositionsContext ctx) {
        initialStatusWriter.println("      ],");
    }

    @Override
    public void enterRules(BoardParser.RulesContext ctx) {
        rulesWriter.println("export default {");
    }

    @Override
    public void exitRules(BoardParser.RulesContext ctx) {
        rulesWriter.println("}");
        rulesWriter.close();
    }

    @Override
    public void enterFirstPlayer(BoardParser.FirstPlayerContext ctx) {
        rulesWriter.println("  first_player: " + ctx.VALUE().getText() + ",");
    }

    @Override
    public void enterWidth(BoardParser.WidthContext ctx) {
        width = Integer.parseInt(ctx.VALUE().getText());
        rulesWriter.println("  width: " + ctx.VALUE().getText() + ",");
    }

    @Override
    public void enterHeight(BoardParser.HeightContext ctx) {
        height = Integer.parseInt(ctx.VALUE().getText());
        rulesWriter.println("  height: " + ctx.VALUE().getText() + ",");
    }

    @Override
    public void enterColoring(BoardParser.ColoringContext ctx) {
        rulesWriter.print("  board_coloring_rule: ");
    }

    @Override
    public void exitColoring(BoardParser.ColoringContext ctx) {
        rulesWriter.println(",");
    }

    @Override
    public void enterKnownColorings(BoardParser.KnownColoringsContext ctx) {
        if (ctx.getText().equals("alternate"))
            rulesWriter.print("(x, y, last_color) => {\n" +
                    "    if (y === 0) last_color = last_color === \"#ffffff\" ? \"#c90\" : \"#ffffff\"\n" +
                    "    last_color = last_color === \"#ffffff\" ? \"#c90\" : \"#ffffff\"\n" +
                    "    return last_color\n" +
                    "  }");
    }

    @Override
    public void enterPlayerChange(BoardParser.PlayerChangeContext ctx) {
        rulesWriter.print("  player_change_rule: ");
    }

    @Override
    public void exitPlayerChange(BoardParser.PlayerChangeContext ctx) {
        rulesWriter.println(",");
    }

    @Override
    public void enterKnownPlayerChanges(BoardParser.KnownPlayerChangesContext ctx) {
        if (ctx.getText().equals("alternate"))
            rulesWriter.print("(context) => {\n" +
                    "    context.current_player = context.current_player === 0 ? 1 : 0\n" +
                    "  }");
    }

    @Override
    public void exitKnownPlayerChanges(BoardParser.KnownPlayerChangesContext ctx) {

    }

    @Override
    public void enterInvariants(BoardParser.InvariantsContext ctx) {
        invariantsWriter.println("import resolve_moves from \"./resolve_moves.js\";\n" +
                "import pieces from \"./pieces.js\";\n" +
                "export default [");
    }

    @Override
    public void exitInvariants(BoardParser.InvariantsContext ctx) {
        invariantsWriter.println("]");
        invariantsWriter.close();
    }

    @Override
    public void enterKnownInvariants(BoardParser.KnownInvariantsContext ctx) {
        if (ctx.cantRisk() != null) {
            String condition = "";
            String sep = "";
            for (int i = 0; ctx.cantRisk().stringArray().STRING(i) != null; i++) {
                condition += sep + "context.board[current_x][current_y].piece.name !== \"" +
                        ctx.cantRisk().stringArray().STRING(i).getText() + "\"";
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
            invariantsWriter.printf(template, condition);
        }
        if (ctx.protectPiece() != null) {
            String condition = "";
            String sep = "";
            for (int i = 0; ctx.protectPiece().stringArray().STRING(i) != null; i++) {
                condition += sep + "temp_board[i][j].piece.name === \"" +
                        ctx.protectPiece().stringArray().STRING(i).getText() + "\"";
                sep = " || \n                ";
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
            invariantsWriter.printf(template, condition);
        }
        if (ctx.pawnMovement() != null) {
            String condition = "";
            String sep = "";
            for (int i = 0; ctx.pawnMovement().stringArray().STRING(i) != null; i++) {
                condition += sep + "context.board[current_x][current_y].piece.name !== \"" +
                        ctx.pawnMovement().stringArray().STRING(i).getText() + "\"";
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
            invariantsWriter.printf(template, condition);
        }

    }

    @Override
    public void enterFinish(BoardParser.FinishContext ctx) {
        finishingWriter.println("import resolve_moves from \"./resolve_moves.js\"\n" +
                "import pieces from \"./pieces.js\"\n" +
                "export default [");
    }

    @Override
    public void exitFinish(BoardParser.FinishContext ctx) {
        finishingWriter.println("]");
        finishingWriter.close();
    }

    @Override
    public void enterKnownFinish(BoardParser.KnownFinishContext ctx) {
        if (ctx.noMovesAvailable() != null) {
            finishingWriter.println("  (context) => {\n" +
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
                    "  },");
        }
    }

    @Override
    public void enterMoves(BoardParser.MovesContext ctx) {
        piecesWriter.println("    moves: ({ current_x, current_y, context }) => {\n" +
                "      const result = [");
    }

    @Override
    public void exitMoves(BoardParser.MovesContext ctx) {
        boolean mirrored = false;
        if (ctx.getParent() instanceof BoardParser.PieceDescriptionContext) {
            BoardParser.PieceDescriptionContext parentCtx = (BoardParser.PieceDescriptionContext) ctx.getParent();
            for (int i = 0; parentCtx.pieceDescriptionProperty(i) != null; i++) {
                if (parentCtx.pieceDescriptionProperty(i).mirrored() != null)
                    mirrored = parentCtx.pieceDescriptionProperty(i).mirrored().bool() == null ? true : parentCtx.pieceDescriptionProperty(i).mirrored().bool().getText().equals("true");
            }
        }
        piecesWriter.println("    ]\n" +
                (mirrored ? (
                        "      const mirrored = context.board[current_x][current_y].piece.mirrored\n" +
                                "      if (mirrored)\n" +
                                "        reverse(result)\n") : "") +
                "      return result\n" +
                "    },");
    }

    @Override
    public void enterDirection(BoardParser.DirectionContext ctx) {
        boolean kills = true;
        if (ctx.getParent() instanceof BoardParser.MoveContext) {
            BoardParser.MoveContext parentCtx = (BoardParser.MoveContext) ctx.getParent();
            for (int i = 0; parentCtx.moveProperty(i) != null; i++) {
                if (parentCtx.moveProperty(i).killing() != null) {
                    kills = parentCtx.moveProperty(i).killing().bool() == null ? true : parentCtx.moveProperty(i).killing().bool().getText().equals("true");
                }
            }
        }
        String template = "      {\n" +
                "        x: %s,\n" +
                "        y: (x) => %s,\n" +
                "        killing: %s\n" +
                "      },\n";
        if (ctx.languageKeywords() != null) {
            int min = 0, max = 0;
            String[] bounds = {"", ""};
            String keyword = ctx.languageKeywords().getText();
            if (keyword.equals("horizontal") || keyword.equals("diagonal")) {
                min = ctx.pair().VALUE(0) == null ? -width : Integer.parseInt(ctx.pair().VALUE(0).getText());
                max = ctx.pair().VALUE(1) == null ? width : Integer.parseInt(ctx.pair().VALUE(1).getText());
            }
            if (keyword.equals("vertical")) {
                min = ctx.pair().VALUE(0) == null ? -height : Integer.parseInt(ctx.pair().VALUE(0).getText());
                max = ctx.pair().VALUE(1) == null ? height : Integer.parseInt(ctx.pair().VALUE(1).getText());
            }
            if (min < 0 && 0 < max)
                bounds[0] += "[" + min + ", " + "0]";
            else if (min < 0 && max < 0)
                bounds[0] += "[" + min + ", " + (max + 1) + "]";
            if (0 < min && 0 < max)
                bounds[1] += "[" + min + ", " + (max + 1) + "]";
            else if (min < 0 && 0 < max)
                bounds[1] += "[1, " + (max + 1) + "]";
            for (var bound : bounds) {
                if (!bound.equals(""))
                    if (!keyword.equals("diagonal"))
                        piecesWriter.printf(template,
                                !keyword.equals("vertical") ? bound : "[0, 1]",
                                keyword.equals("vertical") ? bound : "[0, 1]",
                                kills);
                    else {
                        piecesWriter.printf(template,
                                bound,
                                "[x, x + 1]",
                                kills);

                        piecesWriter.printf(template,
                                bound,
                                "[-x, -x + 1]",
                                kills);
                    }

            }
        } else if (ctx.coordinates() != null) {
            int x = Integer.parseInt(ctx.coordinates().x().getText());
            int y = Integer.parseInt(ctx.coordinates().y().getText());
            piecesWriter.printf(template,
                    "[" + x + ", " + (x + 1) + "]",
                    "[" + y + ", " + (y + 1) + "]",
                    kills);
        }
    }

    @Override
    public void enterOnEndReached(BoardParser.OnEndReachedContext ctx) {
        piecesWriter.print("    on_end_reached:");
    }

    @Override
    public void exitOnEndReached(BoardParser.OnEndReachedContext ctx) {
        piecesWriter.println(",");
    }

    @Override
    public void enterSpawnFunction(BoardParser.SpawnFunctionContext ctx) {
        String array = "[";
        String sep = "";
        for (int i = 0; ctx.stringArray().STRING(i) != null; i++) {
            array += sep + '"' + ctx.stringArray().STRING(i).getText() + '"';
            sep = ", ";
        }
        array += "]";
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
        piecesWriter.printf(template, array, array);
    }

    @Override
    public void enterCanJump(BoardParser.CanJumpContext ctx) {
        String canJump = ctx.bool() == null ? "false" : ctx.bool().getText();
        piecesWriter.printf("    can_jump: %s,\n", canJump);
    }
}
