package src.main.java.io.codelex.oop.persons;

public abstract class Person2 {
    private final String firstName;
    private final String lastName;
    private final String id;
    private final int age;

    public Person2(String firstName, String lastName, String id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public abstract String getInfo();
}


