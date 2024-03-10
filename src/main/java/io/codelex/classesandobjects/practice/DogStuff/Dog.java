package src.main.java.io.codelex.classesandobjects.practice.DogStuff;

public class Dog {
    private final String name;
    private final Boolean isMale;
    private final Object mother;
    private final Object father;

    public Dog(String name, Boolean isMale, Object mother, Object father) {

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
}
