package Task4;

public abstract class Shape {

    Point point;
    public Shape(Point point){
        this.point = point;
    }

    public Shape(){
        this.point = new Point(0, 0);
    }

    public void moveBy(double dx, double dy){
        this.point.setX(this.point.x+dx);
        this.point.setY(this.point.y+dy);
    }

    public abstract Point getCenter();


}
