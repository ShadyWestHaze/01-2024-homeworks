package src.main.java.io.codelex.enums.practice;

public class CardinalPoints {

    public enum Direction { //having a field inside enum
        NORTH("up"),
        SOUTH("down"),
        EAST("right"),
        WEST("left");

        private final String text;

        Direction(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    public static void main(String[] args) {
        System.out.println("Direction\tText");
        for (Direction direction : Direction.values()) {
            System.out.println(direction + "\t\t" + direction.getText());
        }

        System.out.println("\nEnum values and their ordinals:");
        for (Direction direction : Direction.values()) {
            System.out.println(direction + ":" + direction.getText() + ":" + direction.ordinal());
        }
    }
}
