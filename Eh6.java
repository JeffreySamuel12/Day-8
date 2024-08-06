import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        try {
            int result = 100 / inputNumber;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: Division by zero is not allowed.");
        } finally {
            System.out.println("Division operation is complete.");
        }

        scanner.close();
    }
}
