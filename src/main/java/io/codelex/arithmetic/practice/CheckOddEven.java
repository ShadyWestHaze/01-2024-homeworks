package io.codelex.arithmetic.practice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] arguments) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number to check if it is odd or even!");
    int number = getInput(input);

    boolean result = checkIfOdd(number);
    if(result){System.out.println("Number " + number + " is odd");}
    else{System.out.println("Number " + number + " is even");}

    System.out.println("Bye");
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

    public static boolean checkIfOdd(int num1){
        return num1 % 2 == 1;
    }
}
