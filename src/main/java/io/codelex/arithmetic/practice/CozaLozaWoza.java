package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        int numberLimit = 110;
        int valuesPerLine = 0;
        for (int i = 1; i <= numberLimit; i++) {
            if (i % 3 == 0) {
                System.out.print("Coza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else {
                System.out.print(i + " ");
            }
            valuesPerLine++;
            if (valuesPerLine == 11) {
                System.out.println();
                valuesPerLine = 0;
            }
        }
    }
}