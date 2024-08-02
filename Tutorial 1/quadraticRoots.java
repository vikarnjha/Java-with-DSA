
import java.util.Scanner;

public class quadraticRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Determine the number of roots based on the discriminant
        if (discriminant > 0) {
            System.out.println("The quadratic equation has two distinct real roots.");
        } else if (discriminant == 0) {
            System.out.println("The quadratic equation has one real root.");
        } else {
            System.out.println("The quadratic equation has no real roots.");
        }

        scanner.close();
    }
}
