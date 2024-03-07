package src.main.java.io.codelex.classesandobjects.practice.CarStuff;

class Odometer {
    private int currentMileage;
    private final FuelGauge fuelGauge;

    public Odometer(FuelGauge fuelGauge) {
        this.currentMileage = 0;
        this.fuelGauge = fuelGauge;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void incrementMileage() {
        if (currentMileage < 999999) {
            currentMileage++;
            if (currentMileage % 10 == 0) {
                fuelGauge.decrementFuel();
            }
        } else {
            currentMileage = 0;
        }
    }
}