package io.codelex.oop.summary.generics.OrdersAndInvoices;

public class ItemPacking implements Service {
    private static final String NAME = "Item packing";
    private static final double PRICE = 5.00;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Double getPrice() {
        return PRICE;
    }

    @Override
    public String fullInfo() {
        return getName() + ", " + getPrice() + "EUR";
    }
}
