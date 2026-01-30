package ch05_constructors.coordinateSystem3;
/*
2. Bir önceki bölümdeki iki boyutlu bir ortamda bir noktayı temsil eden sınıfa kurucular koyun
a. Test sınıfının main metodunda, birisi merkezi (origin) temsil eden 3 noktayı kurucu çağrılarıyla
oluşturup üzerlerinde metot çağrıları yapın
 */
public class Test {
    static void main() {
        Point point1 = new Point(3,4);
//        point1.setX(3);
//        point1.setY(4);

        Point point2 = new Point(8,15);
//        point2.setX(8);
//        point2.setY(15);

        Point point3 = new Point(5,12);
//        point3.setX(5);
//        point3.setY(12);

        System.out.println("Area of the triangle between 3 points  :  " +
                point1.calculateAreaOfTriangleBetweenThreePoints(point2,point3));

        Point origin = new Point(0,0);
//        origin.setX(0);
//        origin.setY(0);

        System.out.println(origin.calculateDistanceFromOrigin()); //0.0

        System.out.println(origin.calculateDistanceBetweenTwoPoints(point1)); //5.0
        System.out.println(point1.calculateDistanceFromOrigin()); //0.5
    }
}
