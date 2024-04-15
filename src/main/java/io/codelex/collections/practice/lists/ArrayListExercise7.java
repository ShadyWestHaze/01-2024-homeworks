package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise7 {

    public static void main(String[] args) {
        String lookingFor = "White";
        Boolean contains = false;
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Violet");
        colors.add("White");
        colors.add("Black");

        for (String color : colors) {
            if (color.equals(lookingFor)) {
                contains = true;
                break;
            }
        }

//      TODO: Check if list contains "White" element
        if (contains) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }

}
