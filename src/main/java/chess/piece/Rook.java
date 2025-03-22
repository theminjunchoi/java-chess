package chess.piece;

import chess.Color;

public class Rook extends Piece {

    public Rook(final Color color) {
        super(color);
    }

    @Override
    public Type type() {
        return Type.ROOK;
    }
}
