package ch04_behaviorOfObjects.coordinateSystem2;
/*
3. Bir önceki bölümde modellediğiniz iki boyutlu bir ortamda bir nokta
soyutlamasına davranışlar da ekleyin. Örneğin, noktanın merkeze
(origin) olan uzaklığı ile geçilen bir başka noktaya olan uzaklığını
hesaplayıp döndüren metotları sınıfa ekleyin.
a. Test sınıfının main metodunda, birisi merkezi (origin) temsil eden 3 nokta oluşturup üzerlerinde metot çağrıları yapın
 */
public class Test {
    static void main() {
        Point point1 = new Point();
        point1.setX(3);
        point1.setY(4);

        Point point2 = new Point();
        point2.setX(8);
        point2.setY(15);

        Point point3 = new Point();
        point3.setX(5);
        point3.setY(12);

        System.out.println("Area of the triangle between 3 points  :  " +
                point1.calculateAreaOfTriangleBetweenThreePoints(point2,point3));

        Point origin = new Point();
        origin.setX(0);
        origin.setY(0);

        System.out.println(origin.calculateDistanceFromOrigin()); //0.0

        System.out.println(origin.calculateDistanceBetweenTwoPoints(point1)); //5.0
        System.out.println(point1.calculateDistanceFromOrigin()); //0.5
    }
}
