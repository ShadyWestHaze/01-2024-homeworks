package io.codelex.JavaAdvancedTest.Exercise2;

public class BasketEmptyException extends RuntimeException {
    public BasketEmptyException() {
        super("Basket is empty");
    }
}
