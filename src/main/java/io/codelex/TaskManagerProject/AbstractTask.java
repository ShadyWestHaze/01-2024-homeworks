package io.codelex.TaskManagerProject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class AbstractTask implements Task {
    private final String title;
    private final String description;
    private LocalDate endDate;
    private LocalTime completionTime;
    private final Category category;
    private final Priority priority;

    public AbstractTask(String title, String description, String endDate, String completionTime, Category category, Priority priority) {
        this.title = title;
        this.description = description;
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        this.endDate = LocalDate.parse(endDate, dateFormatter);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        this.completionTime = LocalTime.parse(completionTime, timeFormatter);
        this.category = category;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalTime getCompletionTime() {
        return completionTime;
    }


    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public Priority getPriority() {
        return priority;
    }

    public int calculateDaysLeft() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.until(endDate).getDays();
    }

    public void extendEndDate(String newEndDate) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate parsedEndDate = LocalDate.parse(newEndDate, dateFormatter);
        this.endDate = parsedEndDate;
    }

    // Method to change completion time
    public void changeCompletionTime(String newCompletionTime) {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime parsedCompletionTime = LocalTime.parse(newCompletionTime, timeFormatter);
        this.completionTime = parsedCompletionTime;
    }


    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Description: " + description + "\n" +
                "End Date: " + endDate + "\n" +
                "Completion Time: " + completionTime + "\n" +
                "Category: " + category + "\n" +
                "Priority: " + priority + "\n";

    }


}
