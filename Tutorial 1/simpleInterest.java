
import java.util.Scanner;


public class simpleInterest {
    // Function to calculate simple interest

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal, rate, and time
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double interest = calculateSimpleInterest(principal, rate, time);

        // Print the result
        System.out.println("The simple interest is: " + interest);
        
        scanner.close();
    }
}
