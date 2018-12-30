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

        return capitalize(quantity(number)) + " " + container(number) + " of beer on the wall, " +
        quantity(number) + " " + container(number) + " of beer." + LINE_SEPARATOR +
        action(number) + ", " +
        quantity(successor(number)) + " " + container(successor(number)) + " of beer on the wall." + LINE_SEPARATOR;
   
    }

    private String container(int number) {
        return (new BottleNumber(number)).container();
    }
    
    private String quantity(int number) {
        return (new BottleNumber(number)).quantity();

    }
    
    private String action(int number) {
        return (new BottleNumber(number)).action();

    }
    
    private int successor(int number) {       
        return (new BottleNumber(number)).successor();
  
    }
}