package src.main.java.io.codelex.polymorphism.practice.exercise6;

public class Meat extends Food {

    public Meat(int quantity) {
        super(quantity, "Meat");
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }
}
