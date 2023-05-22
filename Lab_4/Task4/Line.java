package Task4;

public class Line extends Shape{
    Point from, to;

    public Line(Point from, Point to){
        this.from = from;
        this.to = to;
    }

    public Point getCenter(){
        return new Point((to.x- from.x)/2, (to.y- from.y)/2 );
    }

}
