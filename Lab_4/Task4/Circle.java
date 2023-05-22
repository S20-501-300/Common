package Task4;

public class Circle extends Shape {
    Point center;
    double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter(){
        return center;
    }
}
