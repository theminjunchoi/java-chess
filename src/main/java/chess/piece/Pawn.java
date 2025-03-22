package chess.piece;

import chess.Color;

public class Pawn extends Piece{

    public Pawn(final Color color) {
        super(color);
    }

    @Override
    public Type type() {
        return Type.PAWN;
    }
}
