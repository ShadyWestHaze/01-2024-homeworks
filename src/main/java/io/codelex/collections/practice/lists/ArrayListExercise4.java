package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise4 {

    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        List<String> element = new ArrayList<>();
        element.add(colors.get(0));
        element.add(colors.get(2));
        System.out.println("First element: " + element.get(0));
        System.out.println("Third element: " + element.get(1));


        //fixme
        //String element = ...;
        //System.out.println("First element: " + element);

        //fixme
        //element = ...;
        //System.out.println("Third element: " + element);
    }
}
