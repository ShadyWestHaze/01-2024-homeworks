package src.main.java.io.codelex.polymorphism.practice.exercise6;

public class Vegetable extends Food {

    public Vegetable(int quantity) {
        super(quantity, "Vegetable");
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public String toString() {
        return super.toString();

    }
}