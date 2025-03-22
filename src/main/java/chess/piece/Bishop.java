package chess.piece;

import chess.board.Board;
import chess.position.Position;

public class Bishop extends Piece {

    public Bishop(final Color color) {
        super(color);
    }

    @Override
    public Type type() {
        return Type.BISHOP;
    }

    @Override
    public boolean canMove(final Position start, final Position end, final Board board) {
        return false;
    }
}
