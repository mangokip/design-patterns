
/**
 * The Hard State for the Arithemetic game, including +,-,*,/ and numbers 1-50
 *
 * @author Bryce Klein
 */
public class Hard implements State {

    private ArithemeticGame game;

    /**
     * Constructor for the state based off current game
     *
     * @param game - instance of arithemetic game
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * get method for numbers 1-50
     */
    public int getNum() {
        return (int) (Math.random() * 50) + 1;
    }

    /**
     * get method for deciding what operation to use based on random number
     */
    public Operation getOperation() {
        int randomValue = (int) (Math.random() * 4); // Generates 0, 1, 2, or 3
        if (randomValue == 0) {
            return Operation.DIVIDE;
        } else if (randomValue == 1) {
            return Operation.MULTIPLY;
        } else if (randomValue == 2) {
            return Operation.PLUS;
        }
        return Operation.MINUS;
    }

    public void increaseDifficulty() {
        System.out.println("You're rocking this!");
    }

    public void decreaseDifficulty() {
        System.out.println("Difficulty Decreased to: Medium");
    }

}
