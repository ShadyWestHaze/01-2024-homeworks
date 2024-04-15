package io.codelex.oop.summary.generics.OrdersAndInvoices;

public class Invoice {
    private static int nextInvoiceNumber = 1;

    private final int invoiceNumber;
    private final Order order;
    private final InvoiceStatus status;
    private final double vatRate = 0.21;
    private final int totalPriceSize = 0;

    public Invoice(Order order) {
        this.invoiceNumber = nextInvoiceNumber++;
        this.order = order;
        this.status = InvoiceStatus.APPROVED;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public InvoiceStatus getStatus() {
        return status;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (SellableThing item : order.getItemList()) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public double calculateVAT() {
        return calculateTotalPrice() * vatRate;
    }

    public double calculateTotalPriceWithVAT() {
        return calculateTotalPrice() + calculateVAT();
    }

    public String generateFormattedInvoice() throws WrongOrderException { //zinu, ka nav labi likt hard coded values, bet man apnika meginat uztaisit to rami ar "=" / domaju tas nav galvenais
        if (order.itemList.isEmpty()) {
            throw new WrongOrderException("Cannot creat invoice for an empty order");
        }
        StringBuilder invoiceBuilder = new StringBuilder();
        int headerLength = 50;
        invoiceBuilder.append("=".repeat(headerLength)).append("\n");
        invoiceBuilder.append(String.format("= INVOICE NUMBER: INV%d", invoiceNumber)).append(" ".repeat(headerLength - invoiceNumber - 22)).append("=\n");
        invoiceBuilder.append(String.format("= STATUS: %s", status)).append(" ".repeat(headerLength - status.toString().length() - 11)).append("=\n");
        int itemNumber = 1;
        for (SellableThing item : order.getItemList()) {
            invoiceBuilder.append(String.format("= %d. %s", itemNumber++, item.fullInfo())).append(" ".repeat(headerLength - item.fullInfo().length() - 6)).append("=\n");
        }
        invoiceBuilder.append(String.format("= SUM: %.2f EUR", calculateTotalPrice())).append(" ".repeat(headerLength - 17)).append("=\n");
        invoiceBuilder.append(String.format("= VAT (21%%): %.2f EUR", calculateVAT())).append(" ".repeat(headerLength - 22)).append("=\n");
        invoiceBuilder.append(String.format("= TOTAL: %.2f EUR", calculateTotalPriceWithVAT())).append(" ".repeat(headerLength - 19)).append("=\n");
        invoiceBuilder.append("=".repeat(headerLength)).append("\n");
        return invoiceBuilder.toString();

    }

    public void send() {

    }
}
