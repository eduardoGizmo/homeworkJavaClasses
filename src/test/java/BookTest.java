import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp(){
        book = new Book("I'm a book!", "Miss Unknown", "Romantic" );

    }

    @Test
    public void shouldHaveATitle(){
        assertEquals("I'm a book!", book.getName());
    }
    @Test
    public void shouldHaveAnAuthor(){
        assertEquals("Miss Unknown", book.getAuthor());
    }
    @Test
    public void shouldHaveAGenre(){
        assertEquals("Romantic", book.getGenre());
    }


}
