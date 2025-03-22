package chess.piece;

import chess.Color;

public abstract class Piece {

    private final Color color;

    public Piece(final Color color) {
        this.color = color;
    }

    public abstract Type type();

    public boolean isColor(final Color color) {
        return this.color.equals(color);
    }
}
