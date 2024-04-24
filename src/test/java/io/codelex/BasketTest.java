package io.codelex;

import io.codelex.JavaAdvancedTest.Exercise2.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("SimplifiableJUnitAssertion")
public class BasketTest {

    Basket<Apple> appleBasket = new Basket<>();
    Basket<Mushroom> mushroomBasket = new Basket<>();


    @Test
    void shouldAddAppleWhenBasketIsEmpty() {
        Apple apple = new Apple();
        appleBasket.addToBasket(apple);
        assertEquals(1, appleBasket.getNumberOfItemsInBasket());
    }

    @Test
    void shouldAddMushroomWhenBasketIsEmpty() {
        Mushroom mushroom = new Mushroom();
        mushroomBasket.addToBasket(mushroom);
        assertEquals(1, mushroomBasket.getNumberOfItemsInBasket());
    }

    @Test
    void shouldThrowExceptionWhenBasketIsFull() throws BasketFullException {
        for (int i = 0; i < 10; i++) {
            Apple apple = new Apple();
            appleBasket.addToBasket(apple);
        }
        assertThrows(BasketFullException.class, () -> appleBasket.addToBasket(new Apple()));
    }

    @Test
    void shouldRemoveItemWhenBasketIsNotEmpty() {
        Apple apple = new Apple();
        appleBasket.addToBasket(apple);
        appleBasket.removeFromBasket(apple);
        assertEquals(0, appleBasket.getNumberOfItemsInBasket());
    }

    @Test
    void shouldThrowExceptionWwhenBasketIsEmpty() {
        assertThrows(BasketEmptyException.class, () -> appleBasket.removeFromBasket(new Apple()));
    }
}
