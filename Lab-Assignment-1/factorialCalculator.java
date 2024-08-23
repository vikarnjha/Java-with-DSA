import java.util.Scanner;

public class factorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Initialize the factorial result to 1
        long factorial = 1;

        // Use a for loop to calculate the factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display the result to the user
        System.out.println("The factorial of " + number + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }
}
