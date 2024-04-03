package src.main.java.io.codelex.enums.practice;

public enum Directions {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private final String text;

    Directions(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
