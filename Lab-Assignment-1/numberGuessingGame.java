import java.util.*;

public class numberGuessingGame {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object to generate random numbers
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        
        int userGuess = 0;
        int attempts = 0;

        // Start the game
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Can you guess what it is?");
        
        // Use a do-while loop to keep asking the user for a guess until they get it right
        do {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++; // Increment the number of attempts

            // Check if the guess is too low, too high, or correct
            if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        } while (userGuess != numberToGuess);

        // Close the scanner
        scanner.close();
    }
}
