
public class BottleNumber {

    protected final int number;


    public BottleNumber(Integer number) {
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
        return String.valueOf(number);
    }

    String action() {
        return "Take " + pronoun() + " down and pass it around";
    }

    int successor() {
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
