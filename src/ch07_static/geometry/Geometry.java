package ch07_static.geometry;

public class Geometry {

    static double calculateDistanceFromOrigin(Point point){
        return Math.sqrt(Math.pow(point.X,2)+Math.pow(point.Y,2));
    }

    static double calculateDistanceBetweenTwoPoints(Point point1 , Point point2){
        return Math.sqrt(Math.pow(point1.X -point2.X,2)+Math.pow(point1.Y -point2.Y,2));
    }

    static double calculateAreaOfTriangleBetweenThreePoints(Point point1 ,Point point2 , Point point3){
        double a = (point1.X * point2.Y) + (point2.X * point3.Y) + (point3.X * point1.Y);
        double b = (point2.X * point1.Y) + (point3.X * point2.Y) + (point1.X * point3.Y);
        return 0.5*Math.abs(a-b);
    }
}
