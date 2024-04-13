package src.main.java.io.codelex.loops.practice;

import java.util.Scanner;

public class WordsAndDottedLine {
    public static void main(String[] args) {

        String firstWord;
        String secondWord;
        StringBuilder dotString = new StringBuilder();
        int firstCharAmount, secondCharAmount;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first word:");
        firstWord = userInput.next();
        System.out.println("Enter second word:");
        secondWord = userInput.next();

        firstCharAmount = firstWord.length();
        secondCharAmount = secondWord.length();


        dotString.append(".".repeat(Math.max(0, 30 - (firstCharAmount + secondCharAmount))));
        System.out.println(firstWord + dotString + secondWord);
        System.out.printf("Total char amount: %d", firstWord.length() + dotString.length() + secondWord.length());
    }
}
