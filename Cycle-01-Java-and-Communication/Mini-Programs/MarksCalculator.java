import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks1, marks2, marks3;
        int total;
        double percentage;

        System.out.print("Enter marks of Subject 1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        marks2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        marks3 = sc.nextInt();

        total = marks1 + marks2 + marks3;

        percentage = total / 3.0;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 75) {
            System.out.println("Grade: B");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }
    }
}
