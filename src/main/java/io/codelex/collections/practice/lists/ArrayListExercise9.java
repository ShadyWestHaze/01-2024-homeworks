package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise9 {

    public static void main(String[] args) {

        List<String> firstList = new ArrayList<>();
        firstList.add("Red");
        firstList.add("Green");
        firstList.add("Black");
        firstList.add("White");
        firstList.add("Pink");
        System.out.println("List of first array: " + firstList);

        List<String> secondList = new ArrayList<>();
        secondList.add("Red");
        secondList.add("Green");
        secondList.add("Black");
        secondList.add("Pink");
        System.out.println("List of second array: " + secondList);

        //TODO: Write a Java program to join two array lists.
        //...
        secondList.addAll(firstList);
        Collections.sort(secondList);
        for (int i = 0; i < secondList.size() - 1; i++) {

            if (secondList.get(i).equals(secondList.get(i + 1))) {
                secondList.remove(i + 1);
            }
        }
        System.out.println("List of joined array: " + secondList);
    }

}
