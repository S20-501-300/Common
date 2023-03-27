package com.third;


public class Triangle {
    private Point point1, point2, point3;
    public Triangle(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public void setPoint1(Point point1){ this.point1 = point1; }
    public void setPoint2(Point point2){ this.point2 = point2; }
    public void setPoint3(Point point3){ this.point3 = point3; }

    public double perimeter(){
        double dist1 = Math.sqrt((point2.getY() - point1.getY()) * (point2.getY() - point1.getY()) + (point2.getX() - point1.getX()) * (point2.getX() - point1.getX()));
        double dist2 = Math.sqrt((point3.getY() - point2.getY()) * (point3.getY() - point2.getY()) + (point3.getX() - point2.getX()) * (point3.getX() - point2.getX()));
        double dist3 = Math.sqrt((point1.getY() - point3.getY()) * (point1.getY() - point3.getY()) + (point1.getX() - point3.getX()) * (point1.getX() - point3.getX()));
        return dist1+dist2+dist3;
    }

    public double area(){
        return Math.abs((point1.getX()-point3.getX())*(point2.getY()-point1.getY())-
                (point1.getX()-point2.getX())*(point3.getY()-point1.getY()))*0.5;
    }

    public Point median(){
        int m2 = (point1.getX()+point2.getX()+point3.getX())/3;
        int m3 = (point1.getY()+point2.getY()+point3.getY())/3;

        System.out.println(m2 + " "  + m3);
        return new Point(m2, m3);
    }
}