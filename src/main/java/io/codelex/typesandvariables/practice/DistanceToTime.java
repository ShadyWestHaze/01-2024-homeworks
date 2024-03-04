package src.main.java.io.codelex.typesandvariables.practice;

import java.util.InputMismatchException;
import java.util.Scanner;
/* Java switch lore https://www.w3schools.com/java/java_switch.asp
   Java while lore  https://www.w3schools.com/java/java_while_loop.asp */
public class DistanceToTime {
    static double hours = 0;
    static double minutes = 0;
    static double seconds = 0;
    static double distanceM = 0;
    static double speed =0; //cuz if it is int then result is rounded to the nearest whole nr... double for precision
    static double timeSec =0;
    public static void main(String[] args){
        int getChoice= 0;
        boolean validSelection = false;
        Scanner userInnput = new Scanner(System.in);

        System.out.println("Please enter a number for what you want to calculate");
        System.out.println("1:Speed              2:Time               3:Distance");

        while (!validSelection) {
            try {
                getChoice = userInnput.nextInt();
                if (getChoice == 1 || getChoice == 2 || getChoice ==3) {
                    validSelection = true;
                } else {
                    System.out.println("Invalid selection. Please enter 1 or 2 or 3:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 1 or 2 or 3:");
                userInnput.next();
            }
        }

        switch (getChoice){
            case 1://Speed
                System.out.println("To calculate speed please provide: Time and Distance(meters)");
                getTime();
                getDistance();
            speed = distanceM /(hours +  minutes /60 +  seconds /3600);
                System.out.printf("Your speed in meters per second is %.8fm/s \n",speed/3600);
                System.out.printf("Your speed in km per hour is %.8fkm/h \n",(speed/3600)*3.6);
                System.out.printf("Your speed in miles per hour is %.8fmph \n",(speed/3600)*2.23694);

                break;
            case 2://Time
                System.out.println("To calculate time please provide: Distance(meters) and Speed(m/s)");
                getDistance();
                getSpeed();
                timeSec =  distanceM / speed;
                System.out.printf("To reach destination will take %.2fseconds \n" , timeSec);
                System.out.printf("To reach destination will take %.2fminutes \n" , timeSec/60);
                System.out.printf("To reach destination will take %.2fhours \n" , timeSec/3600);

                break;
            case 3://Distance
                System.out.println("To calculate Distance please provide: Speed(m/s) and Time");
                getSpeed();
                getTime();
                distanceM = (hours + minutes / 60.0 + seconds / 3600.0) * speed;
                System.out.printf("Distance traveled is %.1fm \n " , distanceM*3600);
                System.out.printf("Distance traveled is %.1fkm \n " , distanceM*3.6);
                System.out.printf("Distance traveled is %.2fmiles \n " , distanceM*2.23694);

                break;

        }

    }
    public static void getTime(){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter time it takes to reach destination, leave 0 if lower time.");
        do {
            System.out.print("Enter hours:");
            hours = userInput.nextInt();
            if (hours < 0) {
                System.out.println("Invalid input for hours. Please enter a non-negative value.");
            }
        } while (hours < 0);

        do {
            System.out.print("Enter minutes:");
            minutes = userInput.nextInt();
            if (minutes < 0 || minutes >= 60) {
                System.out.println("Invalid input for minutes. Please enter a value between 0 and 59.");
            }
        } while (minutes < 0 || minutes >= 60);

        do {
            System.out.print("Enter seconds:");
            seconds = userInput.nextInt();
            if (seconds < 0 || seconds >= 60) {
                System.out.println("Invalid input for seconds. Please enter a value between 0 and 59.");
            }
        } while (seconds < 0 || seconds >= 60);

    }
    public static void getDistance() {
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.print("Enter distance to travel in meters:");
            while (!userInput.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                System.out.print("Enter distance to travel in meters:");
                userInput.next();
            }
            distanceM = userInput.nextDouble();

            if (distanceM < 0) {
                System.out.println("Invalid input for distance. Please enter a non-negative value.");
            }
        } while (distanceM < 0);
    }
    public static void getSpeed() {
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.print("Enter the speed (m/s) used to reach the destination:");
            while (!userInput.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                System.out.print("Enter the speed (m/s) used to reach the destination:");
                userInput.next();
            }
            speed = userInput.nextDouble();

            if (speed < 0) {
                System.out.println("Invalid input for speed. Please enter a non-negative value.");
            }
        } while (speed < 0);
    }

}

