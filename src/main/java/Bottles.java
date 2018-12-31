import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

import java.util.stream.IntStream;

public class Bottles {

    private static final String LINE_BREAK = System.getProperty("line.separator");

    String song() {
        return verses(99, 0);
    }

    String verses(int start, int end) {
        return descendingRange(start, end)
                .mapToObj(bottleNumber -> verse(bottleNumber))
                .collect(joining(LINE_BREAK));
    }

    String verse(int number) {
        String theVerse;

        switch (number) {
        case 0:
            theVerse = "No more bottles of beer on the wall, " + "no more bottles of beer." + LINE_BREAK
                    + "Go to the store and buy some more, " + "99 bottles of beer on the wall." + LINE_BREAK;
            break;
        case 1:
            theVerse = "1 bottle of beer on the wall, " + "1 bottle of beer." + LINE_BREAK
                    + "Take it down and pass it around, " + "no more bottles of beer on the wall." + LINE_BREAK;
            break;
        case 2:
            theVerse = number + " bottles of beer on the wall, " + number + " bottles of beer." + LINE_BREAK
                    + "Take one down and pass it around, " + "1 bottle of beer on the wall." + LINE_BREAK;
            break;
        default:
            theVerse = number + " bottles of beer on the wall, " + number + " bottles of beer." + LINE_BREAK
                    + "Take one down and pass it around, " + (number - 1) + " bottles of beer on the wall."
                    + LINE_BREAK;
            break;
        }

        return theVerse;
    }

    static IntStream descendingRange(int high, int low) {
        return rangeClosed(low, high).map(i -> (low + high) - i);
    }
}
