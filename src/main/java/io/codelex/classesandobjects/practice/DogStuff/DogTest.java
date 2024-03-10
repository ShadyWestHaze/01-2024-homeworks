package src.main.java.io.codelex.classesandobjects.practice.DogStuff;

import java.util.ArrayList;
import java.util.List;

public class DogTest {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        Dog dogSparky = new Dog("Sparky", true, null, null);
        dogs.add(dogSparky);
        Dog dogSam = new Dog("Sam", true, null, null);
        dogs.add(dogSam);
        Dog dogLady = new Dog("Lady", false, null, null);
        dogs.add(dogLady);
        Dog dogMolly = new Dog("Molly", false, null, null);
        dogs.add(dogMolly);
        Dog dogBuster = new Dog("Buster", true, dogLady, dogSparky);
        dogs.add(dogBuster);
        Dog dogRocky = new Dog("Rocky", true, dogMolly, dogSam);
        dogs.add(dogRocky);
        Dog dogCoco = new Dog("Coco", false, dogMolly, dogBuster);
        dogs.add(dogCoco);
        Dog dogMax = new Dog("Max", true, dogLady, dogRocky);
        dogs.add(dogMax);

        for (Dog d : dogs) {
            System.out.println(d.printDog() + "\n" + d.fathersName() + "\n");
        }
        if (dogCoco.hasSameMotherAs(dogRocky)) {
            System.out.println(dogCoco + " & " + dogRocky + " have the same mother");
        }

    }
}
