import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, temp;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.println("\nBefore Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
