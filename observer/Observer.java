/**
 * Basic interface for the Observer type
 *
 * @author Bryce Klein
 */
package observer;

public interface Observer {

    /**
     * Method to be implemented in order to update a book of type Book in a list
     *
     * @param book - book that is passed in to be updated on the list
     */
    public void update(Book book);
}
