package chess.piece;

import chess.board.Board;
import chess.position.Position;

public abstract class Piece {

    protected final Color color;

    public Piece(final Color color) {
        this.color = color;
    }

    public boolean isColor(final Color color) {
        return this.color.equals(color);
    }

    public abstract Type type();

    public abstract boolean canMove(final Position start, final Position end, final Board board);

    public boolean isSameTeam(final Color color) {
        return this.color == color;
    }
}
