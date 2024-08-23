/*
 * Written by Bryce Klein
 */
package strategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Attendees
 {
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    public Attendees(String title)
    {
        this.title = title;
        this.people = new ArrayList<>();
        this.searchBehavior = new LinearSearch();
    }

    public Person add(String firstName, String lastName, String phoneNumber, String reminder) 
    {
        Person attendee = new Person(firstName, lastName, phoneNumber, reminder);

        if (searchBehavior != null && searchBehavior.contains(people, attendee)) 
        { return null; }

        people.add(attendee);
        return attendee;
    }

    public String getTitle() 
    { return this.title; }

    public void setSearchBehavior(SearchBehavior searchBehavior) 
    { this.searchBehavior = searchBehavior; }

    public List<Person> getList() 
    {
        Collections.sort(people);
        return this.people;
    }
}
