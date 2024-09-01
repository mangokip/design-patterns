/**
 * This class creates a Book object with various parameters to be used in a driver as the main source object for utility
 *
 * @author Bryce Klein
 */
package observer;

public class Book {

    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;

    /**
     * Constructor for a Book object using the following parameters - String
     * title, Genre genre, String authorFirstName, String authorLastName, String
     * description.
     *
     * @param title - Book's title
     * @param genre - genre of Book, based off enumeration file of genres
     * @param authorFirstName - Author's first name
     * @param authorLastName - Author's last name
     * @param description - Brief description of Book
     */
    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public String getAuthorFirstNamE() {
        return this.authorFirstName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }

    public String getDescription() {
        return this.description;
    }

    /**
     * @return String value that contains the formatted display of each book as
     * required for output.txt
     */
    public String toString() {
        return "\n----" + this.title + "---- \n" + this.genre.label + " by: " + this.authorFirstName + " " + this.authorLastName + "\n" + this.description + "\n";
    }

}
