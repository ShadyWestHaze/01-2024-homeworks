package src.main.java.io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalGames = 0;
        int computerWins = 0;
        int playerWins = 0;

        System.out.println("Let us begin...\nScissor-Paper-Stone");

        while (true) {
            System.out.print("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("q")) {
                break;
            }

            Move playerMove;
            switch (input) {
                case "s":
                    playerMove = Move.SCISSOR;
                    break;
                case "p":
                    playerMove = Move.PAPER;
                    break;
                case "t":
                    playerMove = Move.STONE;
                    break;
                default:
                    System.out.println("Invalid input, try again...");
                    continue;
            }

            Move computerMove = Move.values()[random.nextInt(3)];

            System.out.println("My turn: " + computerMove);

            if (playerMove == computerMove) {
                System.out.println("Tie!");
            } else if ((playerMove == Move.SCISSOR && computerMove == Move.PAPER) ||
                    (playerMove == Move.PAPER && computerMove == Move.STONE) ||
                    (playerMove == Move.STONE && computerMove == Move.SCISSOR)) {
                System.out.println("You won!");
                playerWins++;
            } else {
                System.out.println("I won!");
                computerWins++;
            }

            totalGames++;
        }

        double playerWinPercentage = (double) playerWins / totalGames * 100;
        double computerWinPercentage = (double) computerWins / totalGames * 100;

        System.out.println("\nNumber of trials: " + totalGames);
        System.out.printf("I won %d(%.2f%%). You won %d(%.2f%%).\n", computerWins, computerWinPercentage, playerWins, playerWinPercentage);
        System.out.println("Bye!");
    }
}
