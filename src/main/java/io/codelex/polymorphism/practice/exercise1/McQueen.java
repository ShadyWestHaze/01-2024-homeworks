package src.main.java.io.codelex.polymorphism.practice.exercise1;

public class McQueen implements Car {
    private Integer currentSpeed = 0;
    private final String name = "McQueen";


    public void speedUp() {
        currentSpeed += 40;
    }

    public void slowDown() {
        currentSpeed -= 40;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Kachow.....");
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String getName() {
        return name;
    }
}
