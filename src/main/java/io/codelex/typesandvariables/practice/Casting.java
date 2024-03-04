package io.codelex.typesandvariables.practice;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        String a = "1";
        int b = 2;
        int c = 3;
        double d = 4;
        float e = 5;

        int sum = Integer.parseInt(a) + b + c + (int)d + (int)e;
        System.out.println(sum);
    }

    private static void second() {
        String a = "1";
        int b = 2;
        int c = 3;
        double d = 4.2;
        float e = 5.3f;

        float sum = Float.parseFloat(a) + b + c + (float)d + e;
        System.out.println(sum);
    }
}