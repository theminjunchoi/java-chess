package chess.piece;

import chess.board.Board;
import chess.position.Position;
import chess.position.Vector;

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
        final Vector v = end.subtract(start);
        if (!v.isOneLength()) {
            throw new IllegalArgumentException("이동할 수 없는 위치입니다.");
        }
        if (board.isExistSameTeam(end, color)) {
            throw new IllegalArgumentException("[ERROR] 다른 기물이 존재합니다.");
        }
        return false;
    }
}
