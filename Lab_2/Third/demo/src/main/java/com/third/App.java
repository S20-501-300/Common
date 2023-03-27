package com.third;


public class App {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 3);
        Point point3 = new Point(4, 0);
        Triangle triangle = new Triangle(point1, point2, point3);
        System.out.println(triangle.perimeter());
        System.out.println(triangle.area());

        Point median = triangle.median();
        System.out.printf("(%d, %d)", median.getX(), median.getY());
    }
}

