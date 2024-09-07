/**
 * This is a class that extends CharacterDecorator to create a Mouth decoration.
 *
 * @author Bryce Klein
 */
package decorator;

import decorator.Character;
import java.util.ArrayList;

public class Mouth extends CharacterDecorator {

    /**
     * Basic constructor that supers the character, creates an ArrayList out of
     * the .txt lines, and integrates them with the given variable.
     *
     * @param character - the character who will receive this integration
     */
    public Mouth(Character character) {
        super(character);
        ArrayList<String> mouthLines = FileReader.getLines("decorator\\mouth.txt");
        integrateDecor(mouthLines);
    }

}
