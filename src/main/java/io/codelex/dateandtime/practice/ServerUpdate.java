package src.main.java.io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServerUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year of server launch: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month of launch (1-12): ");
        int monthInt = scanner.nextInt();
        Month month = Month.of(monthInt);

        System.out.print("Enter the day of the launch: ");
        int dayOfMonth = scanner.nextInt();

        LocalDate serverLaunchDate = LocalDate.of(year, month, dayOfMonth);

        List<LocalDate> updateDates = calculateUpdateDates(serverLaunchDate, month);

        System.out.println("Server update dates for " + month + " " + year + ":");
        for (LocalDate updateDate : updateDates) {
            System.out.println(updateDate);
        }
    }

    public static List<LocalDate> calculateUpdateDates(LocalDate serverLaunchDate, Month month) {
        List<LocalDate> updateDates = new ArrayList<>();

        LocalDate currentDate = serverLaunchDate.plusDays(14);

        while (currentDate.getMonth() == month) {
            updateDates.add(currentDate);
            currentDate = currentDate.plusDays(14);
        }

        return updateDates;
    }
}
