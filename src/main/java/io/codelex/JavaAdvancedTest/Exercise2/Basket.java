package io.codelex.JavaAdvancedTest.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private final List<T> items = new ArrayList<>();

    public int getNumberOfItemsInBasket() {
        return items.size();
    }

    public void addToBasket(T item) throws BasketContainsDiferentType, BasketFullException {
        int maxSize = 10;
        if (items.size() < maxSize) {
            if (items.isEmpty() || items.get(0).getClass() == item.getClass()) {
                items.add(item);
            } else {
                throw new BasketContainsDiferentType();
            }
        } else {
            throw new BasketFullException();
        }
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (!items.isEmpty()) {
            items.remove(item);
        } else {
            throw new BasketEmptyException();
        }

    }
}