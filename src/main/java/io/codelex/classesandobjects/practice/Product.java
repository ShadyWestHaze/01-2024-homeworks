package src.main.java.io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class Product {
    private final String name;
    private double priceAtStart;
    private int amountAtStart;
    Scanner userInput = new Scanner(System.in);

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public String getName() {
        return name;
    }


    public void setPrice(double price) {
        this.priceAtStart = price;
    }


    public void printProduct() {
        System.out.printf("%s, price %.2f, amount %d\n", name, priceAtStart, amountAtStart);
    }

    public void changeQuantity() {
        System.out.printf("What is the new quantity for %s?\n", name);
        amountAtStart = userInput.nextInt();
        System.out.printf("New quantity for %s is %d\n", name, amountAtStart);
    }

    public void changePrice() {
        System.out.printf("What is the new price for %s?\n", name);
        priceAtStart = userInput.nextDouble();
        System.out.printf("New price for %s is %.2f\n", name, priceAtStart);
    }
}
