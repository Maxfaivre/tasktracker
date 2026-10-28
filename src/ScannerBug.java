import java.util.Scanner;
public class ScannerBug {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your full name: ");
        String name = input.nextLine();
        System.out.println("Name entered: " + name);
        // nextInt() leaves the newline in the input.
// nextLine() reads that leftover newline, so the name is empty.
// To fix it, add input.nextLine() after nextInt() before reading the name.

    }
}
