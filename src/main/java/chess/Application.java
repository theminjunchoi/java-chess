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
            boardView.displayTurn(board.getTurn());

            final String startInfo = inputView.readStartPosition();
            if (startInfo.equals("end")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            final String endInfo = inputView.readEndPosition();
            final Position start = Position.of(startInfo.replace(" ", ""));
            final Position end = Position.of(endInfo.replace(" ", ""));

            move(board, start, end);
        }
    }

    private void move(final Board board, final Position start, final Position end) {
        try {
            board.move(start, end);
            boardView.display(board.getBoard());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
