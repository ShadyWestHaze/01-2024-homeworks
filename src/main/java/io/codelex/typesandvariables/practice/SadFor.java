package io.codelex.typesandvariables.practice;

import io.codelex.NoCodeWrittenException;

public class SadFor {
    public static void main(String[] args) {
        try {
            System.out.println(test1());
        } catch (NoCodeWrittenException e) {
            System.out.println("No number has a square root higher then 2.5");
        }
    }

    public static int test1() {
        int i;
        int j = 6;
        for (i = 0; i <= j; i++) {
            if (Math.sqrt(i) > 2.5) {
                break;
            }
        }
        if (i == j) {
            throw new NoCodeWrittenException();
        }
        return i;

    }
}
