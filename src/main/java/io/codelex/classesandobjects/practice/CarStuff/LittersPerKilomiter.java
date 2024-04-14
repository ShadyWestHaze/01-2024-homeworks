package src.main.java.io.codelex.classesandobjects.practice.CarStuff;


import java.util.Scanner;

class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Car car1 = getCarInfo(userInput, "Car 1");
        printCarInfo(car1);

        Car car2 = getCarInfo(userInput, "Car 2");
        printCarInfo(car2);
    }

    public static Car getCarInfo(Scanner userInput, String carName) {
        System.out.println(carName + ":");
        System.out.print("Enter first reading of the odometer: ");
        double startKilometers = userInput.nextDouble();
        Car car = new Car(startKilometers);

        System.out.print("Enter current reading of the odometer: ");
        int currentReading = userInput.nextInt();
        System.out.print("Enter liters filled up: ");
        double litersFilled = userInput.nextDouble();
        car.fillUp(currentReading, litersFilled);

        return car;
    }

    public static void printCarInfo(Car car) {
        System.out.println("Fuel consumption: " + car.calculateConsumption() + " liters per 100 kilometers");
        if (car.gasHog()) {
            System.out.println("The car is a gas hog.");
        } else if (car.economyCar()) {
            System.out.println("The car is an economy car.");
        }
    }
}
