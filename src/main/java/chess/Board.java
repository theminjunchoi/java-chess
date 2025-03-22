package chess;

import chess.piece.Piece;
import java.util.Map;

public class Board {

    private final Map<Position, Piece> board;

    public Board(final Map<Position, Piece> board) {
        this.board = board;
    }

    public Piece getPiece(final Position position) {
        return board.get(position);
    }

    public Map<Position, Piece> getBoard() {
        return board;
    }
}
