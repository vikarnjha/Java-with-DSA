
import java.util.Scanner;

public class digitSumCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate and display the sum of the digits of each number
        for (int number : numbers) {
            int sum = sumOfDigits(number);
            System.out.println("Sum of digits of number " + number + " is: " + sum);
        }

        scanner.close();
    }

    // Method to calculate the sum of the digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
