package scook4;
/* Instance variables: 'title', 'author'
Static variable: 'bookCount' to keep track of each book count
Methods:
1. Accessors(Getters)
2. Mutators(Setters)
3. A Static method to get the value of bookCount
4. A non-static method to display the book info
In the main method, create a couple of book objects, update bookCount and display
book info.
*/
public class book {
    private String title;
    private String author;
    public static int bookCount = 0;

    // Constructor
    public book() {
        bookCount++; // Increment bookCount each time a new book is created
    }

    // Getters/Accessors
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Static method to get the value of bookCount
    public static int getBookCount() {
        return bookCount;
    }

    // Non-static method to display the book info
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    // Main method
    public static void main(String[] args) {
        book b1 = new book(); // Create first book object
        book b2 = new book(); // Create second book object

        b1.setTitle("Morning Miracle");
        b1.setAuthor("Hal Elrod");

        b2.setTitle("Java");
        b2.setAuthor("Karamanchi");

        // Display book information
        b1.display();
        b2.display();

        // Display total book count
        System.out.println("Total Books: " + book.getBookCount());
    }
}
