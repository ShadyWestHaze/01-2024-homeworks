package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise3 {

    //TODO: Write a Java program to insert an element into the array list at the first position.
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);

        colors.add(1, "Blue");

        colors.add(3, "Brown");
        //TODO: Add new color at the first and third position of the list

        //Print the list
        System.out.println(colors);
    }

}
