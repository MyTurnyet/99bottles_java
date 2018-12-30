import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;
import static org.apache.commons.lang3.StringUtils.capitalize;

import java.lang.reflect.InvocationTargetException;

public class Bottles {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public String song() {
        return verses(99, 0);
    }

    public String verses(int starting, int ending) {
        return rangeClosed(ending, starting).map(i -> (ending + starting) - i)
                .mapToObj(bottleNumber -> verse(bottleNumber)).collect(joining(LINE_SEPARATOR));
    }

    public String verse(int number) {

        BottleNumber bottleNumber = bottleNumberFor(number);
        BottleNumber nextBottleNumber = bottleNumberFor(bottleNumber.successor());

        return capitalize(bottleNumber.toString()) + " of beer on the wall, " + bottleNumber + " of beer."
                + LINE_SEPARATOR + bottleNumber.action() + ", " + nextBottleNumber + " of beer on the wall."
                + LINE_SEPARATOR;

    }

    private BottleNumber bottleNumberFor(int number) {

        Class<? extends BottleNumber> clazz;

        switch (number) {
        case 0:
            clazz = BottleNumber0.class;
            break;
        case 1:
            clazz = BottleNumber1.class;
            break;
        default:
            clazz = BottleNumber.class;
            break;

        }

        try {
            return clazz.getConstructor(Integer.class).newInstance(number);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(e);
        }
    }

}