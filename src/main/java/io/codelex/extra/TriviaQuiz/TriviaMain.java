package io.codelex.extra.TriviaQuiz;

import java.util.List;
import java.util.Scanner;

public class TriviaMain {
    public static void main(String[] args) throws InvalidInputException, TriviaDataParsingException, TriviaDataFetchException {
        List<Question> questions = TriviaDataManager.getQuestions();
        int score = 0;
        Question lastCorrectQuestion = null;
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println("\n" + question.getText());
            System.out.println("\n" + question.getOptionString());
            if (!scanner.hasNextInt()) {
                throw new InvalidInputException("Invalid input! Please enter a number.");
            }
            int userAnswer = scanner.nextInt();

            if (question.getCorrectAnswer() == userAnswer) {
                score++;
                lastCorrectQuestion = question;
            } else {
                System.out.println("Game Over! Your score is: " + score);
                if (lastCorrectQuestion != null) {
                    System.out.println("The last correctly answered question: "
                            + lastCorrectQuestion.getText()
                            + "\nYou answered: "
                            + lastCorrectQuestion.getCorrectAnswer());
                }
                return;
            }
        }
        System.out.println("Congrats you win. Your score is: " + score);
    }
}