package io.codelex.extra.HistoryQuiz;

import java.util.List;
import java.util.Scanner;

public class QuizMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting year: ");
        int startYear = scanner.nextInt();
        int totalPoints = 0;
        List<Question> questions = QuizDataManager.getQuestions(startYear);

        for (Question question : questions) {
            System.out.println("\n" + question.getQuestionText());
            List<Integer> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }
            System.out.println("Enter your answer (1, 2, or 3): ");

            int userAnswer = scanner.nextInt();

            int correctAnswerIndex = options.indexOf(question.getCorrectAnswer());
            if (userAnswer == correctAnswerIndex + 1) {
                totalPoints++;
                System.out.println("Correct! The answer is: " + question.getCorrectAnswer());
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.getCorrectAnswer());
            }
        }
        System.out.println("Total points: " + totalPoints + "/" + questions.size());


        scanner.close();
    }
}
