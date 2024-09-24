package state;

/**
 * The Medium State for the Arithemetic game, including +,-,* and numbers 1-25
 *
 * @author Bryce Klein
 */
public class Medium implements State {

    private ArithemeticGame game;

    /**
     * Constructor for the state based off current game
     *
     * @param game - instance of arithemetic game
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * get method for numbers 1-25
     */
    public int getNum() {
        return (int) (Math.random() * 25) + 1;
    }

    /**
     * get method for deciding what operation to use based on random number
     */
    public Operation getOperation() {
        int randomValue = (int) (Math.random() * 3); // Generates 0, 1, or 2
        if (randomValue == 0) {
            return Operation.MULTIPLY;
        } else if (randomValue == 1) {
            return Operation.PLUS;
        }
        return Operation.MINUS;
    }

    public void increaseDifficulty() {

        System.out.println("Difficulty Increased to: Hard");
    }

    public void decreaseDifficulty() {

        System.out.println("Difficulty Decreased to: Easy");
    }

}
