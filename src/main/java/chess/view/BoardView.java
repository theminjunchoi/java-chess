package chess.view;

import chess.piece.Color;
import chess.piece.Piece;
import chess.piece.Type;
import chess.position.Column;
import chess.position.Position;
import chess.position.Row;
import chess.turn.Turn;
import java.util.Map;

public class BoardView {

    private static final Map<Type, String> PIECE_NAME = Map.of(
            Type.BISHOP, "b",
            Type.KING, "k",
            Type.KNIGHT, "n",
            Type.PAWN, "p",
            Type.QUEEN, "q",
            Type.ROOK, "r"
    );

    public void display(final Map<Position, Piece> board) {
        System.out.println();
        System.out.println("   a b c d e f g h");
        for (Row row : Row.values()) {
            System.out.print(8 - row.ordinal() + "  ");
            printRow(board, row);
        }
    }

    private static void printRow(final Map<Position, Piece> board, final Row row) {
        for (Column column : Column.values()) {
            printColumn(board, row, column);
        }
        System.out.println();
    }

    private static void printColumn(final Map<Position, Piece> board, final Row row, final Column column) {
        if (board.containsKey(new Position(row, column))) {
            displayPiece(board, row, column);
            return;
        }
        System.out.print("_ ");
    }

    private static void displayPiece(final Map<Position, Piece> board, final Row row, final Column column) {
        final Piece piece = board.get(new Position(row, column));
        if (piece.isColor(Color.WHITE)) {
            System.out.print(PIECE_NAME.get(piece.type()) + " ");
            return;
        }
        System.out.print(PIECE_NAME.get(piece.type()).toUpperCase() + " ");
    }

    public void displayTurn(final Turn turn) {
        System.out.println(turn.getName() + "의 차례입니다.");
    }
}
