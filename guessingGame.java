import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
    // Generate a random number from 0-100
        Random n = new Random();
        int randomNumb = n.nextInt(101);
        int guess;
        int nGuesses = 0;

    // Ask the user to guess a number from 0 to 100
    System.out.println("Guess a number between 0 and 100:");

    // Get the first guess using scan.nextInt();
    guess = scan.nextInt();
    nGuesses++;

        // Loop while the guess does not equal the random number,
        while (guess != randomNumb)
        {
            // If the guess is less than the random number, print out "Too low!"
            if (guess < randomNumb)
            {
                System.out.println("Too low!");
            }
            // If the guess is greater than the random number, print out "Too high!"
            else {
                System.out.println("Too high!");
            }
            // Get a new guess (save it into the same variable)
                System.out.print("Please guess again: ");
                guess = scan.nextInt();
                nGuesses++;
        }
        // Print out something like "You got it!"
        System.out.println("You got it!");
        System.out.println("Total guesses: " + nGuesses);
            if (nGuesses <= 7) 
            {
                System.out.println("you guessed in 7 or less times.");
            }
    }
}
