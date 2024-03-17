package src.main.java.io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        int currentDay = 0;
        String currentDayName = "";
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input a number for a day(0-7): ");
        currentDay = userInput.nextInt();

        if (currentDay >= 0 && currentDay <= 6) {
            if (currentDay == 0)
                currentDayName = "Sunday";
            else if (currentDay == 1)
                currentDayName = "Monday";
            else if (currentDay == 2)
                currentDayName = "Tuesday";
            else if (currentDay == 3)
                currentDayName = "Wednesday";
            else if (currentDay == 4)
                currentDayName = "Thursday";
            else if (currentDay == 5)
                currentDayName = "Friday";
            else if (currentDay == 6)
                currentDayName = "Saturday";
        } else {
            currentDayName = "Not a valid day";
        }



        switch (currentDay) {
            case 0:
                currentDayName = "Sunday";
                break;
            case 1:
                currentDayName = "Monday";
                break;
            case 2:
                currentDayName = "Tuesday";
                break;
            case 3:
                currentDayName = "Wednesday";
                break;
            case 4:
                currentDayName = "Thursday";
                break;
            case 5:
                currentDayName = "Friday";
                break;
            case 6:
                currentDayName = "Saturday";
                break;
            default:
                currentDayName = "Not a valid day";
                break;
        }

        System.out.println("The selected day is " + currentDayName);
    }
}