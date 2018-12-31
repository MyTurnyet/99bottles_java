import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BottlesTest {

    private static final String LINE_BREAK = System.getProperty("line.separator");

    private Bottles bottles;

    @Before
    public void setUp() throws Exception {
        bottles = new Bottles();
    }
    
    @Test
    public void verses_99_98() throws Exception {
        String actual = bottles.verses(99, 98);
        assertEquals(
                "99 bottles of beer on the wall, 99 bottles of beer." + LINE_BREAK
                + "Take one down and pass it around, 98 bottles of beer on the wall." + LINE_BREAK +
                "98 bottles of beer on the wall, 98 bottles of beer." + LINE_BREAK
                + "Take one down and pass it around, 97 bottles of beer on the wall." + LINE_BREAK, 
                actual);
    }

    @Test
    public void verse_99() throws Exception {
        String actual = bottles.verse(99);
        assertEquals("99 bottles of beer on the wall, 99 bottles of beer." + LINE_BREAK
                + "Take one down and pass it around, 98 bottles of beer on the wall." + LINE_BREAK, actual);
    }

    @Test
    public void verse_3() throws Exception {
        String actual = bottles.verse(3);
        assertEquals("3 bottles of beer on the wall, 3 bottles of beer." + LINE_BREAK
                + "Take one down and pass it around, 2 bottles of beer on the wall." + LINE_BREAK, actual);
    }

    @Test
    public void verse_2() throws Exception {
        String actual = bottles.verse(2);
        assertEquals("2 bottles of beer on the wall, 2 bottles of beer." + LINE_BREAK
                + "Take one down and pass it around, 1 bottle of beer on the wall." + LINE_BREAK, actual);
    }
    
    @Test
    public void verse_1() throws Exception {
        String actual = bottles.verse(1);
        assertEquals("1 bottle of beer on the wall, 1 bottle of beer." + LINE_BREAK
                + "Take it down and pass it around, no more bottles of beer on the wall." + LINE_BREAK, actual);
    }
    
    @Test
    public void verse_0() throws Exception {
        String actual = bottles.verse(0);
        assertEquals("No more bottles of beer on the wall, no more bottles of beer." + LINE_BREAK
                + "Go to the store and buy some more, 99 bottles of beer on the wall." + LINE_BREAK, actual);
    }
}
