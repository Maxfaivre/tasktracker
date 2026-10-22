void main() {
    String task1 = "Buy milk";
    String task2 = "Walk the dog";
    boolean task1Removed = false;
    boolean task2Removed = false;
    boolean task1Done = true;
    boolean task2Done = false;

    String status1 = "[ ]";
    if (task1Done) {
        status1 = "[x]";
    }

    String status2 = "[ ]";
    if (task2Done) {
        status2 = "[x]";
    }

    System.out.println("My Tasks:");

for (int i = 0; i < 20; i++) {
    System.out.print("-");
}
System.out.println();

    if (!task1Removed) {
        System.out.println("1. " + status1 + " " + task1);
    }
    if (!task2Removed) {
        System.out.println("2. " + status2 + " " + task2);
    }
}
static java.util.ArrayList<Task> tasks = new java.util.ArrayList<>();

static void countTasks() {
    int total = tasks.size();
    int done = 0;

    for (Task t : tasks) {
        if (t.done) {
            done++;
        }
    }

    System.out.println(done + "/" + total + " tasks complete");
}