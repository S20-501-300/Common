package Task5;

public class Point {
    protected double x, y;

    Point(double x, double y){ this.x = x; this.y = y; }
    public double getX(){ return this.x; }
    public double getY(){ return this.y; }
    public void setX(double x){ this.x = x; }
    public void setY(double y) {this.y = y; }

    public Point clone(){
        try {
            return (Point) super.clone();
        }catch (CloneNotSupportedException ex) {
            return null;
        }
    }




}