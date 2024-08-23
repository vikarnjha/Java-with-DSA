import java.util.Scanner;

public class primeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Assume the number is prime until proven otherwise
        boolean isPrime = true;

        // Handle edge cases
        if (number <= 1) {
            isPrime = false;
        } else {
            // Use a for loop to check divisibility from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // If divisible, it's not a prime number
                    break;
                }
            }
        }

        // Use an if-else statement to display whether the number is prime or not
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }
}
