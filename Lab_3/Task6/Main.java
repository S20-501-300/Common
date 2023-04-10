package Task6;
import java.util.Iterator;



public class Main {
    public static void main(String[] args) {

        Iterator<Integer> digits = new DigitSequence(2235);
        while (digits.hasNext())
            System.out.println(digits.next());

        digits.remove();
    }
}
