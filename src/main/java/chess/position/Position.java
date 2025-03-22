package chess.position;

public record Position(
        Column column,
        Row row
) {
    public Position(final Row row, final Column column) {
        this(column, row);
    }

    public static Position of(final String input) {
        return new Position(
                Row.of(String.valueOf(input.charAt(0))),
                Column.of(String.valueOf(input.charAt(1)))
        );
    }

    public Position moveUp() {
        return moveUp(1);
    }

    public Position moveUp(final int step) {
        return new Position(row.moveUp(step), column);
    }

    public Position moveDown() {
        return moveDown(1);
    }

    public Position moveDown(final int step) {
        return new Position(row.moveDown(step), column);
    }

    public Position moveLeft() {
        return moveLeft(1);
    }

    public Position moveLeft(final int step) {
        return new Position(row, column.moveLeft(step));
    }

    public Position moveRight() {
        return moveRight(1);
    }

    public Position moveRight(final int step) {
        return new Position(row, column.moveRight(step));
    }

    public Position moveLeftUp() {
        return moveLeft().moveUp();
    }

    public Position moveLeftDown() {
        return moveLeft().moveDown();
    }

    public Position moveRightUp() {
        return moveRight().moveUp();
    }

    public Position moveRightDown() {
        return moveRight().moveDown();
    }

    public Vector subtract(final Position another) {
        return new Vector(this.row.ordinal() - another.row.ordinal(),
                this.column.ordinal() - another.column.ordinal());
    }
}
