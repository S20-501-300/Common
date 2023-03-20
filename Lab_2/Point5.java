public class Point5 {
    double x, y;

    public Point5(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point5(){
        this.x = 0;
        this.y = 0;
    }

    double getX(){ return this.x;}
    double getY(){ return this.y;}

    public Point5 translate(int x, int y){
        return new Point5(this.x+x, this.y+y);
    }

    public Point5 scale(double factor){
        return new Point5(this.x*factor, this.y*factor);
    }
    public static void main(String[] args) {
        Point5 p = new Point5(3, 4).translate(1, 3).scale(0.5);
        System.out.println( p.getX());
        System.out.println( p.getY());
    }
}
