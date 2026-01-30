package ch07_static.geometry;

public class Test {
    static void main() {
        Point point1 = new Point(3,5);
        Point point2 = new Point(8,15);
        Point point3 = new Point(5,12);

        System.out.println("Distance of the point1 from the origin : " + Geometry.calculateDistanceFromOrigin(point1)); //5.830951894845301
        System.out.println("Distance of the point2 from the origin : " + Geometry.calculateDistanceFromOrigin(point2)); //17.0
        System.out.println("Distance of the point3 from the origin : " + Geometry.calculateDistanceFromOrigin(point3)); //13.0

        System.out.println("Distance between point1 and point2 : " + Geometry.calculateDistanceBetweenTwoPoints(point1,point2)); //11.180339887498949
        System.out.println("Distance between point1 and point3 : " + Geometry.calculateDistanceBetweenTwoPoints(point1,point3)); //7.280109889280518
        System.out.println("Distance between point2 and point3 : " + Geometry.calculateDistanceBetweenTwoPoints(point2,point3)); //4.242640687119285

        System.out.println("Distance between 3 points : " + Geometry.calculateAreaOfTriangleBetweenThreePoints(point1,point2,point3)); //7.5

    }
}
