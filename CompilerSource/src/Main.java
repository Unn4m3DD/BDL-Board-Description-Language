import antlr4.BoardLexer;
import antlr4.BoardParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main(args);
    }

    Main(String[] args) throws IOException {
        File dir = new File(args[1]);
        if (!dir.exists())
            dir.mkdir();
        if (!dir.isDirectory()) {
            System.err.println(args[1] + "already exists");
            System.exit(1);
        }
        for (var name : new String[]{"app.js", "app.html", "create_board.js", "gameLogic.js", "pieces.js", "renderer.js", "resolve_moves.js"}) {
            createAuxFile(dir, name);
        }


        CharStream cs = CharStreams.fromFileName(args[0]);
        BoardLexer lexer = new BoardLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BoardParser parser = new BoardParser(tokens);

        ParseTree tree = parser.game();
        TreeListener listener = new TreeListener(dir.getPath());

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }

    private void createAuxFile(File dir, String fileName) throws IOException {
        File app = new File(dir.getPath() + File.separator + fileName);
        OutputStream os = new FileOutputStream(app);
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("auxResources/" + fileName);
        copyInputStreamToFile(is, app);
    }

    private void copyInputStreamToFile(InputStream inputStream, File file) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            int read;
            byte[] bytes = new byte[1024];
            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
        }
    }
}
