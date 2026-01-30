package ch06_this.coordinateSystem4;
/*
2. Bir önceki bölümdeki iki boyutlu bir ortamda bir noktayı temsil eden sınıfın kurucularına this() çağrıları ekleyin.Sınıftaki argüman alan kurucuda this referansını kullanın.
a. Test sınıfının main metodunda, birisi merkezi (origin) temsil eden 3 noktayı kurucu çağrılarıyla oluşturup üzerlerinde metot çağrıları yapın
 */
public class Test {
    static void main() {
        Point point1 = new Point(3,4);
        Point point2 = new Point(8,15);
        Point point3 = new Point(5,12);

        System.out.println("Area of the triangle between 3 points  :  " +
                point1.calculateAreaOfTriangleBetweenThreePoints(point2,point3));

        Point origin = new Point(0,0);

        System.out.println(origin.calculateDistanceFromOrigin()); //0.0
        System.out.println(origin.calculateDistanceBetweenTwoPoints(point1)); //5.0
        System.out.println(point1.calculateDistanceFromOrigin()); //0.5
    }
}
