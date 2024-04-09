package src.main.java.io.codelex.polymorphism.practice.exercise1;

public class Toyota implements Car {
    private Integer currentSpeed = 0;
    private final String name = "Toyota";


    public void speedUp() {
        currentSpeed += 12;
    }

    public void slowDown() {
        currentSpeed -= 12;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
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

