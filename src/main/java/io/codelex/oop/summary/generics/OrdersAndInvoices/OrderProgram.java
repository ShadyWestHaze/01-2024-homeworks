package io.codelex.oop.summary.generics.OrdersAndInvoices;


public class OrderProgram {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            order.addItem(new FoodItem("Milk", 0.75, "01.04.2025"));
            order.addItem(new FoodItem("Miwelk", 0.75, "01.04.2027"));
            order.addItem(new ElectronicsItem("Radio", 25.00, 100));
            order.addItem(new HouseholdItem("Buck-et", 5.00, "red"));
            order.addItem(new ItemPacking());
            order.checkFood();
            Invoice invoice = new Invoice(order);
            System.out.println(invoice.generateFormattedInvoice());
        } catch (BadFoodException | WrongOrderException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

