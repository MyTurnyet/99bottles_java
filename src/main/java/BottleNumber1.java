
public class BottleNumber1 extends BottleNumber {

    public BottleNumber1(Integer number) {
        super(number);
    }

    String container() {
        if (number == 1) {
            return "bottle";
        }

        return "bottles";
    }
}
