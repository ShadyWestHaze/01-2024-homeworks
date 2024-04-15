package src.main.java.io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {

    private final String breed;
    private final static String TYPE = "Cat";

    public Cat(String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalWeight, livingRegion);

        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Meowwww");
    }


    @Override
    public void eat(Food food) {

        super.eat(food);

    }

    @Override
    public String toString() {
        return TYPE + " " +
                animalName + " " +
                animalWeight + " " +
                livingRegion + " " +
                breed + " ";
    }
}
