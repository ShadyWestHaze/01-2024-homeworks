package src.main.java.io.codelex.classesandobjects.practice.CarStuff;

public class CarSimulation {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(fuelGauge);

        for (int i = 0; i < 70; i++) {
            fuelGauge.incrementFuel();
        }

        while (fuelGauge.getCurrentFuel() > 0) {
            odometer.incrementMileage();
            System.out.println("Current Mileage: " + odometer.getCurrentMileage() +
                    " km, Current Fuel: " + fuelGauge.getCurrentFuel() + " liters");
        }
    }
}