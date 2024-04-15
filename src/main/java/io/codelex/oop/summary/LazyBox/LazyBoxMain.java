package io.codelex.oop.summary.LazyBox;


public class LazyBoxMain {

    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(LazyBoxMain::calculate);

        // First time calling get - it should calculate the value
        Integer contents = box.get();
        System.out.println("First time contents: " + contents);

        // Second time calling get - it should just return previously calculated value and not calculate again
        Integer contents2 = box.get();
        System.out.println("Second time contents: " + contents2);
    }

    public static Integer calculate() {
        return 200;
    }
}