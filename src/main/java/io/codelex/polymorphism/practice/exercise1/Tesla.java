package src.main.java.io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {
    private Integer currentSpeed = 0;
    private final String name = "Tesla";


    public void speedUp() {
        currentSpeed += 20;
    }

    public void slowDown() {
        currentSpeed -= 20;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("-- silence ---");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String getName() {
        return name;
    }
}
