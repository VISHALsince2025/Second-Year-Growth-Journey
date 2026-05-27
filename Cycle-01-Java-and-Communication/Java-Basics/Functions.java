public class Functions {

    // Function to add two numbers
    static int addNumbers(int a, int b) {
        return a + b;
    }

    // Function to display message
    static void displayMessage() {
        System.out.println("Welcome to Java Functions");
    }

    public static void main(String[] args) {

        displayMessage();

        int result = addNumbers(10, 20);

        System.out.println("Sum: " + result);
    }
}
