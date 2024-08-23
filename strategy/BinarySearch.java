/**
 * Binary Search Functionality for List
 *
 * @author Bryce Klein
 */
package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Creats ArrayList using list of people, sorts using Collections and binary
 * search implementation to compare people on List
 */
public class BinarySearch implements SearchBehavior {

    /**
     * @return boolean comparing if current List contains an already existing
     * person or someone who is not present
     */
    public boolean contains(List< Person> people, Person person) {
        List< Person> sortedPeople = new ArrayList<>(people);
        Collections.sort(sortedPeople);

        /*
         * Binary Logic
         */
        int left = 0;
        int right = sortedPeople.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            Person midPerson = sortedPeople.get(mid);

            int comparison = midPerson.compareTo(person);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false; //If no duplicate is found
    }
}
