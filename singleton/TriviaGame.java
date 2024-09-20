package singleton;

import java.util.ArrayList;
import java.util.Random;

public class TriviaGame {

    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;

    private TriviaGame() {
        this.questions = DataLoader.getTriviaQuestions();
        this.rand = new Random();
    }

    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    public Question getQuestion() {
        if (questions.isEmpty()) {
            return null;
        }
        int index = rand.nextInt(questions.size());
        Question randomQuestion = questions.get(index);
        questions.remove(index);
        return randomQuestion;

    }

    public boolean hasMoreQuestions() {
        if (questions.isEmpty()) {
            System.out.println("--- CRITICAL: OUT OF QUESTIONS! Please Quit now to see your score or forever hold your peace.");
            return false;

        }
        return true;
    }

    public void winRound() {
        if (hasMoreQuestions()) {  // Only count if there are more questions
            numGames++;
            score++;
        }
    }

    public void loseRound() {
        if (hasMoreQuestions()) {  // Only count if there are more questions
            numGames++;
        }
    }

    public String getScores() {
        return "You scored " + String.valueOf(score) + "/" + String.valueOf(numGames);
    }

}
