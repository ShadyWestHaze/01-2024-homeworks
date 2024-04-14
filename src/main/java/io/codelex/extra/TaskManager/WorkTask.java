package io.codelex.extra.TaskManager;

public class WorkTask extends AbstractTask {


    public WorkTask(String title, String description, String endDate, String completionTime, Category category, Priority priority) {
        super(title, description, endDate, completionTime, category, priority);
    }

    @Override
    public void start() {
        System.out.println("Starting work task:" + getTitle());
    }

    @Override
    public void end() {
        System.out.println("Ending work task:" + getTitle());
    }

}
