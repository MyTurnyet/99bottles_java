import java.lang.reflect.InvocationTargetException;

public class BottleNumber {

    protected final int number;

       
    public static BottleNumber createFor(int number) {

        Class<? extends BottleNumber> clazz;
        try {
            clazz = (Class<? extends BottleNumber>) Class.forName("BottleNumber" + number);
        } catch (ClassNotFoundException e1) {
            clazz = BottleNumber.class;
        }

        try {
            return clazz.getConstructor(Integer.class).newInstance(number);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(e);
        }
    }
    

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

    BottleNumber successor() {
        return BottleNumber.createFor(number-1);
    }
    
    @Override
    public String toString() {
        return quantity() + " " + container();
    }
    
    int getNumber() {
        return number;
    }
}
