package chess.piece;

import chess.board.Board;
import chess.position.Position;

public class Pawn extends Piece {

    public Pawn(final Color color) {
        super(color);
    }

    @Override
    public Type type() {
        return Type.PAWN;
    }

    @Override
    public boolean canMove(final Position start, final Position end, final Board board) {
        return false;
    }
}
