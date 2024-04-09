package src.main.java.io.codelex.polymorphism.practice.exercise1;

public interface Car {
    void speedUp();

    void slowDown();

    String showCurrentSpeed();

    void startEngine();

    default void useNitrousOxideEngine() {
    }

    int getCurrentSpeed();

    String getName();
}
