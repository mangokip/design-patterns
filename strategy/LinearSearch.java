/*
 * Written by Bryce Klein
 */
package strategy;
import java.util.List;

public class LinearSearch implements SearchBehavior
 {

    public boolean contains(List<Person> people, Person person) 
    {
        for (Person currentPerson : people) 
        {
            if (currentPerson.getFirstName().equalsIgnoreCase(person.getFirstName()) &&
                currentPerson.getLastName().equalsIgnoreCase(person.getLastName())) 
            { return true; }
        }

        return false;
    }
}
