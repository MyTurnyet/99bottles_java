
public class BottleNumber {

    protected final int number;


    public BottleNumber(int number) {
        this.number = number;
    }
    
    String container() {
        if (number == 1) {
            return "bottle";
        }

        return "bottles";
    }

    String pronoun() {
        if (number == 1) {
            return "it";
        }

        return "one";
    }

    String quantity() {
        if (number == 0) {
            return "no more";
        }
        return String.valueOf(number);
    }

    String action() {
        if (number == 0) {
            return "Go to the store and buy some more";
        }

        return "Take " + pronoun() + " down and pass it around";
    }

    int successor() {
        if (number == 0) {
            return 99;
        }
        return number - 1;
    }
    
    @Override
    public String toString() {
        return quantity() + " " + container();
    }
    
    int getNumber() {
        return number;
    }
}
