package state;

/**
 * The Easy State for the Arithemetic game, including + and - and numbers 1-10
 *
 * @author Bryce Klein
 */
public class Easy implements State {

    private ArithemeticGame game;

    /**
     * Constructor for the state based off current game
     *
     * @param game - instance of arithemetic game
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * get method for random number 1-10
     */
    public int getNum() {
        return (int) (Math.random() * 10) + 1;
    }

    /**
     * get method for deciding what operation to use based on random number
     */
    public Operation getOperation() {
        int randomValue = (int) (Math.random() * 2); // Generates 0, 1, or 2
        if (randomValue == 0) {
            return Operation.PLUS;
        }
        return Operation.MINUS;

    }

    /**
     * Increases difficulty and prints this message
     */
    public void increaseDifficulty() {
        System.out.println("Difficulty Increased to: Medium");
    }

    /**
     * Decreases difficulty and prints this message
     */
    public void decreaseDifficulty() {
        System.out.println("Try harder!!!");
    }

}
