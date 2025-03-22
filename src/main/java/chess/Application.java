package chess;

import chess.board.Board;
import chess.board.BoardGenerator;
import chess.position.Position;
import chess.view.BoardView;
import chess.view.InputView;

public class Application {

    private final BoardView boardView = new BoardView();
    private final InputView inputView = new InputView();

    public static void main(String[] args) {
        final Application chess = new Application();
        chess.run();
    }

    private void run() {
        final Board board = BoardGenerator.generateBoard();
        boardView.display(board.getBoard());

        while (true) {
            final String startInfo = inputView.readStartPosition();
            final String endInfo = inputView.readEndPosition();

            final Position start = Position.of(startInfo.replace(" ", ""));
            final Position end = Position.of(endInfo.replace(" ", ""));

            board.move(start, end);

            boardView.display(board.getBoard());
        }
    }
}
