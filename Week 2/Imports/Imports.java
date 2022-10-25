import java.util.Scanner;

public class Imports {
    public static void main(String[] args) {
        System.out.println("WIP");
        int guesses = 5;
        int nextGuess;
        int randomNumber = (int)(Math.random() * 100) + 1;
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Guess a number: ");
            nextGuess = input.nextInt();

            if (nextGuess == randomNumber) {
                System.out.println("You guessed the number");
            } else if (nextGuess > randomNumber) {
                System.out.println("Too high!");
            } else if (nextGuess < randomNumber) {
                System.out.println("Too low!");
            }
            if (guesses == 0) {
                System.out.println("You lose!");
                break;
            }
            guesses--;
        }

        input.close();
    }
}