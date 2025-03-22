package chess.board;

import chess.piece.Piece;
import chess.position.Position;
import chess.turn.Turn;
import chess.turn.WhiteTurn;
import java.util.Map;

public class Board {

    private final Map<Position, Piece> board;
    private Turn turn;

    public Board(final Map<Position, Piece> board, final Turn turn) {
        this.board = board;
        this.turn = turn;
    }

    public Board(final Map<Position, Piece> board) {
        this.board = board;
        this.turn = new WhiteTurn();
    }

    public void move(Position start, Position end) {
        validateIsExist(start);
        final Piece piece = board.get(start);
        validateTurn(piece);
        validateMove(start, end, piece);
        board.remove(start);
        board.remove(end);
        board.put(end, piece);
    }

    private void validateIsExist(final Position start) {
        if (!board.containsKey(start)) {
            throw new IllegalArgumentException("[ERROR] 이동 시작 장소에 기물이 없습니다.");
        }
    }

    private void validateTurn(final Piece piece) {
        if (!turn.isSameTeam(piece)) {
            throw new IllegalArgumentException("[ERROR] 다른 팀의 기물을 움직이고 있습니다.");
        }
    }

    private void validateMove(final Position start, final Position end, final Piece piece) {
        if (!piece.canMove(start, end, this)) {
            throw new IllegalArgumentException("[ERROR] 기물이 움직일 수 없습니다.");
        }
    }

    public Map<Position, Piece> getBoard() {
        return board;
    }

    public void setTurn(final Turn turn) {
        this.turn = turn;
    }

    public boolean isPieceExist(final Position position) {
        return board.containsKey(position);
    }
}
