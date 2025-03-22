package chess.piece;

import chess.board.Board;
import chess.position.Position;

public class Queen extends Piece {

    public Queen(final Color color) {
        super(color);
    }

    @Override
    public Type type() {
        return Type.QUEEN;
    }

    @Override
    public boolean canMove(final Position start, final Position end, final Board board) {
        return false;
    }
}
