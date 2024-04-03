package src.main.java.io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeWork {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 3, 1);
        LocalDate endDate = LocalDate.of(2024, 3, 15);

        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(LocalDate.of(startDate.getYear(), 3, 8));
        holidays.add(LocalDate.of(startDate.getYear(), 3, 14));

        long totalHours = calculateWorkingHours(startDate, endDate, holidays);
        System.out.println("Total working hours between " + startDate + " and " + endDate + ": " + totalHours + " hours");
    }

    public static long calculateWorkingHours(LocalDate startDate, LocalDate endDate, List<LocalDate> holidays) {
        long workingDays = 0;
        long totalWorkingHours = 0;
        int shiftLength = 8;

        LocalDate currentDate = startDate;
        while (!currentDate.isAfter(endDate)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY &&
                    currentDate.getDayOfWeek() != DayOfWeek.SUNDAY &&
                    !holidays.contains(currentDate)) {
                workingDays++;
            }
            currentDate = currentDate.plusDays(1);
        }
        totalWorkingHours = workingDays * shiftLength;

        return totalWorkingHours;
    }

}
