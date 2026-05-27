public class ConditionalStatements {
    public static void main(String[] args) {

        int age = 20;

        // If Statement
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }

        // If-Else Statement
        if (age % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // Else-If Ladder
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
