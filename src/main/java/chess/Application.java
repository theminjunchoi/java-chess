package chess;

import chess.view.BoardView;

public class Application {

    private final BoardView boardView = new BoardView();

    public static void main(String[] args) {
        final Application chess = new Application();
        chess.run();
    }

    private void run() {
        final Board board = BoardGenerator.generateBoard();
        boardView.display(board.getBoard());
    }
}
