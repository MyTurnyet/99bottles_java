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

        BottleNumber bottleNumber = new BottleNumber(number);
        BottleNumber nextBottleNumber = new BottleNumber(bottleNumber.successor());
        
        return capitalize(bottleNumber.quantity()) + " " + bottleNumber.container() + " of beer on the wall, " +
        bottleNumber.quantity() + " " + bottleNumber.container() + " of beer." + LINE_SEPARATOR +
        bottleNumber.action() + ", " +
        nextBottleNumber.quantity() + " " + nextBottleNumber.container() + " of beer on the wall." + LINE_SEPARATOR;
   
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