package src.main.java.io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car {
    private Integer currentSpeed = 0;
    private final String name = "Audi";

    public void speedUp() {
        currentSpeed += 10;
    }

    public void slowDown() {
        currentSpeed -= 10;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String getName() {
        return name;
    }
}
