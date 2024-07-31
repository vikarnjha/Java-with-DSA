public class incrementOperator {
    public static void main(String[] args) {
        // The x++ and ++x are both increment operators, but they have different behaviors:

        // x++ is the post-increment operator. It increments the value of x after its current value has been used in the expression.
        // ++x is the pre-increment operator. It increments the value of x before its current value is used in the expression.

        int x = 5;

        // Post-increment example
        int y = x++; // y is assigned the value of x before x is incremented
        System.out.println("After post-increment:");
        System.out.println("x: " + x); // x is now 6
        System.out.println("y: " + y); // y is 5

        // Reset x for pre-increment example
        x = 5;

        // Pre-increment example
        int z = ++x; // x is incremented before z is assigned the value of x
        System.out.println("After pre-increment:");
        System.out.println("x: " + x); // x is now 6
        System.out.println("z: " + z); // z is 6
    }
}
// Output
// After post-increment:
// x: 6
// y: 5
// After pre-increment:
// x: 6
// z: 6