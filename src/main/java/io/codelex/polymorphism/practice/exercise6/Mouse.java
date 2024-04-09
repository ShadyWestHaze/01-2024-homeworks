package src.main.java.io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {
    private final static String TYPE = "Mouse";

    public Mouse(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Where my cheese at?");
    }

    @Override
    public void eat(Food food) {
        if (food.getType().equals("Vegetable")) {
            super.eat(food);
        } else {
            System.out.println(TYPE + "'s dont eat that type of food");
        }
    }

    @Override
    public String toString() {
        return TYPE + " " +
                animalName + " " +
                animalWeight + " " +
                livingRegion + " ";
    }
}
