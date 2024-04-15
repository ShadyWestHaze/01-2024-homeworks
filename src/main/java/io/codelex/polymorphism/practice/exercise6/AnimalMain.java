package src.main.java.io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Mouse("Micky", 4.0, "Under the floor"));
        animalList.add(new Cat("Puss in boots", 4.0, "Home", "Black"));
        animalList.add(new Zebra("Stripy", 20.0, "Kenya"));
        animalList.add(new Tiger("Tyga", 10.0, "Russia"));

        do {
            for (Animal animal : animalList) {
                System.out.println("\n" + animal);
                animal.makeSound();
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("end")) {
                    break;
                }

                String[] parts = input.split(" ");
                if (parts.length == 2) {
                    String foodType = parts[0];
                    int quantity = Integer.parseInt(parts[1]);

                    if (foodType.equalsIgnoreCase("vegetable")) {
                        animal.eat(new Vegetable(quantity));

                    } else if (foodType.equalsIgnoreCase("meat")) {
                        animal.eat(new Meat(quantity));
                    }
                    System.out.println("[" + animal + ", " + animal.foodEaten + "]");
                } else {
                    System.out.println("\nEnter food type and quantity separated by space.\n");
                }
            }
        } while (!input.equalsIgnoreCase("End"));

        for (Animal animal : animalList) {
            System.out.println("[" + animal + ", " + animal.foodEaten + "]");

        }

        scanner.close();
    }

}
