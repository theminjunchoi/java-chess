package chess.turn;

import chess.board.Board;
import chess.piece.Piece;

public abstract class Turn {

    public abstract void changeTurn(Board cxt);

    public abstract boolean isSameTeam(final Piece piece);

    public abstract String getName();
}
