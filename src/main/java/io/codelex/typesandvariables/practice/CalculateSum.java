package src.main.java.io.codelex.typesandvariables.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> sumArr = new ArrayList<>();
        int totalSum = 0;

        System.out.println("Enter single-digit numbers (type 'Calculate' to stop):");
        String userInput = input.nextLine();
        while (!userInput.equalsIgnoreCase("Calculate")) {
            try {
                int number = Integer.parseInt(userInput);
                if (number >= 0 && number <= 9) {
                    sumArr.add(number);
                } else {
                    System.out.println("Invalid input. Please enter a single-digit number or 'Calculate' to find out the sum.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a single-digit number or 'Calculate' to find out the sum.");
            }


            userInput = input.nextLine();
        }
        if (userInput.equalsIgnoreCase("Calculate")) {
            for (Integer integer : sumArr) {
                totalSum += integer;
            }
        }
        System.out.printf("The sum = %d", totalSum);
    }
}