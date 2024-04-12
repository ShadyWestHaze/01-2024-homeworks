package io.codelex.oop.summary.generics.OrdersAndInvoices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class FoodItem extends AbstractItem {

    private final LocalDate dateOfExpiration;
    private final LocalDate today = LocalDate.now();

    public FoodItem(String name, Double price, String dateOfExpiration) {
        super(name, price);
        this.dateOfExpiration = LocalDate.parse(dateOfExpiration, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    @Override
    public String fullInfo() {
        return getName() + ", " + getPrice() + "EUR, " + "best before:" + dateOfExpiration;
    }

    public boolean hasExpired() {
        return dateOfExpiration.isBefore(today);
    }
}
