package chess.piece;

import chess.Color;

public class Knight extends Piece {

    public Knight(final Color color) {
        super(color);
    }

    @Override
    public Type type() {
        return Type.KNIGHT;
    }
}
