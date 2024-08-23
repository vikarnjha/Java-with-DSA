public class continueBreakExample {
    public static void main(String[] args) {
        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Use continue to skip printing the number 5
            if (i == 5) {
                continue;
            }

            // Use break to exit the loop when the number 8 is reached
            if (i == 8) {
                break;
            }

            // Print the current number
            System.out.println(i);
        }
    }
}
