package io.codelex.TaskManagerProject;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private final List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void add(Task task) {
        tasks.add(task);
        System.out.println("Task added: " + task.getTitle());

    }

    public void remove(Task task) {
        if (tasks.remove(task)) {
            System.out.println("Task removed: " + task.getTitle());
        } else {
            System.out.println("Task not found: " + task.getTitle());
        }
    }

    public void finish(Task task) {
        tasks.remove(task);
        System.out.println("Task successfully finished : " + task.getTitle());
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available");
        } else {
            System.out.println("Tasks:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }


    public List<Task> getTasks() {
        return tasks;
    }
}
