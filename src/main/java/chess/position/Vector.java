package chess.position;

import java.util.Objects;

public class Vector {

    private final int y;
    private final int x;

    public Vector(final int y, final int x) {
        this.y = y;
        this.x = x;
    }

    public boolean isStraight() {
        if (x == 0 && y == 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        if (y == 0) {
            return true;
        }
        return false;
    }

    public boolean isVertical() {
        return x == 0;
    }

    public boolean isHorizontal() {
        return y == 0;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Vector vector = (Vector) o;
        return x == vector.x && y == vector.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
