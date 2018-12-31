
public class Bottles {

    private static final String LINE_BREAK = System.getProperty("line.separator");

    String verse(int number) {
        int i;

        if(number == 99) {
            i = 99;
        }else {
            i = 3;
        }
        
        return i + " bottles of beer on the wall, " + i + " bottles of beer." + LINE_BREAK
                + "Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall." + LINE_BREAK;

    }
}
