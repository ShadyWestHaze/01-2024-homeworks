package io.codelex.extra.TaskManager;

public class PersonalTask extends AbstractTask {


    public PersonalTask(String title, String description, String endDate, String completionTime, Category category, Priority priority) {
        super(title, description, endDate, completionTime, category, priority);
    }

    @Override
    public void start() {
        System.out.println("Starting work on personal task:" + getTitle());
    }

    @Override
    public void end() {
        System.out.println("Ending work on personal task:" + getTitle());
    }

}

