package src.main.java.io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    String livingRegion;

    public Mammal(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight);
        this.livingRegion = livingRegion;
    }
}
