public class decrementoperator {
    public static void main(String[] args) {
        // The x-- and --x are both decrement operators, but they have different behaviors:

        // x-- is the post-decrement operator. It decrements the value of x after its current value has been used in the expression.
        // --x is the pre-decrement operator. It decrements the value of x before its current value is used in the expression.

        int x = 5;

        // Post-decrement example
        int y = x--; // y is assigned the value of x before x is decremented
        System.out.println("After post-decrement:");
        System.out.println("x: " + x); // x is now 4
        System.out.println("y: " + y); // y is 5

        // Reset x for pre-decrement example
        x = 5;

        // Pre-decrement example
        int z = --x; // x is decremented before z is assigned the value of x
        System.out.println("After pre-decrement:");
        System.out.println("x: " + x); // x is now 4
        System.out.println("z: " + z); // z is 4
    }
}
