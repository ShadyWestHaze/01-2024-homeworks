package src.main.java.io.codelex.polymorphism.practice.exercise6;

public abstract class Food {
    int quantity;
    String type;

    public Food(int quantity, String type) {
        this.quantity = quantity;
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return type + " " + quantity;

    }
}
