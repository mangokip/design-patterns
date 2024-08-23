/**
 * Linear Search class for List
 *
 * @author Bryce Klein
 */
package strategy;

import java.util.List;

public class LinearSearch implements SearchBehavior {

    /**
     * contains searches through list in linear fashion for pre-existing list
     * members
     *
     * @return boolean in regards to presence of duplicates
     */
    public boolean contains(List<Person> people, Person person) {
        for (Person currentPerson : people) {
            if (currentPerson.getFirstName().equalsIgnoreCase(person.getFirstName())
                    && currentPerson.getLastName().equalsIgnoreCase(person.getLastName())) {
                return true;
            }
        }

        return false; //If no duplicate is found
    }
}
