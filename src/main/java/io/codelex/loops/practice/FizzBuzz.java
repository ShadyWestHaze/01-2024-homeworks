package src.main.java.io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter whatever number if you dare:");
        int numberLimit = userInput.nextInt();
        int valuesPerLine = 0;
        for (int i = 1; i <= numberLimit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("Fizz ");
            } else if (i % 3 == 0) {
                System.out.print("Buzz ");
            } else if (i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else {
                System.out.print(i + " ");
            }
            valuesPerLine++;
            if (valuesPerLine == 20) {
                System.out.println();
                valuesPerLine = 0;
            }
        }
    }

}
