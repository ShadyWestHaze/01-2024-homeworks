package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {
        int carsAvailable, driversAvailable, passengers, carsNotDriven, carsDriven;
        double seatsInCar, carpoolCapacity, averagePassengersPerCar;

        carsAvailable = 100;
        seatsInCar = 4.0;
        driversAvailable = 30;
        passengers = 90;
        carsNotDriven = carsAvailable - driversAvailable;
        carsDriven = driversAvailable;
        carpoolCapacity = carsDriven * seatsInCar;
        averagePassengersPerCar = (double) passengers / carsDriven;

        System.out.println("There are " + carsAvailable + " cars available.");
        System.out.println("There are only " + driversAvailable + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + String.format("%.2f", carpoolCapacity) + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + String.format("%.2f", averagePassengersPerCar) + " in each car.");
    }
}