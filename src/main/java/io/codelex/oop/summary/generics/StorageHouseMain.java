package io.codelex.oop.summary.generics;

import java.util.Optional;

public class StorageHouseMain {
    public static void main(String[] args) {
        StorageHouse<Integer> numberStorage = new StorageHouse<>(42);
        numberStorage.addMoreItems(350);
        numberStorage.addMoreItems(70);

        Optional<Integer> maybeFirstNumber = numberStorage.getMaybeFirstItem();
        maybeFirstNumber.ifPresent(System.out::println);
        numberStorage.printItems();

        System.out.println();

        StorageHouse<String> stringStorage = new StorageHouse<>("first");
        stringStorage.addMoreItems("more");
        stringStorage.addMoreItems("extra");

        Optional<String> maybeFirstString = stringStorage.getMaybeFirstItem();
        maybeFirstString.ifPresent(System.out::println);
        stringStorage.printItems();
    }
}
