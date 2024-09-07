
/**
 * This is a class that extends CharacterDecorator to create a Hat decoration.
 *
 * @author Bryce Klein
 */

import java.util.ArrayList;

public class Hat extends CharacterDecorator {

    /**
     * Basic constructor that supers the character, creates an ArrayList out of
     * the .txt lines, and integrates them with the given variable.
     *
     * @param character - the character who will receive this integration
     */
    public Hat(Character character) {
        super(character);
        ArrayList<String> hatLines = FileReader.getLines("hat.txt");
        integrateDecor(hatLines);

    }

}
