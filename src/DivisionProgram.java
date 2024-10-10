import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;

        // Loop until valid input is provided
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the numerator (integer): ");
                numerator = scanner.nextInt(); // Read the numerator

                System.out.print("Enter the denominator (integer): ");
                denominator = scanner.nextInt(); // Read the denominator

                // Perform division
                int result = numerator / denominator;
                System.out.println("Result: " + result);
                validInput = true; // Exit loop if division is successful
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Cannot divide by zero.");
                // Clear the invalid input from the scanner
                scanner.nextLine(); // Clear the input buffer
            } catch (InputMismatchException e) {
                // Handle invalid input
                System.out.println("Invalid input. Please enter integers only.");
                // Clear the invalid input from the scanner
                scanner.nextLine(); // Clear the input buffer
            }
        }

        // Close the scanner
        scanner.close();
    }
}
