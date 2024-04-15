package src.main.java.io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee2 extends Person2 {
    private final String POSITION;
    private final LocalDate STARTED_WORKING;

    public Employee2(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.POSITION = position;
        this.STARTED_WORKING = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(STARTED_WORKING, currentDate);
        return period.getYears();
    }

    @Override
    public String getInfo() {
        int yearsWorked = getWorkExperience();
        return getFirstName() + " " + getLastName() + ", " + POSITION + " (" + yearsWorked + " years)";
    }
}
