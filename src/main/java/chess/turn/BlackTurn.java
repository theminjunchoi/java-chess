package chess.turn;

import chess.board.Board;
import chess.piece.Color;
import chess.piece.Piece;

public class BlackTurn extends Turn {

    @Override
    public void changeTurn(Board cxt) {
        cxt.setTurn(new WhiteTurn());
    }

    @Override
    public boolean isSameTeam(final Piece piece) {
        return piece.isColor(Color.BLACK);
    }
}
