package Task5;

public class Circle extends Shape implements Cloneable{
    Point center;
    double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter(){
        return center;
    }
    public Circle clone(){
        return new Circle(new Point(this.point.x, this.point.y), this.radius);
    }
}
