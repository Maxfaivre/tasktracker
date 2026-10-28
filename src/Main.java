public class Main {
    public static void main(String[] args) {

        String task1 = "Buy milk";
        String task2 = "Walk the dog";

        boolean task1Removed = false;
        boolean task2Removed = true;
        System.out.println("My Tasks:");

        if (!task1Removed) {
            System.out.println("1. " + task1);
        }

        if (!task2Removed) {
            System.out.println("2. " + task2);
        }
    }
}