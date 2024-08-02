
import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);

        // Print the result
        System.out.println("The area of the circle is: " + area);
        
        scanner.close();
    }
}
