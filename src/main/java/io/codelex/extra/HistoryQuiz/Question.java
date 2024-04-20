package io.codelex.extra.HistoryQuiz;

import java.util.List;

public class Question {
    private final String questionText;
    private final List<Integer> options;
    private final int correctAnswer;


    public Question(String questionText, List<Integer> options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText + " in what year?";
    }

    public List<Integer> getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }


}
