package io.codelex.extra.TaskManager;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Task {
    void start();

    void end();

    String getTitle();

    void extendEndDate(String newEndDate);

    void changeCompletionTime(String newCompletionTime);

    Category getCategory();

    Priority getPriority();

    String getDescription();

    LocalDate getEndDate();

    LocalTime getCompletionTime();
}
