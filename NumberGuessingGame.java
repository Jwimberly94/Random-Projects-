import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Set up input and random number generator
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        int guessCount = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I'm thinking of a number between 1 and 100.");

        // Main guessing loop
        do {
            System.out.print("Enter your guess: ");
            
            // Check if input is an integer
            while (!input.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                input.next(); // discard invalid input
            }

            guess = input.nextInt();
            guessCount++;

            if (guess > secretNumber) {
                System.out.println("Too high!\n");
            } else if (guess < secretNumber) {
                System.out.println("Too low!\n");
            } else {
                System.out.println("Correct! You guessed it in " + guessCount + " tries.");
            }

        } while (guess != secretNumber);

        input.close();
    }
}