import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number, originalNumber, remainder;
        int result = 0;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        originalNumber = number;

        while (originalNumber != 0) {

            remainder = originalNumber % 10;

            result += remainder * remainder * remainder;

            originalNumber = originalNumber / 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }
    }
}
