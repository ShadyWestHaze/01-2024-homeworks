package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void methodB() {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodC() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
