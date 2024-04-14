package src.main.java.io.codelex.classesandobjects.practice.CarStuff;

public class Car {
    private final double startKilometers;
    private double endKilometers;
    private double totalLiters;

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;

    }

    public void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.totalLiters += liters;
    }

    public double calculateConsumption() {
        if (startKilometers == endKilometers) {
            return 0.0;
        }
        return (totalLiters / (endKilometers - startKilometers)) * 100;
    }

    public boolean gasHog() {
        return calculateConsumption() > 15.0;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5.0;
    }

    public double getOdometerReading() {
        return endKilometers;
    }
}




