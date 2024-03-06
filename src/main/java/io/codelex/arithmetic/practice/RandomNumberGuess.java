package io.codelex.arithmetic.practice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args) {

        Random rand = new Random();
        int chosenNumber = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int number = getInput(input);

        if (number == chosenNumber) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else {
            if (number < chosenNumber) {
                System.out.printf("Sorry, you are too low.  I was thinking of %d", chosenNumber);
            }
            if (number > chosenNumber) {
                System.out.printf("Sorry, you are too high.  I was thinking of %d", chosenNumber);
            }
        }
    }

    public static int getInput(Scanner scanner) {
        int input = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                input = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("That's not a number, try again!");
                scanner.next();
            }

        }
        return input;
    }
}