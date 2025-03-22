package chess.position;

import java.util.Arrays;
import java.util.Map;

public enum Column {

    A("a"),
    B("b"),
    C("c"),
    D("d"),
    E("e"),
    F("f"),
    G("g"),
    H("h");

    private final String value;

    Column(final String value) {
        this.value = value;
    }

    public static Column of(String input) {
        return Arrays.stream(values())
                .filter(row -> row.value.equals(input))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 잘못된 값을 입력했습니다."));
    }

    public boolean isFarLeft() {
        return ordinal() == 0;
    }

    public boolean isFarRight() {
        return ordinal() + 1 == values().length;
    }

    public boolean canMoveLeft(final int step) {
        return ordinal() - step >= 0;
    }

    public Column moveLeft() {
        return moveLeft(1);
    }

    public Column moveLeft(final int step) {
        if (canMoveLeft(step)) {
            return values()[ordinal() - step];
        }

        throw new IllegalStateException("움직일 수 없는 위치입니다.");
    }

    public boolean canMoveRight(final int step) {
        return ordinal() + step < values().length;
    }

    public Column moveRight() {
        return moveRight(1);
    }

    public Column moveRight(final int step) {
        if (canMoveRight(step)) {
            return values()[ordinal() + step];
        }

        throw new IllegalStateException("움직일 수 없는 위치입니다.");
    }

    public int getInt() {
        Map<Column, Integer> map = Map.of(
                A, 1,
                B, 2,
                C, 3,
                D, 4,
                E, 5,
                F, 6,
                G, 7,
                H, 8
        );
        return map.get(this);
    }
}
