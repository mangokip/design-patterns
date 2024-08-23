/**
 * Attendees class that is comprised of attributes specific to people present on attendee list
 * Functionality present to create attendees, make additions if no duplicates, and getters for title, behavior,
 * and lists.
 *
 * @author Bryce Klein
 */
package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Attendees {

    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    /**
     *
     * @param title Title of attendee Creation of ArrayList with people object
     * Initialized searchBehavior to LinearSearch to start
     */
    public Attendees(String title) {
        this.title = title;
        this.people = new ArrayList<>();
        this.searchBehavior = new LinearSearch();
    }

    /**
     *
     * @param firstName Attendee's first name
     * @param lastName Attendee's last name
     * @param phoneNumber Attendee's phone number
     * @param reminder Attendee's personality / quirk reminder
     * @return Person object containing parameters, then checked for duplicacy
     */
    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person attendee = new Person(firstName, lastName, phoneNumber, reminder);

        if (searchBehavior != null && searchBehavior.contains(people, attendee)) {
            return null;
        }

        people.add(attendee);
        return attendee;
    }

    public String getTitle() {
        return this.title;
    }

    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    public List<Person> getList() {
        Collections.sort(people);
        return this.people;
    }
}
