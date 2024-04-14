package io.codelex.extra.TaskManager;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskManagerOperations {
    private final TaskManager taskManager;

    public TaskManagerOperations(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public List<Task> sortTasksByEndDate() {
        return taskManager.getTasks().stream()
                .sorted(Comparator.comparing(Task::getEndDate))
                .collect(Collectors.toList());
    }

    public List<Task> filterTasksByCategory(Category category) {
        return taskManager.getTasks().stream()
                .filter(task -> task.getCategory() == category)
                .collect(Collectors.toList());

    }

    public List<Task> filterTasksByPriority(Priority priority) {
        return taskManager.getTasks().stream()
                .filter(task -> task.getPriority() == priority)
                .collect(Collectors.toList());
    }

    public List<Task> filterTasksByMonth(LocalDate month) {
        return taskManager.getTasks().stream()
                .filter(task -> task.getEndDate().getMonth() == month.getMonth())
                .collect(Collectors.toList());
    }

    public List<Task> filterTasksByYear(LocalDate year) {
        return taskManager.getTasks().stream()
                .filter(task -> task.getEndDate().getYear() == year.getYear())
                .collect(Collectors.toList());
    }

    public Integer countTasksByYear(LocalDate year) {
        return (int) taskManager.getTasks().stream()
                .filter(task -> task.getEndDate().getYear() == year.getYear())
                .count();
    }

    public Integer countTasksByMonth(LocalDate month) {
        return (int) taskManager.getTasks().stream()
                .filter(task -> task.getEndDate().getYear() == month.getYear())
                .count();
    }

    public Integer countTasksByPriority(Priority priority) {
        return (int) taskManager.getTasks().stream()
                .filter(task -> task.getPriority() == priority)
                .count();
    }

    public Integer countTasksByCategory(Category category) {
        return (int) taskManager.getTasks().stream()
                .filter(task -> task.getCategory() == category)
                .count();
    }

    public List<Task> findOverdueTasks(LocalDate date) {
        return taskManager.getTasks().stream()
                .filter(task -> task.getEndDate().isBefore(date))
                .collect(Collectors.toList());
    }

    public List<Task> findTasksByKeywords(String keyword) {
        return taskManager.getTasks().stream()
                .filter(task -> task.getTitle().equals(keyword))
                .collect(Collectors.toList());

    }

    public List<Task> findTasksInDateRange(LocalDate startDate, LocalDate endDate) {
        return taskManager.getTasks().stream()
                .filter(task -> task.getEndDate().isAfter(startDate) && task.getEndDate().isBefore(endDate))
                .collect(Collectors.toList());
    }

    public Map<Category, List<Task>> toDoListByCategory() {
        return taskManager.getTasks().stream()
                .collect(new ToDoListCollectorByCategory());
    }

    public void printTasksByCategory() {
        Map<Category, List<Task>> toDoListByCategory = toDoListByCategory();

        toDoListByCategory.forEach((category, tasks) -> {
            System.out.println("Category: " + category);
            tasks.forEach(task -> System.out.println("- " + task));
            System.out.println();
        });
    }


}
