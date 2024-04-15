package io.codelex.collections.practice.lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        ArrayList<String> elememts = new ArrayList<>();
        //TODO: Add 10 values to list
        for (int i = 0; i < 10; i++) {
            elememts.add(String.valueOf(i));
        }
        //TODO: Add new value at 5th position
        elememts.add(4, "New value");
        System.out.println("added value: " + elememts);
        //TODO: Change value at last position (Calculate last position programmatically)
        elememts.set(elememts.size() - 1, "Last position");
        System.out.println("changed last value: " + elememts);
        //TODO: Sort your list in alphabetical order
        Collections.sort(elememts);
        System.out.println("Sort the list:" + elememts);
        //TODO: Check if your list contains "Foobar" element

        //TODO: Print each element of list using loop
        for (String element : elememts) {
            System.out.println(element);
        }
    }

}
