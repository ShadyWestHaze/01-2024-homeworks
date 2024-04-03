package src.main.java.io.codelex.classesandobjects.practice.DogStuff;

import java.util.Objects;

public class Dog {
    private final String name;
    private final Boolean isMale;
    private final Dog mother;
    private final Dog father;


    public Dog(String name, Boolean isMale, Dog mother, Dog father) {

        this.name = name;
        this.isMale = isMale;
        this.mother = mother;
        this.father = father;
    }

    public String printDog() {
        if (isMale) {
            return "The name of this dog is " + this.name + " who is a male";
        }
        return "The name of this dog is " + this.name + " who is a female";
    }

    public String fathersName() {
        if (father != null) {
            return this.name + "'s father is " + this.father;
        }
        return this.name + "'s father is unknown";
    }

    public String toString() {
        return this.name;
    }

    public Boolean hasSameMotherAs(Dog otherDog) {
        return otherDog.mother.equals(this.mother);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(mother, dog.mother) && Objects.equals(father, dog.father);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
