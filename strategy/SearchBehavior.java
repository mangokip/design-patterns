/*
 * Written by Bryce Klein
 */
package strategy;
import java.util.List;

public interface SearchBehavior 
{
    public boolean contains(List<Person> people, Person person);
}
