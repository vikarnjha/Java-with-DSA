public class subAndAssign {

    public static void main(String[] args) {
        // What does y -= 2 mean?
        // In Java, the statement y -= 2; is a shorthand assignment operator that subtracts 2 from the current value of the variable y and then updates y with the new value.

        int total = 20; // Initial value of total
        System.out.println("Initial total: " + total);

        total -= 7; // Subtract 7 from total and update total with the new value
        System.out.println("Updated total: " + total);
        // Output
        // Initial total: 20
        // Updated total: 13

    }
}
