package src.main.java.io.codelex.loops.practice;

import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int desiredOutcome = 0;
        int currentOutcome = 0;
        int firstDie = 0;
        int secondDie = 0;

        do {
            System.out.println("Enter the number you want the sum of 2 die to be.(2 - 12) :");
            desiredOutcome = userInput.nextInt();
        } while (desiredOutcome > 12 || desiredOutcome < 2);


        while (firstDie + secondDie != desiredOutcome) {
            firstDie = rollDice();
            secondDie = rollDice();
            currentOutcome = firstDie + secondDie;
            System.out.printf("%d and %d = %d \n", firstDie, secondDie, currentOutcome);

        }

    }


    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
