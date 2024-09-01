/**
 * BestSellers implements the Subject interface and creates an ArrayList of observers for management, and bestSellers which contains best selling books.
 * There are various methods present to implement the Subject and Observer interface.
 *
 * @author Bryce Klein
 */
package observer;

import java.util.ArrayList;

public class BestSellers implements Subject {

    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Basic constructor for BestSellers observers = ArrayList of type Observer
     * bestSellers = ArrayList of type Book
     */
    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    /**
     * Basic implementation to add observers to an ArrayList
     *
     * @param observer - observer to be added into ArrayList
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Basic implementation to remove observers from an ArrayList
     *
     * @param observer - observer to be removed from ArrayList
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Basic implementation to notify all observers of a new BestSeller
     *
     * @param book - best selling book to add as a notification for observers
     */
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    /**
     * This method adds a book to the bestSeller ArrayList with all of a book's
     * given attributes / parameters. After doing so, it invokes the
     * notifyObservers method in this same class to notify all observers
     * previously populated.
     *
     * @param title - Book title
     * @param genre - Book genre, based in enumeration file
     * @param authorFirstName - Author's first name
     * @param authorLastName - Author's last name
     * @param description - Brief description of the book's story
     */
    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        Book bestSeller = new Book(title, genre, authorFirstName, authorLastName, description);
        bestSellers.add(bestSeller);
        notifyObservers(bestSeller);
    }

}
