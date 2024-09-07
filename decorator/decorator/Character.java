/**
 * This class is for the construction of a Character object, utilizing the parameters "lines" and "name". It also
 * has a toString method for displaying the character.
 *
 * @author Bryce Klein
 */
package decorator;

import java.util.ArrayList;

public class Character {

    private String name;
    protected static ArrayList<String> lines;

    /**
     * Basic Constructor for the Character object
     *
     * @param lines - utilized in other classes as a super invoke to create an
     * ArrayList<String> of lines from a provided .txt file
     * @param name - name of the character being created, in this case, a
     * Potatoe Head
     */
    public Character(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * toString implementation to be utilized in driver class and print out each
     * line as a result variable
     */
    public String toString() {
        String result = "----- " + name + " -----\n";
        for (String line : lines) {
            result += line + "\n";
        }
        return result;
    }

}
