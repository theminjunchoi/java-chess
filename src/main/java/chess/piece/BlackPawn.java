package chess.piece;

import chess.board.Board;
import chess.position.Position;
import chess.position.Vector;

public class BlackPawn extends Piece {

    private Boolean isFirstMove;

    public BlackPawn() {
        super(Color.BLACK);
        isFirstMove = true;
    }

    @Override
    public Type type() {
        return Type.PAWN;
    }

    @Override
    public boolean canMove(final Position start, final Position end, final Board board) {
        final Vector v = end.subtract(start);
        if (v.equals(new Vector(-1, -1)) || v.equals(new Vector(-1, 1))) {
            if (!board.isPieceExist(end)) {
                throw new IllegalArgumentException("[ERROR] 대각선은 다른 기물을 잡을 때만 이동가능합니다.");
            }
        }
        if (v.equals(new Vector(-2, 0))) {
            if (!isFirstMove) {
                throw new IllegalArgumentException("[ERROR] 전진 두 칸은 제일 처음에만 가능합니다.");
            }
            return true;
        }
        if (v.equals(new Vector(-1, 0))) {
            if (board.isPieceExist(end)) {
                throw new IllegalArgumentException("[ERROR] 다른 기물이 존재합니다.");
            }
            return true;
        }
        return false;
    }
}
