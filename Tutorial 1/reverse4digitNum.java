
import java.util.Scanner;

public class reverse4digitNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a 4-digit number
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        // Check if the entered number is a 4-digit number
        if (number >= 1000 && number <= 9999) {
            // Reverse the number
            int reversedNumber = reverseNumber(number);

            // Print the reversed number
            System.out.println("The reversed number is: " + reversedNumber);
        } else {
            System.out.println("Please enter a valid 4-digit number.");
        }

        scanner.close();
    }

    // Function to reverse a 4-digit number
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

}
