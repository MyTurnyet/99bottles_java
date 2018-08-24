import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bottles {
    public String song() {
        return verses(99, 0);
    }

    public String verses(int starting, int ending) {
        List<String> strings = IntStream
                .range(ending, starting + 1)
                .map(i -> starting - i + ending)
                .mapToObj(i -> verse(i))
                .collect(Collectors.toList());

        return String.join("\n", strings);
    }

    public String verse(int number) {
        switch (number) {
            case 0:
                return "No more bottles of beer on the wall, " +
                        "no more bottles of beer.\n" +
                        "Go to the store and buy some more, " +
                        "99 bottles of beer on the wall.\n";
            case 1:
                return "1 bottle of beer on the wall, " +
                        "1 bottle of beer.\n" +
                        "Take it down and pass it around, " +
                        "no more bottles of beer on the wall.\n";
            case 2:
                return "2 bottles of beer on the wall, " +
                        "2 bottles of beer.\n" +
                        "Take one down and pass it around, " +
                        "1 bottle of beer on the wall.\n";
            default:
                return String.format("%d bottles of beer on the wall, ", number) +
                        String.format("%d bottles of beer.\n", number) +
                        "Take one down and pass it around, " +
                        String.format("%d bottles of beer on the wall.\n", number - 1);
        }
    }
}