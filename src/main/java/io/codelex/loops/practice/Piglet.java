package src.main.java.io.codelex.loops.practice;

import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int totalPoints = 0;
        String endGame;
        System.out.println("Welcome to Piglet!\nPress enter to roll the dice, type 'out' to end the game:");
        endGame = userInput.nextLine();

        while (!endGame.equalsIgnoreCase("out")) {
            int diceRoll = rollDice();
            if (diceRoll == 1) {
                totalPoints = 0;
                System.out.println("You rolled a 1! You lose your points for this round, but you can continue.");
            } else {
                totalPoints += diceRoll;
                System.out.println("You got " + diceRoll + " points.");
            }
            System.out.println("Total points: " + totalPoints);
            System.out.println("Press enter to roll again, or type 'out' to end the game:");
            endGame = userInput.nextLine();
        }
        System.out.println("Game Over. Your total points: " + totalPoints);
    }

    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}



