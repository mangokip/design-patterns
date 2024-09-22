/**
 * This class creates a Question utilizing the questions.txt file pulled from the DataLoader.
 *
 * @author Bryce Klein
 */
package singleton;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {

    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;

    /**
     * This is a basic constructor, with answers being converted into an
     * ArrayList for dynamic editing.
     *
     * @param question - question prompt from file
     * @param correctAnswer - correct answer as an index
     * @param answers - an array of answers that is converted into an ArrayList
     */
    public Question(String question, int correctAnswer, String[] answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<>(Arrays.asList(answers));
    }

    public String toString() {
        return question + "\n" + "1. " + answers.get(0) + "\n" + "2. " + answers.get(1) + "\n" + "3. " + answers.get(2) + "\n" + "4. " + answers.get(3);
    }

    /**
     * Basic boolean check on correctness of answer
     *
     * @param userAnswer - users answer which should be a standard int
     * @return
     */
    public boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer + 1; //+1 to ensure user answer is based off display and not actual indices
    }

    public String getCorrectAnswer() {
        return String.valueOf(correctAnswer + 1);
    }

}
