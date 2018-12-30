import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;
import static org.apache.commons.lang3.StringUtils.capitalize;

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

        BottleNumber bottleNumber = (number == 0) ? new BottleNumber0(number) : new BottleNumber(number);
        
        int successor = bottleNumber.successor();
        BottleNumber nextBottleNumber = (successor == 0) ?  new BottleNumber0(successor) : new BottleNumber(successor);
        
        return capitalize(bottleNumber.toString()) + " of beer on the wall, " +
        bottleNumber + " of beer." + LINE_SEPARATOR +
        bottleNumber.action() + ", " +
        nextBottleNumber + " of beer on the wall." + LINE_SEPARATOR;
   
    }

}