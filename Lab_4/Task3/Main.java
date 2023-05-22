package Task3;

public class Main {
    public static void main(String[] args) {
        LabeledPoint lbpoint = new LabeledPoint("Label", 39.2, 38.5);
        System.out.println("X from main equals " + lbpoint.x);

        LabeledPoint lbpoint1 = new LabeledPoint("Label1", 39.2, 38.5);
        LabeledPoint lbpoint2 = new LabeledPoint("Label2", 333, 4);

        System.out.println(lbpoint.getX());
        System.out.println(lbpoint.getY());
        System.out.println(lbpoint.hashCode());
        System.out.println(lbpoint.getSumOfXAndYFromLabeledPoint());
        System.out.println(lbpoint.toString());//переделали доступ к Х и У без геттеров, а на прямую

    }
}