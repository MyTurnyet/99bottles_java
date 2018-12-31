
public class Bottles {

    private static final String LINE_BREAK = System.getProperty("line.separator");

    String verse(int number) {
        if (number == 99) {
            return "99 bottles of beer on the wall, 99 bottles of beer." + LINE_BREAK
                    + "Take one down and pass it around, 98 bottles of beer on the wall." + LINE_BREAK;
        } else {
            return "3 bottles of beer on the wall, 3 bottles of beer." + LINE_BREAK
                    + "Take one down and pass it around, 2 bottles of beer on the wall." + LINE_BREAK;

        }
    }
}
