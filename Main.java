void main(String[] args) {
    String task1 = "Buy milk";
    String task2 = "Walk the dog";

    showTitle();
    showTask(task1);
    showTask(task2);
}

void showTitle() {
    System.out.println("My Tasks:");
}

void showTask(String task) {
    System.out.println("- " + task);
}
