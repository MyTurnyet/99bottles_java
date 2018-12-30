
public class BottleNumber0 extends BottleNumber {

    public BottleNumber0(Integer number) {
        super(number);
    }

    String quantity() {
        return "no more";
    }
    
    String action() {
        return "Go to the store and buy some more";
    }

    BottleNumber successor() {
        return BottleNumber.createFor(99);
    }

}
