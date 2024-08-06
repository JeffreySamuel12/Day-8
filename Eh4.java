import java.util.*;

public class Eh4 {
    
    public static class NegativeNumberException extends RuntimeException {
        public NegativeNumberException(String message) {
            super(message); // Passes the message to the superclass (RuntimeException)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            checkNumber(number);
            System.out.println("The number is: " + number);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    public static void checkNumber(int number) {
        if (number < 0) {
            throw new NegativeNumberException("Number must not be negative.");
        }
    }
}

