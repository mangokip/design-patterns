package singleton;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {

    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;

    public Question(String question, int correctAnswer, String[] answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<>(Arrays.asList(answers));
    }

    public String toString() {
        return question + "\n" + "1. " + answers.get(0) + "\n" + "2. " + answers.get(1) + "\n" + "3. " + answers.get(2) + "\n" + "4. " + answers.get(3);
    }

    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer + 1;
    }

    public String getCorrectAnswer() {
        return String.valueOf(correctAnswer + 1);
    }

}
