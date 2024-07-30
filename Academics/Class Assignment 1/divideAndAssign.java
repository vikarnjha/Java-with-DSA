public class divideAndAssign {
    public static void main(String[] args) {
        // The expression w /= 2 is shorthand in Java for dividing the variable w by 2 and updating w with the new value. It's equivalent to writing w = w / 2.

        int score = 100; // Initial value of score
        System.out.println("Initial score: " + score);
        
        score /= 10; // Divide score by 10 and update score with the new value
        System.out.println("Updated score: " + score);

        // Output
        // Initial score: 100
        // Updated score: 10

    }    
}
