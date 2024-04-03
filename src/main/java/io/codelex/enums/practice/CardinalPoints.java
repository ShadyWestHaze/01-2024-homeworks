package src.main.java.io.codelex.enums.practice;

public class CardinalPoints {


    public static void main(String[] args) {
        System.out.println("Direction\tText");
        for (Directions direction : Directions.values()) {
            System.out.println(direction + "\t\t" + direction.getText());
        }

        System.out.println("\nEnum values and their ordinals:");
        for (Directions direction : Directions.values()) {
            System.out.println(direction + ":" + direction.getText() + ":" + direction.ordinal());
        }
    }
}
