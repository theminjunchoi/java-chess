package chess.piece;

import chess.Color;

public class Queen extends Piece{

    public Queen(final Color color) {
        super(color);
    }

    @Override
    public Type type() {
        return Type.QUEEN;
    }
}
