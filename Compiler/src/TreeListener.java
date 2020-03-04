import antlr4.BoardListener;
import antlr4.BoardParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TreeListener implements BoardListener {
    int width = 8, height = 8;

    @Override
    public void enterGame(BoardParser.GameContext ctx) {
    }

    @Override
    public void exitGame(BoardParser.GameContext ctx) {
    }

    @Override
    public void enterPiecesDescription(BoardParser.PiecesDescriptionContext ctx) {
        System.out.println("function reverse(array) {\n" +
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
        System.out.println("}");
    }

    @Override
    public void enterPieceDescription(BoardParser.PieceDescriptionContext ctx) {
        System.out.println("  " + ctx.name().getText() + ": {");
    }

    @Override
    public void exitPieceDescription(BoardParser.PieceDescriptionContext ctx) {
        boolean canJumpDefined = false;
        for (int i = 0; ctx.pieceDescriptionProperty(i) != null; i++) {
            if (ctx.pieceDescriptionProperty(i).canJump() != null) canJumpDefined = true;
        }
        if (!canJumpDefined)
            System.out.printf("    %s: %s,\n", "can_jump", false);

        boolean onEndReached = false;
        for (int i = 0; ctx.pieceDescriptionProperty(i) != null; i++) {
            if (ctx.pieceDescriptionProperty(i).onEndReached() != null) onEndReached = true;
        }
        if (!onEndReached)
            System.out.println("    on_end_reached: (context, current_x, current_y) => { },");

        System.out.println("  },");
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
    }

    @Override
    public void exitRules(BoardParser.RulesContext ctx) {
    }

    @Override
    public void enterRuleDef(BoardParser.RuleDefContext ctx) {
    }

    @Override
    public void exitRuleDef(BoardParser.RuleDefContext ctx) {
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
        System.out.println("    moves: ({ current_x, current_y, context }) => [");
    }

    @Override
    public void exitMoves(BoardParser.MovesContext ctx) {
        System.out.println("    ],");
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
                    kills = parentCtx.moveProperty(i).killing().bool().getText().equals("true");
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
                    System.out.printf(template,
                            !keyword.equals("vertical") ? bound : "[0, 1]",
                            keyword.equals("vertical") ? bound : keyword.equals("horizontal") ? "[0, 1]" : "[x, x + 1]",
                            kills);

            }
        } else if (ctx.coordinates() != null) {
            int x = Integer.parseInt(ctx.coordinates().x().getText());
            int y = Integer.parseInt(ctx.coordinates().y().getText());
            System.out.printf(template,
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
        System.out.print("    on_end_reached:");
    }

    @Override
    public void exitOnEndReached(BoardParser.OnEndReachedContext ctx) {
        System.out.println(",");
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
        System.out.printf(template, array, array);
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
        System.out.printf("    %s: %s,\n", "can_jump", ctx.bool().getText());
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
