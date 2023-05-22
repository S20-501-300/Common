package Task4;

public class Rectangle extends Shape{
    Point topLeft;
    double width, height;

    public Rectangle(Point topLeft, double width, double height){
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public Point getCenter(){
        return new Point(topLeft.x + height/2, topLeft.y - width/2);
    }
}
