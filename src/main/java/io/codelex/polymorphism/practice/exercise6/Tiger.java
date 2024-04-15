package src.main.java.io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {

    public final static String TYPE = "Tiger";

    public Tiger(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);


    }

    public void makeSound() {
        System.out.println("Rooooooooooar");
    }


    @Override
    public void eat(Food food) {

        if (food.getType().equals("Meat")) {
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
