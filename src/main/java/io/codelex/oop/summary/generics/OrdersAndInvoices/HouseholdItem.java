package io.codelex.oop.summary.generics.OrdersAndInvoices;

public class HouseholdItem extends AbstractItem {
    private final String color;

    public HouseholdItem(String name, Double price, String color) {
        super(name, price);
        this.color = color;
    }

    public String fullInfo() {
        return getName() + ", " + getPrice() + "EUR, " + "color:" + color;
    }
}
