
/**
 * This is a class that extends Character to create a PotatoeHead Character.
 *
 * @author Bryce Klein
 */
public class PotatoeHead extends Character {

    /**
     * This method supers the character class and creates an ArrayList of the
     * character's body lines plus its name
     *
     * @param name - the name of the PotatoeHead
     */
    public PotatoeHead(String name) {
        super(FileReader.getLines("txt\\potatoe-head.txt"), name);

    }
}
