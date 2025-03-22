package chess.view;

import chess.piece.Color;
import chess.piece.Piece;
import chess.piece.Type;
import chess.position.Column;
import chess.position.Position;
import chess.position.Row;
import java.util.Map;

public class BoardView {

    private static final Map<Row, String> ROW_NAME = Map.of(
            Row.EIGHT, "8",
            Row.SEVEN, "7",
            Row.SIX, "6",
            Row.FIVE, "5",
            Row.FOUR, "4",
            Row.THREE, "3",
            Row.TWO, "2",
            Row.ONE, "1"
    );
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
            System.out.print(ROW_NAME.get(row) + "  ");
            for (Column column : Column.values()) {
                if (board.containsKey(new Position(row, column))) {
                    final Piece piece = board.get(new Position(row, column));
                    if (piece.isColor(Color.WHITE)) {
                        System.out.print(PIECE_NAME.get(piece.type()) + " ");
                        continue;
                    }
                    System.out.print(PIECE_NAME.get(piece.type()).toUpperCase() + " ");
                    continue;
                }
                System.out.print("_ ");
            }
            System.out.println();
        }
    }
}
