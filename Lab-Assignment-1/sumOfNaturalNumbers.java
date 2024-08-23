import java.util.Scanner;

public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer n
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Initialize sum and counter variables
        int sum = 0;
        int i = 1;

        // Use a while loop to calculate the sum of all natural numbers from 1 to n
        while (i <= n) {
            sum += i; // Add i to sum
            i++;      // Increment i
        }

        // Display the sum to the user
        System.out.println("The sum of natural numbers up to " + n + " is: " + sum);

        // Close the scanner
        scanner.close();
    }

}