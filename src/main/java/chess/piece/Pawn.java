package chess.piece;

public class Pawn {

    public static final String WHITE_COLOR = "white";
    public static final String BLACK_COLOR = "black";

    private final String color;

    public Pawn(final String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
