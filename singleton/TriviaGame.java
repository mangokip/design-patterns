/**
 * This class creates a single TriviaGame instance to be used as the base game.
 *
 * @author Bryce Klein
 */
package singleton;

import java.util.ArrayList;
import java.util.Random;

public class TriviaGame {

    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;

    /**
     * Private constructor to be utilized with getInstance. The questions are
     * loaded from the file, and a random number object is created to randomize
     * questions.
     */
    private TriviaGame() {
        this.questions = DataLoader.getTriviaQuestions();
        this.rand = new Random();
    }

    /**
     * This grabs the single instance of Trivia Game so that it can be
     * interacted with
     *
     * @return TriviaGame object that is grabbed, and is created if null
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * A less than standard getter, where a Question object is created by
     * utilizing a random index value to completely randomize the question pool.
     *
     * @return - Question object based off randomQuestion variable.
     */
    public Question getQuestion() {
        if (questions.isEmpty()) {
            return null;
        }
        int index = rand.nextInt(questions.size());
        Question randomQuestion = questions.get(index);

        // Remove the question after it's been returned
        questions.remove(index);

        return randomQuestion;  // Return the question and immediately remove it
    }

    /**
     * Boolean check to see if ArrayList<Question> questions has more questions
     * available
     *
     * @return - boolean on whether or not the list is empty.
     */
    public boolean hasMoreQuestions() {
        if (questions.isEmpty()) {
            return false;

        }
        return true;
    }

    /**
     * Checks if questions are still present, then adds to numGames and score
     */
    public void winRound() {
        if (!hasMoreQuestions()) {
            System.out.println("--- CRITICAL: OUT OF QUESTIONS! Please Quit now to see your score or forever hold your peace.");
        }
        numGames++;
        score++;

    }

    /**
     * Checks if questions are still present, and then only adds to numGames
     */
    public void loseRound() {
        if (!hasMoreQuestions()) {
            System.out.println("--- CRITICAL: OUT OF QUESTIONS! Please Quit now to see your score or forever hold your peace.");
        }
        numGames++;

    }

    public String getScores() {
        return "You scored " + String.valueOf(score) + "/" + String.valueOf(numGames);
    }

}
