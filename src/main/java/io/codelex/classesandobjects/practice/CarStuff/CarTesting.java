package src.main.java.io.codelex.classesandobjects.practice.CarStuff;


import java.util.Scanner;

public class CarTesting {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter how many tests to run: ");
        int testAmount = userInput.nextInt();
        System.out.print("Enter first reading of the odometer: ");
        double startKilometers = userInput.nextDouble();

        Car car = new Car(startKilometers);

        double totalLiters = 0.0;
        double totalDistance = 0.0;

        for (int i = 1; i <= testAmount; i++) {
            System.out.print("Enter current reading of the odometer after fill-up " + i + ": ");
            int currentReading = userInput.nextInt();
            System.out.print("Enter liters filled up: ");
            double litersFilled = userInput.nextDouble();

            car.fillUp(currentReading, litersFilled);
            totalLiters += litersFilled;
            totalDistance += car.getOdometerReading() - startKilometers;
            startKilometers = car.getOdometerReading();
        }

        double averageConsumption = (totalLiters / totalDistance) * 100;

        System.out.println("Average fuel consumption: " + averageConsumption + " liters per 100 kilometers");
        if (car.gasHog()) {
            System.out.println("The car is a gas hog.");
        } else if (car.economyCar()) {
            System.out.println("The car is an economy car.");
        }
    }
}
