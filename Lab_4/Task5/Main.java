package Task5;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Circle circle = new Circle(point1, 0.2);
        Circle circle1 = circle.clone();
        System.out.println(circle.getCenter().x);
        System.out.println(circle.getCenter().y);

        System.out.println(circle1.getCenter().x);
        System.out.println(circle1.getCenter().y);

        System.out.println("Check with set: \n");

        circle1.center.x = 3;
        circle1.center.y = 3;
        System.out.println(circle.getCenter().x);
        System.out.println(circle.getCenter().y);

        System.out.println(circle1.getCenter().x);
        System.out.println(circle1.getCenter().y);

        System.out.println("Rectangle without check, cause same with Circle \n");

        Rectangle rectangle = new Rectangle(point1, 4, 8);
        Rectangle rectangle1 = rectangle.clone();
        System.out.println(rectangle.getCenter().x);
        System.out.println(rectangle.getCenter().y);

        System.out.println(rectangle1.getCenter().x);
        System.out.println(rectangle1.getCenter().y);

        Line line = new Line(point1, new Point(30, 40));
        Line line1 = line.clone();

        System.out.println(line.getCenter().x);
        System.out.println(line.getCenter().y);

        System.out.println(line1.getCenter().x);
        System.out.println(line1.getCenter().y);

        System.out.println("Check with set: \n");

        line1.from.x = -2;
        line1.from.y = -3;

        System.out.println(line.getCenter().x);
        System.out.println(line.getCenter().y);

        System.out.println(line1.getCenter().x);
        System.out.println(line1.getCenter().y);
    }
}