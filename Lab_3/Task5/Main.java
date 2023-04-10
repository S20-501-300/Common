package Task5;

public class Main {

    public static void main(String[] args) {

        IntSequence digits = IntSequence.constant(1);
        for (int i=0; i<10; i++){
            System.out.println(digits.next());
        }

        IntSequence digits2 = IntSequence.constant2(10);
        for (int i=0; i<10; i++){
            System.out.println(digits2.next());
        }

    }
}
