package chess.board;

import chess.piece.Bishop;
import chess.piece.Color;
import chess.piece.King;
import chess.piece.Knight;
import chess.piece.Pawn;
import chess.piece.Piece;
import chess.piece.Queen;
import chess.piece.Rook;
import chess.position.Column;
import chess.position.Position;
import chess.position.Row;
import java.util.HashMap;

public class BoardGenerator {

    public static Board generateBoard() {
        final HashMap<Position, Piece> board = new HashMap<>();
        // 흰색
        board.put(new Position(Row.ONE, Column.A), new Rook(Color.WHITE));
        board.put(new Position(Row.ONE, Column.H), new Rook(Color.WHITE));

        board.put(new Position(Row.ONE, Column.B), new Bishop(Color.WHITE));
        board.put(new Position(Row.ONE, Column.G), new Bishop(Color.WHITE));

        board.put(new Position(Row.ONE, Column.C), new Knight(Color.WHITE));
        board.put(new Position(Row.ONE, Column.F), new Knight(Color.WHITE));

        board.put(new Position(Row.ONE, Column.D), new Queen(Color.WHITE));
        board.put(new Position(Row.ONE, Column.E), new King(Color.WHITE));

        board.put(new Position(Row.TWO, Column.A), new Pawn(Color.WHITE));
        board.put(new Position(Row.TWO, Column.B), new Pawn(Color.WHITE));
        board.put(new Position(Row.TWO, Column.C), new Pawn(Color.WHITE));
        board.put(new Position(Row.TWO, Column.D), new Pawn(Color.WHITE));
        board.put(new Position(Row.TWO, Column.E), new Pawn(Color.WHITE));
        board.put(new Position(Row.TWO, Column.F), new Pawn(Color.WHITE));
        board.put(new Position(Row.TWO, Column.G), new Pawn(Color.WHITE));
        board.put(new Position(Row.TWO, Column.H), new Pawn(Color.WHITE));

        // 검정색
        board.put(new Position(Row.EIGHT, Column.A), new Rook(Color.BLACK));
        board.put(new Position(Row.EIGHT, Column.H), new Rook(Color.BLACK));

        board.put(new Position(Row.EIGHT, Column.B), new Bishop(Color.BLACK));
        board.put(new Position(Row.EIGHT, Column.G), new Bishop(Color.BLACK));

        board.put(new Position(Row.EIGHT, Column.C), new Knight(Color.BLACK));
        board.put(new Position(Row.EIGHT, Column.F), new Knight(Color.BLACK));

        board.put(new Position(Row.EIGHT, Column.D), new Queen(Color.BLACK));
        board.put(new Position(Row.EIGHT, Column.E), new King(Color.BLACK));

        board.put(new Position(Row.SEVEN, Column.A), new Pawn(Color.BLACK));
        board.put(new Position(Row.SEVEN, Column.B), new Pawn(Color.BLACK));
        board.put(new Position(Row.SEVEN, Column.C), new Pawn(Color.BLACK));
        board.put(new Position(Row.SEVEN, Column.D), new Pawn(Color.BLACK));
        board.put(new Position(Row.SEVEN, Column.E), new Pawn(Color.BLACK));
        board.put(new Position(Row.SEVEN, Column.F), new Pawn(Color.BLACK));
        board.put(new Position(Row.SEVEN, Column.G), new Pawn(Color.BLACK));
        board.put(new Position(Row.SEVEN, Column.H), new Pawn(Color.BLACK));

        return new Board(board);
    }
}
