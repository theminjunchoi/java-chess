package chess.piece;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import chess.board.Board;
import chess.board.BoardGenerator;
import chess.position.Column;
import chess.position.Position;
import chess.position.Row;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RookTest {

    @DisplayName("rook")
    @Test
    void tst() {
        // given
        final Board board = BoardGenerator.generateBoard();
        // when
        Position start = new Position(Row.ONE, Column.A);
        Position end = new Position(Row.THREE, Column.A);
        // then
        assertThatThrownBy(() -> board.move(start, end))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 기물이 움직일 수 없습니다.");
    }
}
