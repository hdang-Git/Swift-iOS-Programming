package Lab11;

/**
 * Manages a collection of Book objects.
 */
 
public class Bookstore {

    private final Book[] books;
    private int totalbooks;
    private double gross;
    private final static int MAXNUMOFBOOKS = 1000;

    /**
     * Creates an empty BookStore object.
     */
    public Bookstore() {  
		// Your code should go here
    }

    /**
     * Adds a new book to this bookstore.
     *
     * @param b the book to add
     */
    public void addNewBook(Book b) {     
			// Your code should go here
    }

    /**
     * Adds a certain quantity of a book already in stock.
     *
     * @param title the title of the the book
     * @param quantity amount of copies to add
     */
    public void addBookQuantity(String title, int quantity) {
        // Search for the book...if found adjust the quantity, 	
		// otherwise, inform the user that the book is not available  
    }

    /**
     * Checks if at least a certain number of copies of a particular book are in
     * stock. Note: You can use this method to check if a book is already in the
     * bookstore. This way, you won't create duplicate records of the same book.
     *
     * @param title the title of the book to search for
     * @param quantity the desired number of copies
     * @return 
     * @returns true if title exists with specified quantity; otherwise false
     */
    public boolean inStock(String title, int quantity) {
        // Search for the book...if found, adjust the quantity.      
        // otherwise, Book not in the BookStore.
    }

    /**
     * Sells a particular number of copies of a certain book. If successful
     * (i.e. enough books are in stock to sell), the quantity of the book is
     * adjusted. Otherwise, no books are sold.
     *
     * @param title the title of the book to sell
     * @param quantity the amount of books to sell
     * @return 
     * @returns true if successful; otherwise false
     */
    public boolean sellBook(String title, int quantity) {
        // Checks to see if the books are in stock.
    }

    /**
     * Lists information about each book in the bookstore
     */
    public void listBooks() {	
		// List all books in Bookstore
    }

    /**
     * Lists the titles of all the books in the bookstore
     */
    public void listTitles() {
		// List all books titles
    }

    /**
     * Returns the gross income of this bookstore.
     *
     * @return 
     * @returns gross income
     */
    public double getIncome() {
		// retrive the gross variable.
    }
}
