package io.codelex.JavaAdvancedTest.Exercise2;

public class BasketFullException extends RuntimeException {
    public BasketFullException() {
        super("Basket is full");
    }
}
