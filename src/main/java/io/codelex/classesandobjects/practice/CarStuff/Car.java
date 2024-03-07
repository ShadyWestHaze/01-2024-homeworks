package src.main.java.io.codelex.classesandobjects.practice.CarStuff;

class Car {
    double startKilometers;
    double endKilometers;
    double totalLiters;

    Car(double startKilometers) {
        this.startKilometers = startKilometers;

    }

    void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.totalLiters += liters;
    }

    double calculateConsumption() {
        if (startKilometers == endKilometers) {
            return 0.0;
        }
        return (totalLiters / (endKilometers - startKilometers)) * 100;
    }

    boolean gasHog() {
        return calculateConsumption() > 15.0;
    }

    boolean economyCar() {
        return calculateConsumption() < 5.0;
    }

    public double getOdometerReading() {
        return endKilometers;
    }
}




