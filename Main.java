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
    if (!task1Removed) {
        System.out.println("1. " + status1 + " " + task1);
    }
    if (!task2Removed) {
        System.out.println("2. " + status2 + " " + task2);
    }
}
