package Task15;

public class Main {

    public static void main(String[] args) {
        RndSeq rnd = new RndSeq();
        for (int i = 0; i < 10; i++)
            System.out.printf("%d, ", rnd.randomInts(10, 20).next());
    }

}
