
public class BottleNumber0 extends BottleNumber {

    public BottleNumber0(int number) {
        super(number);
    }

    
    String quantity() {
        if (number == 0) {
            return "no more";
        }
        return String.valueOf(number);
    }
    
}
