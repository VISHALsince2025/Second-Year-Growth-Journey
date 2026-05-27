import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int factorial = 1;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
