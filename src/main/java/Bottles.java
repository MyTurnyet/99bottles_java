
public class Bottles {

    private static final String LINE_BREAK = System.getProperty("line.separator");

    String verse(int number) {
        
        if(number == 2) {
            return "2 bottles of beer on the wall, 2 bottles of beer." + LINE_BREAK
                    + "Take one down and pass it around, 1 bottle of beer on the wall." + LINE_BREAK;
           
        }        
        return number + " bottles of beer on the wall, " + number + " bottles of beer." + LINE_BREAK
                + "Take one down and pass it around, " + (number - 1) + " bottles of beer on the wall." + LINE_BREAK;

    }
}
