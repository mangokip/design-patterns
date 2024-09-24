package state;

/**
 * Question Class that creates a randomized question for the game
 *
 * @author Bryce Klein
 */
public class Question {

    private String question;
    private int answer;

    /**
     * Basic constructor creating a randomized question
     *
     * @param num1 - randomly chosen int based on state's getNum method
     * @param num2 - randomly chosen 2nd int based on state's getNum method
     * @param operation - randomly chosen operation ENUM from state's
     * getOperation method
     */
    public Question(int num1, int num2, Operation operation) {
        this.question = String.valueOf(num1) + operation.label + String.valueOf(num2);
        switch (operation) {
            case PLUS:
                this.answer = num1 + num2;
                break;
            case MINUS:
                this.answer = num1 - num2;
                break;
            case MULTIPLY:
                this.answer = num1 * num2;
                break;
            case DIVIDE:
                this.answer = num1 / num2;
                break;
        }

    }

    public String toString() {
        return this.question;
    }

    public int getAnswer() {
        return this.answer;
    }

    public boolean isCorrect(int answer) {
        return this.answer == answer;
    }

}
