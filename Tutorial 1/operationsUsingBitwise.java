
import java.util.Scanner;

public class operationsUsingBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values X and Y
        System.out.print("Enter value for X: ");
        int X = scanner.nextInt();
        System.out.print("Enter value for Y: ");
        int Y = scanner.nextInt();

        // Perform bitwise operations
        int andResult = X & Y;
        int orResult = X | Y;
        int xorResult = X ^ Y;
        int leftShiftX = X << 2;
        int rightShiftY = Y >> 2;
        int unsignedRightShiftY = Y >>> 2;

        // Print the results
        System.out.println("X & Y = " + andResult);
        System.out.println("X | Y = " + orResult);
        System.out.println("X ^ Y = " + xorResult);
        System.out.println("X << 2 = " + leftShiftX);
        System.out.println("Y >> 2 = " + rightShiftY);
        System.out.println("Y >>> 2 = " + unsignedRightShiftY);

        scanner.close();
    }
}
