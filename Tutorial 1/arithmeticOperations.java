
import java.util.Scanner;

public class arithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Display the menu
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulo");
        System.out.println("6. Power");
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        // Perform the selected operation
        double result = 0;
        boolean validOperation = true;

        switch (choice) {
            case 1: // Add
                result = num1 + num2;
                System.out.println("Result of addition: " + result);
                break;
            case 2: // Subtract
                result = num1 - num2;
                System.out.println("Result of subtraction: " + result);
                break;
            case 3: // Multiply
                result = num1 * num2;
                System.out.println("Result of multiplication: " + result);
                break;
            case 4: // Divide
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result of division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5: // Modulo
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result of modulo: " + result);
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                }
                break;
            case 6: // Power
                result = Math.pow(num1, num2);
                System.out.println("Result of power: " + result);
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 6.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Operation completed successfully.");
        }

        scanner.close();
    }
}
