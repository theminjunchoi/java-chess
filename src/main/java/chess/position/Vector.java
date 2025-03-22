package chess.position;

public class Vector {

    private final int x;
    private final int y;

    public Vector(final int x, final int y) {
        this.x = x;
        this.y = y;
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
}
