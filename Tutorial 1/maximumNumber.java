
import java.util.Scanner;

public class maximumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 3 numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the maximum number
        int max = findMax(num1, num2, num3);

        // Print the result
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }

    // Method to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        int max = a; // Assume a is the largest to start
        if (b > max) {
            max = b; // Update max if b is larger
        }
        if (c > max) {
            max = c; // Update max if c is larger
        }
        return max;
    }   
}
