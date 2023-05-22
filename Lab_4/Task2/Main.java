package Task2;

public class Main {
    public static void main(String[] args) {
        LabeledPoint lbpoint = new LabeledPoint("Label", 39.2, 38.5);
        LabeledPoint lbpoint1 = new LabeledPoint("Label1", 39.2, 38.5);
        LabeledPoint lbpoint2 = new LabeledPoint("Label2", 333, 4);

        System.out.println(lbpoint.getX());
        System.out.println(lbpoint.getY());
        System.out.println(lbpoint.hashCode());
        System.out.println(lbpoint.toString());
        System.out.println(lbpoint.equals(lbpoint1));
        System.out.println(lbpoint.equals(lbpoint2));
    }
}