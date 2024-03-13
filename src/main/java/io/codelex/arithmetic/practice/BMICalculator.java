package src.main.java.io.codelex.arithmetic.practice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("To calculate your BMI please select one of the choices below by entering the number");
        System.out.println();
        System.out.println("1. Pounds and Inches                                        2. Kilograms and Meters");

        double BMI=0;
        int selection=0;
        double weight =0;
        double height=0;
        boolean validSelection = false;
        boolean isKG = false;
        boolean isPounds = false;

        while (!validSelection) {
            try {
                selection = input.nextInt();
                if (selection == 1 || selection == 2) {
                    validSelection = true;
                } else {
                    System.out.println("Invalid selection. Please enter 1 or 2:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 or 2:");
                input.next();
            }
        }

        if (selection == 1) {//pounds
            isPounds = true;
            weight = getInput("weight in pounds: ", input);
            height = getInput("height in inches: ", input);


        } else if (selection == 2) {//kg
            isKG = true;
            weight = getInput("weight in kilograms: ", input);
            height = getInput("height in meters: ", input);

        }

        if(isPounds){
            BMI =weight*703 / Math.pow(height,2);
        }
        if(isKG){
            BMI= weight / Math.pow(height,2);
        }

        System.out.println("Your BMI is "+ BMI +" and "+getBMI(BMI));

    }

    public static double getInput(String prompt, Scanner scanner) {
        double value = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println(prompt);
                value = scanner.nextDouble();
                if (value <= 0) {
                    System.out.println("Invalid input. Please enter a positive value.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
        return value;
    }

    public static  String getBMI(double BMI){
        String returnString;
        if(BMI>=18.5 && BMI <= 25){
            return returnString = "this BMI indicates that you are within the optimal weight margins";
        }
        if(BMI<18.5){
            return returnString = "this BMI indicates that you are underweight";
        }
        if(BMI>25){
            return returnString = "this BMI indicates that you are overweight";
        } else return null;
    }
}