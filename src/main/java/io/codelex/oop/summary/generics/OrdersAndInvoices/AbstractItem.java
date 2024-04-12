package io.codelex.oop.summary.generics.OrdersAndInvoices;

public class AbstractItem implements Item {

    private final String name;
    private final Double price;

    public AbstractItem(String name, Double price) {

        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String fullInfo() {

        return getName() + getPrice();

    }
}
