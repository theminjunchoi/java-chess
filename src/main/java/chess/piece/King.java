package chess.piece;

import chess.board.Board;
import chess.position.Position;

public class King extends Piece {

    public King(final Color color) {
        super(color);
    }

    @Override
    public Type type() {
        return Type.KING;
    }

    @Override
    public boolean canMove(final Position start, final Position end, final Board board) {
        return false;
    }
}
