package src.main.java.io.codelex.arithmetic.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

// Scanner (Input) lore https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
// InputMismatchException how to https://www.javatpoint.com/inputmismatchexception-in-java
class Number15Checker {
    public static void main(String[] arguments) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstInput = getInput(input);

        System.out.println("Enter second number:");
        int secondInput = getInput(input);


        boolean result = checkForFifteen(firstInput, secondInput);
        System.out.println("Result: " + result);


    }

    public static int getInput(Scanner scanner) {
        int input = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                input = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                scanner.next();
            }
        }
        return input;
    }

    public static boolean checkForFifteen(int num1, int num2) {
        return (num1 == 15 || num2 == 15 || num1 + num2 == 15 || Math.abs(num1 - num2) == 15);
    }
}