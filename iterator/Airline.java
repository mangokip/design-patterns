/**
 * This class creates an Airline composed of flights grabbed from the FlightLoader, which creates an ArrayList of said Flight objects.
 *
 * @author Bryce Klein
 */
package iterator;

import java.util.ArrayList;

public class Airline {

    private String title;
    private ArrayList<Flight> flights;

    /**
     * Basic constructor for an Airline object using the title input
     *
     * @param title - what the airline will be named as an object
     */
    public Airline(String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights();
    }

    /**
     * Basic get method to grab airline title
     *
     * @return - String of Airline name
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * This creates a FlightIterator utilizing fromCode and toCode which is
     * inputted by the user
     *
     * @param fromCode - the from airport input from user
     * @param toCode - the to airport input from user
     * @return - new Flight iterator object
     */
    public FlightIterator createIterator(String fromCode, String toCode) {
        try {
            Airport from = Airport.valueOf(fromCode.toUpperCase());
            Airport to = Airport.valueOf(toCode.toUpperCase());
            return new FlightIterator(this.flights, from, to);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: Invalid input.");
            return null;
        }
    }

}
