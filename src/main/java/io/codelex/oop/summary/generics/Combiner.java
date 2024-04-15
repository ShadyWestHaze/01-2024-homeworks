package io.codelex.oop.summary.generics;

public class Combiner {

    //Fix this method so it can receive two any kind of objects
    //Test the functionality

    public static <T, U> String combineTwoItems(T first, U second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

}
