package io.codelex.extra.TriviaQuiz;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class TriviaDataManager {
    private static final String API_URL = "http://numbersapi.com/random/trivia?json";

    public static List<Question> getQuestions() throws TriviaDataFetchException, TriviaDataParsingException {
        List<Question> questions = new ArrayList<>();
        for (int q = 1; q <= 20; ) {
            Question question = getFromApi();
            if (question.isFound()) {
                questions.add(question);
                q++;
            }
        }
        Collections.shuffle(questions);
        return questions;
    }

    private static Question getFromApi() throws TriviaDataFetchException, TriviaDataParsingException {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            StringBuilder response = new StringBuilder();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
            }
            connection.disconnect();

            try {
                JSONObject obj = new JSONObject(response.toString());
                Boolean found = obj.getBoolean("found");
                int number = obj.getInt("number");
                String text = obj.getString("text");
                String[] textSplit = text.split(" ", 2);

                if (textSplit.length > 1) {
                    text = textSplit[1].charAt(0) + textSplit[1].substring(1);
                }
                if (text.lastIndexOf(".") != -1) {
                    text = text.substring(0, text.lastIndexOf(".")) + "?" + text.substring(text.lastIndexOf(".") + 1);
                }

                List<Integer> options = getAnswers(number);
                return new Question(text, options, number, found);
            } catch (JSONException e) {
                throw new TriviaDataParsingException("Error while parsing the trivia data from API.", e);
            }

        } catch (IOException e) {
            throw new TriviaDataFetchException("Error while fetching the trivia data from API.", e);
        }
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