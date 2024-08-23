/**
 * Basic interface with contains method for Binary/Linear search classes
 *
 * @author Bryce Klein
 */
package strategy;

import java.util.List;

public interface SearchBehavior {

    /**
     *
     * @param people
     * @param person
     * @return boolean
     */
    public boolean contains(List<Person> people, Person person);
}
