package src.main.java.io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class MinutesToYears {
    public static void main(String[] args) {
        double convertedResultYears = 0;
        double convertedResultDays = 0;
        double min = 0;
        Scanner minuteInput = new Scanner(System.in);
        System.out.println("Enter minutes to find out how long that is in Years and Days");
        min = minuteInput.nextInt();

        convertedResultDays = min / 1440;
        convertedResultYears = convertedResultDays / 365;

        System.out.printf("%.0f min is %.3f in days and %.5f in years", min, convertedResultDays, convertedResultYears);
    }
}