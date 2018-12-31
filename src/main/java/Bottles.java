
public class Bottles {

    private static final String LINE_BREAK = System.getProperty("line.separator");

    String verse(int number) {
        
        return number + " bottles of beer on the wall, " + number + " bottles of beer." + LINE_BREAK
                + "Take one down and pass it around, " + (number - 1) + " bottles of beer on the wall." + LINE_BREAK;

    }
}
