package src.main.java.io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input min value");
        min = userInput.nextInt();

        System.out.println("Input max value");
        max = userInput.nextInt();
        for (int i = min; i <= max; i++) {
            int current = i;
            for (int j = 0; j <= max - min; j++) {
                System.out.print(current);
                current = (current == max) ? min : current + 1;
            }
            System.out.println();
        }
    }
}
