package main.java.org.example.chapter6;


import java.security.SecureRandom;
import java.util.Scanner;

/*
Create a random number generator object
Prompt user to guess number
Input user response
If userResponse is < RandomNumber
    Display Too Low. Try Again
If userResponse is > RandomNumber
    Display Too High Try Again
Prompt user for next Guess
if userResponse = randomNumber

Prompt user to play Game again
Input userResponse
While userResponse is Play Again
    Prompt user to guess number
    Input user response
    If userResponse is < RandomNumber
        Display Too Low. Try Again
    If userResponse is > RandomNumber
        Display Too High Try Again
    Prompt user for next Guess
if userResponse = randomNumber
 */
public class GuessTheNumberModification {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();

        int randomGuess = 1 + randomNumber.nextInt(1000);
        Scanner input = new Scanner(System.in);
        int countTrials=0;

        System.out.print("Guess the Number\nGuess a number between 1 and 1000: ");
        int number = input.nextInt();
        do {
            if (number < randomGuess){
                System.out.println("Too low. Try again.");
                ++countTrials;
            }
            if (number > randomGuess) {
                System.out.println("Too high.Try again.");
                ++countTrials;
            }
            System.out.print("Next guess: ");
            number = input.nextInt();
            if (number == randomGuess)
                System.out.println("Congratulations. You guessed the number.");
        } while (number != randomGuess);

        if (countTrials <=10)
            System.out.println("Either you know the secret\n" +
                    "or you got lucky!");
        if (countTrials ==10)
            System.out.println("Aha! You know the secret!");
        if (countTrials > 10)
            System.out.println("You should be able to do better!");

        System.out.println("Enter 'play again' to play Guess the Number again or 'end game' to end.");
        String choice = input.nextLine();
        String playAgain = "playAgain";
        String endGame = "endGame";

        while (choice.equals(playAgain)){
            randomGuess = 1 + randomNumber.nextInt(1000);
            System.out.print("Guess the Number\nGuess a number between 1 and 1000: ");
            number = input.nextInt();
            do {
                if (number < randomGuess)
                    System.out.println("Too low. Try again.");
                if (number > randomGuess)
                    System.out.println("Too high.Try again.");
                System.out.print("Next guess: ");
                number = input.nextInt();
                if (number == randomGuess)
                    System.out.println("Congratulations. You guessed the number.");

            } while (number != randomGuess);
            if (countTrials <=10)
                System.out.println("Either you know the secret\n" +
                        "or you got lucky!");
            if (countTrials ==10)
                System.out.println("Aha! You know the secret!");
            if (countTrials > 10)
                System.out.println("You should be able to do better!");
            System.out.println("Enter 'play again' to play Guess the Number again or 'end game' to end.");
            choice = input.nextLine();

        }
        if (choice.equals(endGame))
            System.out.println("Game End");
    }
}