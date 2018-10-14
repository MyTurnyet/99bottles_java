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
        switch (number) {
            case 0:
                return capitalize(quantity(number)) + " " + container(number) + " of beer on the wall, " +
                        quantity(number) + " " + container(number) + " of beer." + LINE_SEPARATOR +
                        action(number) + ", " +
                        "99 bottles of beer on the wall." + LINE_SEPARATOR;
             default:
                return capitalize(quantity(number)) + " " + container(number) + " of beer on the wall, " +
                        quantity(number) + " " + container(number) + " of beer." + LINE_SEPARATOR +
                        action(number) + ", " +
                        quantity(number - 1) + " " + container(number - 1) + " of beer on the wall." + LINE_SEPARATOR;
        }
    }

    private String container(int number) {
        if (number == 1) {
            return "bottle";
        } else {
            return "bottles";
        }
    }
    
    private String pronoun(int number) {
        if(number == 1){
            return "it";
        }
        
        return "one";
    }
    
    private String quantity(int number) {
        switch(number){
        case -1:
            return "99";
        case 0:
            return "no more";
        default:
            return String.valueOf(number);
        }
    }
    
    private String action(int number) {
        if(number == 0){
            return "Go to the store and buy some more";
        }
        
        return "Take " + pronoun(number) + " down and pass it around";
    }
}