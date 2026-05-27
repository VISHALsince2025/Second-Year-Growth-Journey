import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principal, rate, time, simpleInterest;

        System.out.print("Enter Principal Amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        time = sc.nextDouble();

        simpleInterest = (principal * rate * time) / 100;

        System.out.println("\nSimple Interest: " + simpleInterest);
    }
}
