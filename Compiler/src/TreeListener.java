import antlr4.BoardListener;
import antlr4.BoardParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TreeListener implements BoardListener {
    int width = 8, height = 8;
    PrintWriter piecesWriter = new PrintWriter(new File("generated/pieces.js"));

    public TreeListener() throws FileNotFoundException {
    }

    @Override
    public void enterGame(BoardParser.GameContext ctx) {
    }

    @Override
    public void exitGame(BoardParser.GameContext ctx) {
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
    public void enterPieceDescriptionProperty(BoardParser.PieceDescriptionPropertyContext ctx) {

    }

    @Override
    public void exitPieceDescriptionProperty(BoardParser.PieceDescriptionPropertyContext ctx) {

    }

    @Override
    public void enterInitialStatus(BoardParser.InitialStatusContext ctx) {
    }

    @Override
    public void exitInitialStatus(BoardParser.InitialStatusContext ctx) {
    }

    @Override
    public void enterPiecesInitialStatus(BoardParser.PiecesInitialStatusContext ctx) {
    }

    @Override
    public void exitPiecesInitialStatus(BoardParser.PiecesInitialStatusContext ctx) {
    }

    @Override
    public void enterPieceInitialStatus(BoardParser.PieceInitialStatusContext ctx) {
    }

    @Override
    public void exitPieceInitialStatus(BoardParser.PieceInitialStatusContext ctx) {
    }

    @Override
    public void enterPieceInitialStatusProperty(BoardParser.PieceInitialStatusPropertyContext ctx) {

    }

    @Override
    public void exitPieceInitialStatusProperty(BoardParser.PieceInitialStatusPropertyContext ctx) {

    }

    @Override
    public void enterPositions(BoardParser.PositionsContext ctx) {
    }

    @Override
    public void exitPositions(BoardParser.PositionsContext ctx) {
    }

    @Override
    public void enterRules(BoardParser.RulesContext ctx) {
        System.out.println("export default {");
    }

    @Override
    public void exitRules(BoardParser.RulesContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterRuleDef(BoardParser.RuleDefContext ctx) {
    }

    @Override
    public void exitRuleDef(BoardParser.RuleDefContext ctx) {
    }

    @Override
    public void enterFirstPlayer(BoardParser.FirstPlayerContext ctx) {
        System.out.println("  first_player: " + ctx.VALUE().getText() + ",");
    }

    @Override
    public void exitFirstPlayer(BoardParser.FirstPlayerContext ctx) {

    }

    @Override
    public void enterWidth(BoardParser.WidthContext ctx) {
        System.out.println("  width: " + ctx.VALUE().getText() + ",");
    }

    @Override
    public void exitWidth(BoardParser.WidthContext ctx) {

    }

    @Override
    public void enterHeight(BoardParser.HeightContext ctx) {
        System.out.println("  height: " + ctx.VALUE().getText() + ",");
    }

    @Override
    public void exitHeight(BoardParser.HeightContext ctx) {

    }

    @Override
    public void enterColoring(BoardParser.ColoringContext ctx) {
        System.out.print("  board_coloring_rule: ");
    }

    @Override
    public void exitColoring(BoardParser.ColoringContext ctx) {
        System.out.println(",");
    }

    @Override
    public void enterKnownColorings(BoardParser.KnownColoringsContext ctx) {
        if (ctx.getText().equals("alternate"))
            System.out.print("(x, y, last_color) => {\n" +
                    "    if (y === 0) last_color = last_color === \"#ffffff\" ? \"#c90\" : \"#ffffff\"\n" +
                    "    last_color = last_color === \"#ffffff\" ? \"#c90\" : \"#ffffff\"\n" +
                    "    return last_color\n" +
                    "  }");
    }

    @Override
    public void exitKnownColorings(BoardParser.KnownColoringsContext ctx) {
    }

    @Override
    public void enterPlayerChange(BoardParser.PlayerChangeContext ctx) {
        System.out.print("  player_change_rule: ");
    }

    @Override
    public void exitPlayerChange(BoardParser.PlayerChangeContext ctx) {
        System.out.println(",");
    }

    @Override
    public void enterKnownPlayerChanges(BoardParser.KnownPlayerChangesContext ctx) {
        if (ctx.getText().equals("alternate"))
            System.out.print("(context) => {\n" +
                    "    context.current_player = context.current_player === 0 ? 1 : 0\n" +
                    "  }");
    }

    @Override
    public void exitKnownPlayerChanges(BoardParser.KnownPlayerChangesContext ctx) {

    }

    @Override
    public void enterInvariants(BoardParser.InvariantsContext ctx) {
    }

    @Override
    public void exitInvariants(BoardParser.InvariantsContext ctx) {
    }

    @Override
    public void enterFinish(BoardParser.FinishContext ctx) {
    }

    @Override
    public void exitFinish(BoardParser.FinishContext ctx) {
    }

    @Override
    public void enterFunction(BoardParser.FunctionContext ctx) {
    }

    @Override
    public void exitFunction(BoardParser.FunctionContext ctx) {
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
    public void enterMove(BoardParser.MoveContext ctx) {
    }

    @Override
    public void exitMove(BoardParser.MoveContext ctx) {
    }

    @Override
    public void enterMoveProperty(BoardParser.MovePropertyContext ctx) {

    }

    @Override
    public void exitMoveProperty(BoardParser.MovePropertyContext ctx) {


    }

    @Override
    public void enterKilling(BoardParser.KillingContext ctx) {
    }

    @Override
    public void exitKilling(BoardParser.KillingContext ctx) {

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
                    piecesWriter.printf(template,
                            !keyword.equals("vertical") ? bound : "[0, 1]",
                            keyword.equals("vertical") ? bound : keyword.equals("horizontal") ? "[0, 1]" : "[x, x + 1]",
                            kills);

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
    public void exitDirection(BoardParser.DirectionContext ctx) {
    }

    @Override
    public void enterCoordinates(BoardParser.CoordinatesContext ctx) {
    }

    @Override
    public void exitCoordinates(BoardParser.CoordinatesContext ctx) {
    }

    @Override
    public void enterPair(BoardParser.PairContext ctx) {
    }

    @Override
    public void exitPair(BoardParser.PairContext ctx) {
    }

    @Override
    public void enterX(BoardParser.XContext ctx) {
    }

    @Override
    public void exitX(BoardParser.XContext ctx) {
    }

    @Override
    public void enterY(BoardParser.YContext ctx) {
    }

    @Override
    public void exitY(BoardParser.YContext ctx) {
    }

    @Override
    public void enterInterval(BoardParser.IntervalContext ctx) {
    }

    @Override
    public void exitInterval(BoardParser.IntervalContext ctx) {
    }

    @Override
    public void enterExplicit(BoardParser.ExplicitContext ctx) {
    }

    @Override
    public void exitExplicit(BoardParser.ExplicitContext ctx) {
    }

    @Override
    public void enterExplicitContent(BoardParser.ExplicitContentContext ctx) {

    }

    @Override
    public void exitExplicitContent(BoardParser.ExplicitContentContext ctx) {

    }

    @Override
    public void enterLanguageKeywords(BoardParser.LanguageKeywordsContext ctx) {

    }

    @Override
    public void exitLanguageKeywords(BoardParser.LanguageKeywordsContext ctx) {

    }

    @Override
    public void enterName(BoardParser.NameContext ctx) {
    }

    @Override
    public void exitName(BoardParser.NameContext ctx) {
    }

    @Override
    public void enterInvariant(BoardParser.InvariantContext ctx) {
    }

    @Override
    public void exitInvariant(BoardParser.InvariantContext ctx) {
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
    public void enterEndReachedFunctions(BoardParser.EndReachedFunctionsContext ctx) {

    }

    @Override
    public void exitEndReachedFunctions(BoardParser.EndReachedFunctionsContext ctx) {

    }

    @Override
    public void enterEndReachedKnownFunctions(BoardParser.EndReachedKnownFunctionsContext ctx) {
    }

    @Override
    public void exitEndReachedKnownFunctions(BoardParser.EndReachedKnownFunctionsContext ctx) {

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
    public void exitSpawnFunction(BoardParser.SpawnFunctionContext ctx) {

    }

    @Override
    public void enterStringArray(BoardParser.StringArrayContext ctx) {

    }

    @Override
    public void exitStringArray(BoardParser.StringArrayContext ctx) {

    }

    @Override
    public void enterCanJump(BoardParser.CanJumpContext ctx) {
        String canJump = ctx.bool() == null ? "false" : ctx.bool().getText();
        piecesWriter.printf("    can_jump: %s,\n", canJump);
    }

    @Override
    public void exitCanJump(BoardParser.CanJumpContext ctx) {

    }

    @Override
    public void enterMirrored(BoardParser.MirroredContext ctx) {
    }

    @Override
    public void exitMirrored(BoardParser.MirroredContext ctx) {

    }

    @Override
    public void enterBool(BoardParser.BoolContext ctx) {

    }

    @Override
    public void exitBool(BoardParser.BoolContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
    }
}
