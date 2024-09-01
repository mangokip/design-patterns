/**
 * FanReads is similar to Store in the nature that it acts as a subject to be added to a list of observers and update a list of personal favorites.
 * A hashmap is utilized in unison with an ArrayList to implement functionality.
 * This class implements the Observer interface.
 *
 * @author Bryce Klein
 */
package observer;

import java.util.ArrayList;
import java.util.HashMap;

public class FanReads implements Observer {

    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations;

    /**
     * Basic constructor for FanReads using Subject subject, String firstName,
     * String lastName. This method also registers the subject as an observer,
     * and initializes a HashMap of recommendations. After this, a for loop
     * assigns Genre values into the recommendations HashMap.
     *
     * @param subject - subject to be added into list of observers
     * @param firstName - First name of fan creating the fan favorite
     * @param lastName - Last name of fan creating the fan favorite
     */
    public FanReads(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        subject.registerObserver(this);
        recommendations = new HashMap<>();

        for (Genre genre : Genre.values()) {
            recommendations.put(genre, new ArrayList<>());
        }
    }

    /**
     * Updates list of recommendations with given book, also accounting for
     * genre as part of the HashMap key.
     *
     * @param book - book to be recommended
     */
    public void update(Book book) {
        recommendations.get(book.getGenre()).add(book);

    }

    public ArrayList<Book> getRecommendations(Genre genre) {
        return recommendations.get(genre);
    }

}
