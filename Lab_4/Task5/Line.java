package Task5;

public class Line extends Shape implements Cloneable{
    Point from, to;

    public Line(Point from, Point to){
        this.from = from;
        this.to = to;
    }

    public Point getCenter(){
        return new Point((to.x- from.x)/2, (to.y- from.y)/2 );
    }
//    public Line clone(){
//        return new Line(new Point(from.x, from.y), new Point(to.x, to.y));
//    }

    public Line clone(){
        return (Line) super.clone();
    }

}
