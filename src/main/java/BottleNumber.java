
public class BottleNumber {

    protected final int number;


    public BottleNumber(Integer number) {
        this.number = number;
    }
    
    String container() {
        return "bottles";
    }

    String pronoun() {
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
