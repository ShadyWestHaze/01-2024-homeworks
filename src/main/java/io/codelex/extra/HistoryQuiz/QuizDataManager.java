package io.codelex.extra.HistoryQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.util.*;

public class QuizDataManager {
    private static final String API_URL_FORMAT = "http://numbersapi.com/%d/year?fragment";

    public static List<Question> getQuestions(int startYear) {
        int currentYear = LocalDate.now().getYear();
        List<Question> questions = new ArrayList<>();

        for (int year = startYear; year <= currentYear; year++) {
            String questionText = getQuestionText(year);
            if (!questionText.toLowerCase().contains("will") && !questionText.toLowerCase().contains("expected")) {//expires scheduled
                int correctAnswer = year;
                List<Integer> options = getAnswers(correctAnswer);

                Question question = new Question(questionText, options, correctAnswer);
                questions.add(question);
            } else {
                year--;
            }
        }
        Collections.shuffle(questions);
        return questions;
    }

    private static String getQuestionText(int year) {
        try {
            URL url = new URL(String.format(API_URL_FORMAT, year));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();//is to was has to had are to were  Nothing remarkable happened in what year?
            connection.setRequestMethod("GET");
            StringBuilder response = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
            }
            connection.disconnect();
            String text = response.toString();
            if (!text.isEmpty()) {
                return Character.toUpperCase(text.charAt(0)) + text.substring(1);
            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<Integer> getAnswers(int correctAnswer) {
        List<Integer> options = new ArrayList<>();
        options.add(correctAnswer);
        Set<Integer> usedOptions = new HashSet<>();
        usedOptions.add(correctAnswer);

        Random random = new Random();
        while (options.size() < 3) {
            int randomOffset = random.nextInt(11) - 5;
            int randomOption = correctAnswer + randomOffset;
            if (!usedOptions.contains(randomOption)) {
                options.add(randomOption);
                usedOptions.add(randomOption);
            }
        }

        Collections.shuffle(options);
        return options;
    }
}
