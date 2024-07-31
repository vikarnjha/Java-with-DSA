public class multiplyAndAssign {
    public static void main(String[] args) {
        // The expression z *= 4 is shorthand in Java for multiplying the variable z by 4 and updating z with the new value. It's equivalent to writing z = z * 4.

        int product = 5; // Initial value of product
        System.out.println("Initial product: " + product);
        
        product *= 6; // Multiply product by 6 and update product with the new value
        System.out.println("Updated product: " + product);
        
        // Output
        // Initial product: 5
        // Updated product: 30

    }
}
