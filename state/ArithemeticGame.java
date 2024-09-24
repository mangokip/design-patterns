package state;

/**
 * This class is the base for the Arithmetic Game overall and is utilized in the
 * driver to take advantage of multiple states that scale with the user's score.
 *
 * @author Bryce Klein
 */
public class ArithemeticGame {

    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    /**
     * A basic constructor with no parameters that calls an instance of each
     * difficulty state and sets the score/state to the default. (Def: Easy,
     * Score = 0)
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState; // Start with the easy state
        score = 0; // Score starts at 0
    }

    /**
     * More than a basic getter, this will create numbers and call an operation
     * based on the state of the game. After this, it creates a new Question
     * object.
     *
     * @return Question object containing two randomly generated numbers within
     * the difficulty span, and an operation of similar accord.
     */
    public Question getQuestion() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        Operation operation = state.getOperation();
        return new Question(num1, num2, operation);
    }

    /**
     * Increases score by 1
     */
    public void increaseScore() {
        score++;
        setState(state); // Check state transitions when the score changes
    }

    /**
     * Decreases score by 1
     */
    public void decreaseScore() {
        score--;
        setState(state); // Check state transitions when the score changes
    }

    /**
     * Setter that sets the state of difficulty based on the user's current
     * score. It scales by 3, 3 going to medium, 6 going to hard, and -3 and 9
     * corresponding to messages that tell the user that they're doing good or
     * bad.
     *
     * @param state - Difficulty of the game being Easy, Medium, or Hard
     */
    public void setState(State state) {
        // Check for specific score ranges and transition states or call message methods
        if (score == 3 && this.state == easyState) {
            this.state.increaseDifficulty();
            this.state = mediumState; // Transition to Medium
        } else if (score == 6 && this.state == mediumState) {
            this.state.increaseDifficulty();
            this.state = hardState; // Transition to Hard
        } else if (score == -3) {
            this.state.decreaseDifficulty();
        } else if (score < -3) {
            this.state.decreaseDifficulty();
            System.out.println("Your Score:" + score); //added so user knows what their score is once its at the lowest diff. so they have an idea of how much they have until getting past the Try Harder!!! 
        } else if (score == 9) {
            this.state.increaseDifficulty();
        } else if (score > 9) {
            this.state.increaseDifficulty();
            System.out.println("Your Score: " + score); //same as prev. explanation
        }

        // Functionality for when the user needs to fall back a level
        if (score < 6 && this.state == hardState) {
            this.state.decreaseDifficulty(); // Calls the message from the Hard class
            this.state = mediumState; // Transition back to Medium
        } else if (score < 3 && this.state == mediumState) {
            this.state.decreaseDifficulty(); // Calls the message from the Medium class
            this.state = easyState; // Transition back to Easy
        }
    }

    public State getEasyState() {
        return easyState;
    }

    public State getMediumState() {
        return mediumState;
    }

    public State getHardState() {
        return hardState;
    }
}
