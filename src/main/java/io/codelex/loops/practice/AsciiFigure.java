package src.main.java.io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {


    public static void main(String[] args) {
        int size = 0;
        System.out.println("Enter desired size:");
        Scanner userInput = new Scanner(System.in);
        size = userInput.nextInt();

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < 2 * (size - i - 1); j++) {
                System.out.print("/");
            }

            for (int j = 0; j < 4 * i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * (size - i - 1); j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}

