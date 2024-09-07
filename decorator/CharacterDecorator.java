/**
 * This class extends Character and is an abstract class
 * and is used as a decorator design pattern. It holds a basic constructor for the Decorator, and another method being
 * integrateDecor which will integrate provided decorations into the main character.
 *
 * @author Bryce Klein
 */


import java.util.ArrayList;

public abstract class CharacterDecorator extends Character {

    protected Character character;

    /**
     * Basic constructor for the decorator class calling a super invoke to pass
     * a character into the decorator
     *
     * @param character - this is the character that will be decorated
     */
    public CharacterDecorator(Character character) {
        super(new ArrayList<>(character.lines), character.getName());
        this.character = character;
    }

    /**
     * A void method that integrates the decorations onto the main pattern of
     * the character
     *
     * @param decor
     */
    protected void integrateDecor(ArrayList<String> decor) {
        // Copy the existing lines of the character to integrate the new decoration
        ArrayList<String> updatedLines = new ArrayList<>(lines);

        // Iterate over each line of the decoration
        for (int i = 0; i < decor.size(); i++) {
            // Ensure updatedLines has enough lines to accommodate the decoration
            while (updatedLines.size() <= i) {
                updatedLines.add("");
            }

            String existingLine = updatedLines.get(i);
            String decorLine = decor.get(i);

            // This is to ensure length differences do not mess up the format; ears.txt was having issues so this is a fixup.
            if (existingLine.length() < decorLine.length()) {
                existingLine = String.format("%-" + decorLine.length() + "s", existingLine);
            }

            // Initialized empty line 
            String mergedLine = "";

            // Iterates through existing line in order to see and compare characters.
            for (int j = 0; j < existingLine.length(); j++) {
                char existingChar = existingLine.charAt(j);
                char decorChar = (j < decorLine.length()) ? decorLine.charAt(j) : ' ';

                // Overlay the decor character only if it's not a space, otherwise keep the existing character
                mergedLine += (decorChar != ' ') ? decorChar : existingChar;
            }
            updatedLines.set(i, mergedLine);
        }

        lines.clear();
        lines.addAll(updatedLines);
    }

}
