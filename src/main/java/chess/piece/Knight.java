package chess.piece;

import chess.board.Board;
import chess.position.Position;

public class Knight extends Piece {

    public Knight(final Color color) {
        super(color);
    }

    @Override
    public Type type() {
        return Type.KNIGHT;
    }

    @Override
    public boolean canMove(final Position start, final Position end, final Board board) {
        return false;
    }
}
