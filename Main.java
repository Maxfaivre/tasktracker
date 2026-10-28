
import java.util.ArrayList;

public class Main {

    static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("My Tasks:");
        System.out.println("--------------------");

        addTask("Buy milk", "2026-11-01", "high");
        addTask("Walk the dog");

        countTasks();
    }

    public static void addTask(String taskName) {
        addTask(taskName, "none", "normal");
    }

    public static void addTask(String taskName, String dueDate, String priority) {
        tasks.add(new Task(taskName, false));
        System.out.println("Added task: " + taskName
                + " (due " + dueDate
                + ", priority: " + priority + ")");
    }

    public static void countTasks() {
        int total = tasks.size();
        int done = 0;

        for (Task t : tasks) {
            if (t.done) {
                done++;
            }
        }

        System.out.println(done + "/" + total + " tasks complete");
    }
}
