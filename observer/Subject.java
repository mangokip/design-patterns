/**
 * Basic interface for the Subject type, made to work in unison with the Oberserver interface and perform various functions
 *
 * @author Bryce Klein
 */
package observer;

public interface Subject {

    /**
     * Registers observer object into registry of observers
     *
     * @param observer - observer object made from implementation
     */
    public void registerObserver(Observer observer);

    /**
     * Removes observer object from registry
     *
     * @param observer - observer object made from implementation
     */
    public void removeObserver(Observer observer);

    /**
     * Notifies / updates observers of a newly added book object
     *
     * @param book - book object that is registered as something that observers
     * must be notified of
     */
    public void notifyObservers(Book book);

}
