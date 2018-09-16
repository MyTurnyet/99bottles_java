import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

public class Bottles {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public String song() {
        return verses(99, 0);
    }

    public String verses(int starting, int ending) {
        return rangeClosed(ending, starting)
                .map(i -> (ending + starting) - i)
                .mapToObj(bottleNumber -> verse(bottleNumber))
                .collect(joining(LINE_SEPARATOR));
    }

    public String verse(int number) {
        switch (number) {
            case 0:
                return "No more bottles of beer on the wall, " +
                        "no more bottles of beer." + LINE_SEPARATOR +
                        "Go to the store and buy some more, " +
                        "99 bottles of beer on the wall." + LINE_SEPARATOR;
            case 1:
                return number + " " + container(number) + " of beer on the wall, " +
                        number + " " + container(number) + " of beer." + LINE_SEPARATOR +
                        "Take it down and pass it around, " +
                        "no more bottles of beer on the wall." + LINE_SEPARATOR;
            default:
                return number + " " + container(number) + " of beer on the wall, " +
                        number + " " + container(number) + " of beer." + LINE_SEPARATOR +
                        "Take one down and pass it around, " +
                        (number - 1) + " " + container(number - 1) + " of beer on the wall." + LINE_SEPARATOR;
        }
    }

    private String container(int number) {
        if (number == 1) {
            return "bottle";
        } else {
            return "bottles";
        }
    }
    
    String pronoun() {
        return "one";
    }
}