package src.main.java.io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> nameSet = new HashSet<>();
        System.out.println("Enter empty line to exit:");
        String userInput;
        do {
            System.out.println("Enter name:");
            userInput = scanner.nextLine();
            if (!userInput.isEmpty()) {
                nameSet.add(userInput);
            }
        } while (!userInput.isEmpty());
        scanner.close();
        System.out.println("Unique name list contains: " + nameSet);
    }
}

