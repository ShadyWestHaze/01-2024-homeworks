package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator (or 'q' to quit):");
            String numeratorInput = scanner.next();

            if (numeratorInput.equalsIgnoreCase("q")) {
                System.out.println("Exiting the program.");
                break;
            }

            int numerator;
            try {
                numerator = Integer.parseInt(numeratorInput);
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data. Please try again.");
                continue;
            }

            System.out.println("Enter the divisor:");
            int divisor;
            try {
                divisor = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("You entered bad data. Please try again.");
                scanner.nextLine();
                continue;
            }

            if (divisor == 0) {
                System.out.println("You can't divide by zero.");
                continue;
            }

            System.out.println(numerator + " / " + divisor + " = " + (numerator / divisor));
        }

        scanner.close();
    }
}
