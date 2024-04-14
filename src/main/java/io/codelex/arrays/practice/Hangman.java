package src.main.java.io.codelex.arrays.practice;

import java.util.Scanner;
import java.util.Random;

public class Hangman {
    private static final String[] words = {"hangman", "computer", "java", "programming", "codelex"};
    private static final Random random = new Random();
    private static String word = words[random.nextInt(words.length)];
    private static char[] wordToGuess = new char[word.length()];
    private static boolean[] guessedLetters = new boolean[26];
    private static int attemptsLeft = 6;

    public static void main(String[] args) {
        initializeWordToGuess();

        Scanner scanner = new Scanner(System.in);

        while (attemptsLeft > 0 && !isWordGuessed()) {
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Word: " + String.valueOf(wordToGuess));
            System.out.print("Misses: ");
            displayMisses();
            System.out.print("\nGuess(" + attemptsLeft + " attempts left):");
            char guess = scanner.next().toLowerCase().charAt(0);
           
            if (guessedLetters[guess - 'a']) {
                System.out.println("You've already guessed that letter.");
                continue;
            }
            guessedLetters[guess - 'a'] = true;
            if (!checkGuess(guess)) {
                attemptsLeft--;
            }

        }

        if (isWordGuessed()) {
            System.out.println("\nYOU GOT IT! The word was: " + word);
        } else {
            System.out.println("\nSorry, you've run out of attempts. The word was: " + word);
        }

        System.out.print("\nPlay \"again\" or \"quit\"? ");
        String choice = scanner.next().toLowerCase();
        if (choice.equals("again")) {
            resetGame();
            main(args);
        }

    }

    private static void initializeWordToGuess() {
        for (int i = 0; i < word.length(); i++) {
            wordToGuess[i] = '_';
        }
    }

    private static boolean isWordGuessed() {
        for (char c : wordToGuess) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }


    private static void displayMisses() {
        for (int i = 0; i < guessedLetters.length; i++) {
            if (guessedLetters[i] && word.indexOf((char) (i + 'a')) == -1) {
                System.out.print((char) (i + 'a') + " ");
            }
        }
    }

    private static boolean checkGuess(char guess) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                wordToGuess[i] = guess;
                found = true;
            }
        }
        return found;
    }

    private static void resetGame() {
        word = words[random.nextInt(words.length)];
        wordToGuess = new char[word.length()];
        guessedLetters = new boolean[26];
        attemptsLeft = 6;
        initializeWordToGuess();
    }
}
