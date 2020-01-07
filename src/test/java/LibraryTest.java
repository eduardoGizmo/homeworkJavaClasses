import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Library library;

    @Before
    public void setUp() {
        library = new Library(4 );
        book1 = new Book("I'm a book!", "Miss Unknown", "Romantic");
        book2 = new Book("I'm not a book!", "Mr Unknown", "Dark Novel");
        book3 = new Book("How to write a book!", "The Unknown", "Educational");
        book4 = new Book("Oh my book!", "Who Knows", "Spiritual");

    }

    @Test
    public void shouldCountNumberOfBooksInLibrary(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void shouldAddNewBookInLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(4, library.countBooks());
    }

}
