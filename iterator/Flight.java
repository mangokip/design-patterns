/**
 * This class creates a Flight object constructed from various attributes read from the flights.txt file,
 * to then create a toString with these attributes formatted.
 *
 * @author Bryce Klein
 */
package iterator;

import java.time.Duration;
import java.time.LocalTime;

public class Flight {

    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Basic constructor for Flight object that uses various attributes.
     *
     * @param flightNum - flight identifier code
     * @param from - where the flight is coming from
     * @param to - where the flight is going to
     * @param startTime - the time the flight starts
     * @param endTime - the time the flight ends
     * @param numTransfers - number of transfers in the flight, if any
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /**
     * Get method for the location the flight is coming from
     *
     * @return - Airport object as the from location
     */
    public Airport getFrom() {
        return this.from;
    }

    /**
     * Get method for the location the flight is going to
     *
     * @return - Airport object as the to location
     */
    public Airport getTo() {
        return this.to;
    }

    /**
     * This tracks to see which flights have equal from or to locations; not
     * both - but to grab all flights that have the same from location but a
     * different, also equivalent to location
     *
     * @param from - the from location input
     * @param to - the to location input
     * @return - boolean for if the inputs match a set of flights in the list
     */
    public boolean sameLoc(Airport from, Airport to) {
        return this.from.equals(from) && this.to.equals(to);
    }

    /**
     * toString method that formats the various Flight attributes
     */
    public String toString() {

        Duration duration = Duration.between(startTime, endTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;

        String transfersText;
        if (numTransfers == 0) {
            transfersText = "Direct Flight";
        } else if (numTransfers == 1) {
            transfersText = "1 Stopover";
        } else {
            transfersText = numTransfers + " Transfers";
        }
        return from + " to " + to + " " + startTime + " - " + endTime + " (" + hours + "h " + minutes + "m) " + transfersText;
    }

}
