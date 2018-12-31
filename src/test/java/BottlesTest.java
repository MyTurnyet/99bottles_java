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
    public void verse_99() throws Exception {
        String actual = bottles.verse(99);
        assertEquals(
                "99 bottles of beer on the wall, 99 bottles of beer." + LINE_BREAK
                + "Take one down and pass it around, 98 bottles of beer on the wall." + LINE_BREAK, 
                actual);
    }
    
    @Test
    public void verse_3() throws Exception {
        String actual = bottles.verse(3);
        assertEquals(
                "3 bottles of beer on the wall, 3 bottles of beer." + LINE_BREAK
                + "Take one down and pass it around, 2 bottles of beer on the wall." + LINE_BREAK, 
                actual);
    }
}
