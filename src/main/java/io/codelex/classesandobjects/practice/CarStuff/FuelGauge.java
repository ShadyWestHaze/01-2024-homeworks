package src.main.java.io.codelex.classesandobjects.practice.CarStuff;

class FuelGauge {
    private int currentFuel;

    public FuelGauge() {
        this.currentFuel = 0;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void incrementFuel() {
        if (currentFuel < 70) {
            currentFuel++;
        } else {
            System.out.println("Fuel tank is already full.");
        }
    }

    public void decrementFuel() {
        if (currentFuel > 0) {
            currentFuel--;
        } else {
            System.out.println("Fuel tank is empty.");
        }
    }
}