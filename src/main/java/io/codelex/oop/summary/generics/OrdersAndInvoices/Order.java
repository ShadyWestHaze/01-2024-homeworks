package io.codelex.oop.summary.generics.OrdersAndInvoices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.time.LocalDate;

public class Order {

    List<SellableThing> itemList = new ArrayList<>();
    LocalDate todaysDate;

    public void addItem(SellableThing item) {
        itemList.add(item);
    }

    public List<SellableThing> getItemList() {
        return itemList;
    }

    public void checkFood() throws BadFoodException {
        List<FoodItem> expiredItems = new ArrayList<>();

        for (Iterator<SellableThing> iterator = itemList.iterator(); iterator.hasNext(); ) {
            SellableThing item = iterator.next();
            if (item instanceof FoodItem) {
                FoodItem foodItem = (FoodItem) item;
                if (foodItem.hasExpired()) {
                    expiredItems.add(foodItem);
                    iterator.remove();
                }
            }
        }

        if (!expiredItems.isEmpty()) {
            StringBuilder errorMessage = new StringBuilder();
            for (FoodItem expiredItem : expiredItems) {
                errorMessage.append(expiredItem.getName()).append(" has expired and cannot be bought.\n");
            }
            throw new BadFoodException(errorMessage.toString());
        }
    }
}
