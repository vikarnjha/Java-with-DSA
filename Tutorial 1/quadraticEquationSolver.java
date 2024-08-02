public class quadraticEquationSolver {
    public static void main(String[] args) {
        // Coefficients of the quadratic equation
        double a = 3;
        double b = 8;
        double c = 26;

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check if the discriminant is non-negative
        if (discriminant >= 0) {
            // Calculate the two roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Print the roots
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            // If the discriminant is negative, the roots are complex
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            // Print the complex roots
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
// Output
// Root 1: -1.3333333333333333 + 2.6246692913372702i
// Root 2: -1.3333333333333333 - 2.6246692913372702i
