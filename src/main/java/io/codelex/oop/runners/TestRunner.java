package src.main.java.io.codelex.oop.runners;

import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marathon time in minutes:");
        int marathonTime = scanner.nextInt();

        try {
            Runner runner = Runner.getFitnessLevel(marathonTime);
            System.out.println("Your fitness level is: " + runner);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
