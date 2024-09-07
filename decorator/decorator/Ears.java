/**
 * This is a class that extends CharacterDecorator to create an Ear decoration.
 *
 * @author Bryce Klein
 */
package decorator;

import decorator.Character;
import java.util.ArrayList;

public class Ears extends CharacterDecorator {

    /**
     * Basic constructor that supers the character, creates an ArrayList out of
     * the .txt lines, and integrates them with the given variable.
     *
     * @param character - the character who will receive this integration
     */
    public Ears(Character character) {
        super(character);
        ArrayList<String> earsLines = FileReader.getLines("decorator\\ears.txt");
        integrateDecor(earsLines);

    }

}
