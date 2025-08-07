import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("2024503543 Risah Ruth R");
        final int SECRET_NUMBER = 45;
        final int MAX_TRIES = 10;
        Scanner sc = new Scanner(System.in);

        int totalGames = 0;
        int totalGuesses = 0;

        while (true) {
            System.out.println("\n--- Number Guessing Game ---");
            System.out.println("1. Play Game");
            System.out.println("2. View Status");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int attempts = 0;

                    System.out.println("\nGuess the number between 1 and 100.");
                    System.out.println("Enter -1 to quit the current game.");

         
                    for (int i = 1; i <= MAX_TRIES; i++) {
                        System.out.print("Attempt " + i + ": ");
                        int guess = sc.nextInt();

                        if (guess == -1) {
                            System.out.println("Game exited.");
                            break;
                        }

                        if (guess < 1 || guess > 100) {
                            System.out.println("Invalid guess. Must be between 1 and 100.");
                            i--; 
                            continue;
                        }

                        attempts++;

                        if (guess == SECRET_NUMBER) {
                            System.out.println("Correct! You guessed the number.");
                            break;
                        } else if (guess < SECRET_NUMBER) {
                            System.out.println("Too low.");
                        } else {
                            System.out.println("Too high.");
                        }
                    }

                    if (attempts > 0) {
                        totalGames++;
                        totalGuesses += attempts;
                    }
                    break;

                case 2:
                    System.out.println("\n--- Game Status ---");
                    if (totalGames == 0) {
                        System.out.println("No games played yet.");
                    } else {
                        double average = (double) totalGuesses / totalGames;
                        System.out.println("Total Games Played: " + totalGames);
                        System.out.println("Total Guesses Made: " + totalGuesses);
                        System.out.printf("Average Guesses per Game: %.2f\n", average);
                    }
                    break;

                case 3:
                    System.out.println("Thanks for playing!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
