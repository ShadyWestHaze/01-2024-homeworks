package io.codelex.oop.summary.generics.OrdersAndInvoices;

public class ElectronicsItem extends AbstractItem {

    private final int power;

    public ElectronicsItem(String name, Double price, int power) {
        super(name, price);
        this.power = power;
    }

    public String fullInfo() {
        return getName() + ", " + getPrice() + "EUR, " + "power:" + power + "W";
    }
}
