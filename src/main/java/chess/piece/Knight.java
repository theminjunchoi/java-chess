package chess.piece;

import chess.board.Board;
import chess.position.Position;
import chess.position.Vector;
import java.util.List;

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
        final Vector v = end.subtract(start);
        List<Vector> moveRules = List.of(
                new Vector(2, 1),
                new Vector(-2, 1),
                new Vector(2, -1),
                new Vector(-2, -1),
                new Vector(1, 2),
                new Vector(-1, 2),
                new Vector(1, -2),
                new Vector(-1, -2)
        );
        if (!moveRules.contains(v)) {
            throw new IllegalArgumentException("[ERROR] 대각선은 다른 기물을 잡을 때만 이동가능합니다.");
        }
        return true;
    }
}
