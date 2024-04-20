package io.codelex.extra.TriviaQuiz;

import java.util.List;

public class Question {
    private final String text;
    private final List<Integer> options;
    private final int correctAnswer;
    private final boolean found;

    public Question(String text, List<Integer> options, int correctAnswer, boolean found) {
        this.text = text;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.found = found;
    }

    public String getText() {
        return "What " + text;
    }

    public List<Integer> getOptions() {
        return options;
    }

    public String getOptionString() {
        return "Choose one of the possible answer:\n" + getOptions().get(0) + "\n" + getOptions().get(1) + "\n" + getOptions().get(2);
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isFound() {
        return found;
    }

}