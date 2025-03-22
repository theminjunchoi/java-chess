package chess.piece;

import chess.Color;

public class King extends Piece {

    public King(final Color color) {
        super(color);
    }

    @Override
    public Type type() {
        return Type.KING;
    }
}
