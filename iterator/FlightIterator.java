/**
 * This is the iterator for flights from the flights.txt file, implementing the Iterator interface
 *
 * @author Bryce Klein
 */
package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class FlightIterator implements Iterator<Flight> {

    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    /**
     * Basic constructor for the FlightIterator
     *
     * @param flights - ArrayList of flights to be grabbed when called
     * @param from - placeholder parameter for users from code to search through
     * list
     * @param to - placeholder parameter for users to code to search through
     * list
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
    }

    /**
     * Iterates through each position in the Flight list
     */
    public Flight next() {
        Flight flight = flights.get(position);
        position++;
        return flight;
    }

    /**
     * Checks if the list has more entries while also implementing matching
     * flights and iterating
     */
    public boolean hasNext() {
        // Skip over flights that don't match the from/to conditions
        while (position < flights.size()) {
            Flight currentFlight = flights.get(position);
            if (currentFlight.sameLoc(from, to)) {
                return true;  // Found a matching flight
            }
            position++;  // Move to the next flight
        }
        return false;  // No more matching flights
    }

}
