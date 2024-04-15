package src.main.java.io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car {
    private Integer currentSpeed = 0;
    private final String name = "Lexus";


    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed -= 8;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String getName() {
        return name;
    }
}
