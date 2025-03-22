package chess.turn;

import chess.board.Board;
import chess.piece.Color;
import chess.piece.Piece;

public class WhiteTurn extends Turn {

    @Override
    public void changeTurn(final Board cxt) {
        cxt.setTurn(new BlackTurn());
    }

    @Override
    public boolean isSameTeam(final Piece piece) {
        return piece.isColor(Color.WHITE);
    }
}
