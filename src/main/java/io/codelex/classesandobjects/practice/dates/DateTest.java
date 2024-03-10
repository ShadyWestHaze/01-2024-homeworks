package src.main.java.io.codelex.classesandobjects.practice.dates;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(00, 00, 0000);
        date.getDate();
        System.out.println("Enter your date of birth D/M/Y:");
        date.setDate();
        System.out.printf("Date of birth: %s \nwhere %d is day, %d is month, %d is year", date.displayDate(), date.getDay(), date.getMonth(), date.getYear());

    }
}
