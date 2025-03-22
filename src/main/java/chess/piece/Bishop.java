package chess.piece;

import chess.Color;

public class Bishop extends Piece{

    public Bishop(final Color color) {
        super(color);
    }

    @Override
    public Type type() {
        return Type.BISHOP;
    }
}
