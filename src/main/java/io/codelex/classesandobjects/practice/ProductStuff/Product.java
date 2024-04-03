package src.main.java.io.codelex.classesandobjects.practice.ProductStuff;


public class Product {
    private final String name;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return priceAtStart;
    }

    public int getAmount() {
        return amountAtStart;
    }


    public void setPrice(double price) {
        this.priceAtStart = price;
    }

    public void setAmount(int amount) {
        this.amountAtStart = amount;
    }


    public void printProduct() {
        System.out.printf("%s, price %.2f, amount %d\n", name, priceAtStart, amountAtStart);
    }

}
