package src.main.java.io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonsTest {
    public static void main(String[] args) {
        LocalDate employeeStartDate = LocalDate.of(2010, 5, 20);
        Employee2 employee = new Employee2("That", "Guy", "abc123", 30, "Manager", employeeStartDate);
        System.out.println("Employee Info:");
        System.out.println(employee.getInfo());
        System.out.println("Years of work experience: " + employee.getWorkExperience());
        System.out.println();

        Customer customer = new Customer("Kārlis", "Lielais", "abc1234", 25, "abc1234", 10);
        System.out.println("Customer Info:");
        System.out.println(customer.getInfo());
        System.out.println("Purchase count: " + customer.getPurchaseCount());

        customer.setPurchaseCount(15);
        System.out.println("Updated purchase count: " + customer.getPurchaseCount());
    }
}
