package io.codelex.TaskManagerProject;

public class TaskManagerMain {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();


        Task task1 = new WorkTask("Work on project X", "Complete the coding for project X", "2024/04/20", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task2 = new PersonalTask("Meet friends for coffee", "Catch up with friends at the local cafe", "2024/04/22", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task3 = new WorkTask("Review monthly expenses", "Review and categorize monthly expenses", "2024/04/25", "08:30", Category.FINANCIAL, Priority.LOW);
        Task task4 = new PersonalTask("Read 'The Great Gatsby'", "Read a few chapters of 'The Great Gatsby' novel", "2024/04/23", "08:30", Category.EDUCATIONAL, Priority.HIGH);
        Task task5 = new WorkTask("Clean the office", "Organize and clean up the office space", "2024/04/21", "08:30", Category.HOUSEHOLD, Priority.MEDIUM);
        Task task6 = new PersonalTask("Practice guitar", "Practice playing guitar for 30 minutes", "2024/04/22", "08:30", Category.HOBBIES, Priority.LOW);
        Task task7 = new WorkTask("Prepare presentation slides", "Create slides for the upcoming presentation", "2024/04/24", "08:30", Category.DIGITAL, Priority.HIGH);
        Task task8 = new PersonalTask("Call parents", "Catch up with parents over the phone", "2024/04/26", "08:30", Category.SOCIAL, Priority.MEDIUM);
        Task task9 = new WorkTask("Update budget spreadsheet", "Update the monthly budget spreadsheet", "2024/04/25", "08:30", Category.FINANCIAL, Priority.LOW);
        Task task10 = new PersonalTask("Study for Java certification", "Review Java concepts for 1 hour", "2024/04/27", "08:30", Category.EDUCATIONAL, Priority.HIGH);


        taskManager.add(task1);
        taskManager.add(task2);
        taskManager.add(task3);
        taskManager.add(task4);
        taskManager.add(task5);
        taskManager.add(task6);
        taskManager.add(task7);
        taskManager.add(task8);
        taskManager.add(task9);
        taskManager.add(task10);

        task1.extendEndDate("2025/04/20");
        task1.changeCompletionTime("19:30");

        TaskManagerOperations taskManagerOperations = new TaskManagerOperations(taskManager);
        taskManagerOperations.printTasksByCategory();
    }
}
