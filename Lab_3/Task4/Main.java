package Task4;

public class Main {

    public static double average(IntSequence seq, int n){
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n){
            count++;
            sum+= seq.next();
        }
        return count == 0 ? 0 : sum / count;
    }
    public void main(String[] args) {
        SquareSequence square = new SquareSequence();
        double avg = average(square, 100);
        System.out.println(avg);

        IntSequence digits = new DigitSequence(1729);
        double avg2 = average(digits, 100);
    }
}
