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

    //guard clause
    private String container(int number) {
        if (number == 1) {
            return "bottle";
        } 
        
        return "bottles";
    }
    
    //verbose conditional
    private String pronoun(int number) {
        if(number == 1){
            return "it";
        }else {       
            return "one";
        }
    }
    
    //ternary
    private String quantity(int number) {
        return (number == 0) ? "no more" : String.valueOf(number);
    }
    
    private String action(int number) {
        if(number == 0){
            return "Go to the store and buy some more";
        }
        
        return "Take " + pronoun(number) + " down and pass it around";
    }
    
    private int successor(int number) {       
        if (number == 0) {
            return 99;
        }
        return number - 1;    
    }
}