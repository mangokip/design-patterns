/**
 * Store class implements the Observer interface and uses a subject, book title, and Queue list of best sellers.
 * It also creates a list of BestSellers by the Store and can update that list, with a limit of 5 books per list.
 *
 * @author Bryce Klein
 */
package observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Store implements Observer {

    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
     * Basic constructor for Store using a subject of type Subject. Following
     * the initialization of a LinkedList of bestSellers (LinkedList is used in
     * order to be used in unison with Queue functionality), the subject is
     * registered as an observer.
     *
     * @param subject
     */
    public Store(Subject subject) {
        this.subject = subject;
        this.bestSellers = new LinkedList<>();
        subject.registerObserver(this);
    }

    /**
     * This method updates the list of Best Sellers. If the size of the list is
     * greater or equal to 5, then it invokes the poll function. After this if
     * statement, it adds a book.
     *
     * @param book - the book to be added as a best seller.
     */
    public void update(Book book) {
        if (bestSellers.size() >= 5) {
            bestSellers.poll();
        }
        bestSellers.add(book);

    }

    public List<Book> getBestSellers() {
        return (List) bestSellers;
    }

}
