package io.codelex.tasks.practice;

import io.codelex.TaskManagerProject.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("SimplifiableJUnitAssertion")
public class TaskManagerTest {

    @Test
    public void shouldAddTasksToTaskManager() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2024/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task2", "Description2", "2024/04/20", "08:30", Category.SOCIAL, Priority.MEDIUM);
        taskManager.add(task1);
        taskManager.add(task2);
        List<Task> tasks = taskManager.getTasks();
        assertThat(tasks.size(), is(equalTo(2)));
        assertThat(tasks.get(0), is(equalTo(task1)));
        assertThat(tasks.get(1), is(equalTo(task2)));
    }

    @Test
    public void shouldRemoveTaskFromTaskManager() {
        TaskManager taskManager = new TaskManager();
        Task task = new WorkTask("Task", "Description for task", "2024/04/20", "08:30", Category.DIGITAL, Priority.HIGH);

        taskManager.add(task);
        taskManager.remove(task);

        List<Task> tasks = taskManager.getTasks();
        assertThat(tasks.size(), is(equalTo(0)));
    }

    @Test
    public void shouldFinishTask() {
        TaskManager taskManager = new TaskManager();
        Task task = new WorkTask("Task", "Description for task", "2024/04/20", "08:30", Category.DIGITAL, Priority.HIGH);

        taskManager.add(task);
        taskManager.finish(task);

        List<Task> tasks = taskManager.getTasks();
        assertThat(tasks.size(), is(equalTo(0)));
    }

    @Test
    public void shouldExtendEndDate() {
        AbstractTask task = new WorkTask("Title", "Description", "2024/04/20", "08:30", Category.FINANCIAL, Priority.HIGH);
        task.extendEndDate("2024/04/25");
        assertEquals(LocalDate.parse("2024/04/25", DateTimeFormatter.ofPattern("yyyy/MM/dd")), task.getEndDate());
    }

    @Test
    public void shouldChangeCompletionTime() {
        AbstractTask task = new WorkTask("Title", "Description", "2024/04/20", "08:30", Category.HOBBIES, Priority.HIGH);
        task.changeCompletionTime("12:00");
        assertEquals(LocalTime.parse("12:00", DateTimeFormatter.ofPattern("HH:mm")), task.getCompletionTime());
    }

    @Test
    public void shouldCalculateDaysLeft() {
        AbstractTask task = new WorkTask("Title", "Description", "2024/04/20", "08:30", Category.EDUCATIONAL, Priority.HIGH);
        LocalDate currentDate = LocalDate.of(2024, 4, 15);
        System.setProperty("java.time.LocalDate.now", currentDate.toString());
        int daysLeft = task.calculateDaysLeft() - 1;
        assertEquals(5, daysLeft);
    }

    @Test
    public void shouldSortTasksByEndDate() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2024/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task2", "Description2", "2024/04/21", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Task3", "Description3", "2024/04/22", "08:30", Category.FINANCIAL, Priority.LOW);
        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        List<Task> sortedTasks = taskManagerOperations.sortTasksByEndDate();
        assertEquals(task1, sortedTasks.get(0));
        assertEquals(task2, sortedTasks.get(1));
        assertEquals(task3, sortedTasks.get(2));
    }

    @Test
    public void shouldFilterTasksByCategory() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2024/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task2", "Description2", "2024/04/21", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Task3", "Description3", "2024/04/22", "08:30", Category.DIGITAL, Priority.LOW);
        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        List<Task> filteredTasks = taskManagerOperations.filterTasksByCategory(Category.DIGITAL);
        assertEquals(2, filteredTasks.size());
        assertThat(filteredTasks, contains(task1, task3));
    }

    @Test
    public void shouldFilterTasksByPriority() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2024/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task2", "Description2", "2024/04/21", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Task3", "Description3", "2024/04/22", "08:30", Category.DIGITAL, Priority.LOW);
        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        List<Task> filteredTasks = taskManagerOperations.filterTasksByPriority(Priority.HIGH);
        assertEquals(1, filteredTasks.size());
        assertThat(filteredTasks, contains(task1));
    }

    @Test
    public void shouldFilterTasksByMonth() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2024/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task2", "Description2", "2024/04/21", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Task3", "Description3", "2024/05/22", "08:30", Category.DIGITAL, Priority.LOW);
        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        List<Task> filteredTasks = taskManagerOperations.filterTasksByMonth(LocalDate.of(2022, 4, 1));
        assertEquals(2, filteredTasks.size());
        assertThat(filteredTasks, contains(task1, task2));
    }

    @Test
    public void shouldFilterTasksByYear() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2022/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task2", "Description2", "2024/04/21", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Task3", "Description3", "2022/05/22", "08:30", Category.DIGITAL, Priority.LOW);
        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        List<Task> filteredTasks = taskManagerOperations.filterTasksByYear(LocalDate.of(2022, 4, 1));
        assertEquals(2, filteredTasks.size());
        assertThat(filteredTasks, contains(task1, task3));
    }

    @Test
    public void shouldCountTasksByYear() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2022/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task2", "Description2", "2024/04/21", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Task3", "Description3", "2022/05/22", "08:30", Category.DIGITAL, Priority.LOW);
        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        int tasksInYear = taskManagerOperations.countTasksByYear(LocalDate.of(2022, 1, 1));
        assertEquals(2, tasksInYear);

    }

    @Test
    public void shouldCountTasksByMonth() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2022/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task2", "Description2", "2024/04/21", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Task3", "Description3", "2022/05/22", "08:30", Category.DIGITAL, Priority.LOW);
        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        int tasksInMonth = taskManagerOperations.countTasksByMonth(LocalDate.of(2022, 1, 1));
        assertEquals(2, tasksInMonth);

    }

    @Test
    public void shouldCountTasksByPriority() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2022/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task2", "Description2", "2024/04/21", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Task3", "Description3", "2022/05/22", "08:30", Category.DIGITAL, Priority.LOW);
        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        int tasksByPriority = taskManagerOperations.countTasksByPriority(Priority.MEDIUM);
        assertEquals(1, tasksByPriority);

    }

    @Test
    public void shouldCountTasksByCategory() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2022/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task2", "Description2", "2024/04/21", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Task3", "Description3", "2022/05/22", "08:30", Category.DIGITAL, Priority.LOW);
        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        int tasksByCategory = taskManagerOperations.countTasksByCategory(Category.DIGITAL);
        assertEquals(2, tasksByCategory);

    }

    @Test
    public void shouldFindOverdueTasks() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2024/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task2", "Description2", "2024/05/21", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Task3", "Description3", "2023/06/22", "08:30", Category.DIGITAL, Priority.LOW);
        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        List<Task> overdueTasks = taskManagerOperations.findOverdueTasks(LocalDate.of(2024, 5, 1));
        assertEquals(2, overdueTasks.size());
        assertThat(overdueTasks, contains(task1, task3));
    }

    @Test
    public void shouldFindTasksByKeywords() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2024/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task1", "Description2", "2024/05/21", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Task3", "Description3", "2023/06/22", "08:30", Category.DIGITAL, Priority.LOW);
        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        List<Task> tasksByKeywords = taskManagerOperations.findTasksByKeywords("Task1");
        assertEquals(2, tasksByKeywords.size());
        assertThat(tasksByKeywords, contains(task1, task2));
    }

    @Test
    public void testFindTasksInDateRange() {
        TaskManager taskManager = new TaskManager();
        Task task1 = new WorkTask("Task1", "Description1", "2024/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Task2", "Description2", "2024/05/21", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Task3", "Description3", "2024/06/22", "08:30", Category.DIGITAL, Priority.LOW);
        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        List<Task> tasksInRange = taskManagerOperations.findTasksInDateRange(LocalDate.of(2024, 4, 1), LocalDate.of(2024, 6, 1));
        assertEquals(2, tasksInRange.size());
        assertThat(tasksInRange, contains(task1, task2));
    }

    @Test
    void shouldArrangeToDoListByCategory() {
        TaskManager taskManager = new TaskManager();
        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        Task task1 = new WorkTask("Work Task 1", "Work on project X", "2024/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Personal Task 1", "Go for a run", "2024/04/22", "08:30", Category.SOCIAL, Priority.MEDIUM);
        taskManager.add(task1);
        taskManager.add(task2);

        Map<Category, List<Task>> expectedToDoList = Map.of(
                Category.DIGITAL, List.of(task1),
                Category.SOCIAL, List.of(task2)
        );
        Map<Category, List<Task>> actualToDoList = taskManagerOperations.toDoListByCategory();
        assertEquals(expectedToDoList, actualToDoList);
    }

}

