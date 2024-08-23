/*
 * Written by Bryce Klein
 */
package strategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch implements SearchBehavior
{
    public boolean contains(List<Person> people, Person person) 
    {
        List<Person> sortedPeople = new ArrayList<>(people);
        Collections.sort(sortedPeople);

        int left = 0;
        int right = sortedPeople.size() - 1;

        while (left <= right) 
        {
            int mid = (left + right) / 2;
            Person midPerson = sortedPeople.get(mid);

            int comparison = midPerson.compareTo(person);

            if (comparison == 0) 
            { return true; } 

            else if (comparison < 0) 
            { left = mid + 1; } 
            
            else 
            { right = mid - 1; }
        }

        return false;
    }
}
