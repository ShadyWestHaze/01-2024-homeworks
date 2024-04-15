package src.main.java.io.codelex.polymorphism.practice.exercise3;

public class HumanTest {
    public static void main(String[] args) {
        Student student = new Student("Slim", "Shady", "Amityville", 1001, 4.2);
        Employee employee = new Employee("Franklin", "Clinton", "3671 Whispymound Drive", 9379, "Auto Shop Employee");

        System.out.println("\nStudent info:");
        student.display();
        System.out.println("\nEmployee info:");
        employee.display();
    }
}
