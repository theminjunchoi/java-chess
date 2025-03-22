package chess.piece;

import chess.board.Board;
import chess.position.Position;
import chess.position.Vector;

public class Rook extends Piece {

    public Rook(final Color color) {
        super(color);
    }

    @Override
    public Type type() {
        return Type.ROOK;
    }

    @Override
    public boolean canMove(final Position start, final Position end, final Board board) {
        final Vector v = end.subtract(start);
        if (!v.isStraight()) {
            throw new IllegalArgumentException("이동할 수 없는 위치입니다.");
        }
        Position route = start;
        if (v.isVertical()) {
            final int y = v.y();
            if (y > 0) {
                for (int i = 0; i < Math.abs(y); i++) {
                    route = route.moveUp();
                    if (board.isExistSameTeam(route, color)) {
                        return false;
                    }
                }
                return true;
            }
            if (y < 0) {
                for (int i = 0; i < Math.abs(y); i++) {
                    route = route.moveDown();
                    if (board.isExistSameTeam(route, color)) {
                        return false;
                    }
                }
                return true;
            }
        }
        if (v.isHorizontal()) {
            final int x = v.x();
            if (x > 0) {
                for (int i = 0; i < Math.abs(x); i++) {
                    route = route.moveRight();
                    if (board.isExistSameTeam(route, color)) {
                        return false;
                    }
                    return true;
                }
            }
            if (x < 0) {
                for (int i = 0; i < Math.abs(x); i++) {
                    route = route.moveLeft();
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
