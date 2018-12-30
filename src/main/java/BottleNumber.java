
public class BottleNumber {

    
    String container(int number) {
        if (number == 1) {
            return "bottle";
        }

        return "bottles";
    }

    String pronoun(int number) {
        if (number == 1) {
            return "it";
        }

        return "one";
    }

    String quantity(int number) {
        if (number == 0) {
            return "no more";
        }
        return String.valueOf(number);
    }

    String action(int number) {
        if (number == 0) {
            return "Go to the store and buy some more";
        }

        return "Take " + pronoun(number) + " down and pass it around";
    }

    int successor(int number) {
        if (number == 0) {
            return 99;
        }
        return number - 1;
    }
}
