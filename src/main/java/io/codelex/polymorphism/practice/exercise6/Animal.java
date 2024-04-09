package src.main.java.io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    String animalName;

    Double animalWeight;
    int foodEaten = 0;

    public Animal(String animalName, Double animalWeight) {
        this.animalName = animalName;
        this.animalWeight = animalWeight;
    }

    @Override
    public String toString() {
        return
                animalName + ", " +
                        animalWeight + ", " +
                        foodEaten;

    }


    public abstract void makeSound();

    public void eat(Food food) {
        foodEaten += food.getQuantity();
    }

    public int getFoodEaten() {
        return foodEaten;
    }
}
