package chess.piece;

import chess.board.Board;
import chess.position.Position;
import chess.position.Vector;

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
        final Vector v = end.subtract(start);
        if (!v.isDiagonal()) {
            throw new IllegalArgumentException("이동할 수 없는 위치입니다.");
        }
        Position route = start;
        final int x = v.x();
        final int y = v.y();
        if (x < 0) {
            if (y > 0) {
                for (int i = 0; i < Math.abs(y); i++) {
                    route = route.moveLeftUp();
                    if (board.isExistSameTeam(route, color)) {
                        return false;
                    }
                }
                return true;
            }
            if (y < 0) {
                for (int i = 0; i < Math.abs(y); i++) {
                    route = route.moveLeftDown();
                    if (board.isExistSameTeam(route, color)) {
                        return false;
                    }
                }
                return true;
            }
        }
        if (x > 0) {
            if (y > 0) {
                for (int i = 0; i < Math.abs(y); i++) {
                    route = route.moveRightUp();
                    if (board.isExistSameTeam(route, color)) {
                        return false;
                    }
                }
                return true;
            }
            if (y < 0) {
                for (int i = 0; i < Math.abs(y); i++) {
                    route = route.moveRightDown();
                    if (board.isExistSameTeam(route, color)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }
}
