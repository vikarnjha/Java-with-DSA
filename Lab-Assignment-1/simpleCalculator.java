import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to choose an operation
        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Variable to store the result
        double result;

        // Use switch statement to perform the chosen operation
        switch (operation) {
            case '+' -> {
                result = num1 + num2;
                System.out.println("The result is: " + result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println("The result is: " + result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println("The result is: " + result);
            }
            case '/' -> {
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            }
            default -> // Handle invalid operation
                System.out.println("Error: Invalid operation.");
        }

        // Close the scanner
        scanner.close();
    }
}
