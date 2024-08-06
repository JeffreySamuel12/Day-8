
import java.util.*;
public class Eh1{
    public static void main(String []args){
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        try {
            int input = scanner.nextInt();
            int result = 100 / input;
            System.out.println("100 divided by " + input + " is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
}
}