package Task4;

import Task3.LabeledPoint;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Circle circle = new Circle(point1, 0.2);
        System.out.println(circle.getCenter().x);
        System.out.println(circle.getCenter().y);

        Rectangle rectangle = new Rectangle(point1, 4, 8);
        System.out.println(rectangle.getCenter().x);
        System.out.println(rectangle.getCenter().y);

        Line line = new Line(point1, new Point(30, 40));
        System.out.println(line.getCenter().x);
        System.out.println(line.getCenter().y);
    }
}