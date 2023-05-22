package Task1;

public class Main {
    public static void main(String[] args) {
        LabeledPoint lbpoint = new LabeledPoint("Labeled point", 39.2, 38.5);

        System.out.println(lbpoint.getX());
        System.out.println(lbpoint.getY());
        System.out.println(lbpoint.getLabel());
    }
}