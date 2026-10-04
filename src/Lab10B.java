import java.util.Scanner;

public class Lab10B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is your grade? ");
        int grade = input.nextInt();
        String letter;

        if (grade >= 90) {
            letter = "A";
        } else if (grade >= 80) {
            letter = "B";
        } else if (grade >= 70) {
            letter = "C";
        } else if (grade >= 60) {
            letter = "D";
        } else {
            letter = "F";
        }
        if (!letter.equals("F")) {
            int lastDigit = grade % 10;

            if (lastDigit <= 4) {
                letter = letter + "-";
            } else if (lastDigit >= 6) {
                letter = letter + "+";
            }
        }

        System.out.println("You have a " + letter + " in the class.");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = input.nextDouble();

        if (age >= 18 && gpa >= 3.0) {
            System.out.println("Eligible for scholarship");
        } else {
            System.out.println("Not eligible for scholarship");
        }

        if (age >= 18 || gpa >= 3.5) {
            System.out.println("Eligible for easier scholarship");
        } else {
            System.out.println("Not eligible for easier scholarship");
        }
        System.out.print("Enter a menu choice (A, B, or C): ");
        String choice = input.next();

        switch (choice) {
            case "A":
                System.out.println("You chose option A.");
                break;
            case "B":
                System.out.println("You chose option B.");
                break;
            case "C":
                System.out.println("You chose option C.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

}