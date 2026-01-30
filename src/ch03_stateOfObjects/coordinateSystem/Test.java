package ch03_stateOfObjects.coordinateSystem;
/*
4. İki boyutlu bir ortamda bir noktayı nasıl modellersiniz? Belirlediğiniz alanlara varsayılan bir değer atamak konusunda ne düşünürsünüz?
a. Test sınıfının main metodunda, birisi merkezi (origin) temsil eden 3 nokta oluşturup aralarındaki uzaklıkları hesaplayın.
 */
public class Test {

    static void main() {

        Point point1 = new Point();
        point1.X = 3;
        point1.Y = 4;

        Point point2 = new Point();
        point2.X = 8;
        point2.Y = 15;

        Point point3 = new Point();
        point3.X = 5;
        point3.Y = 12;

        System.out.println("Area of the triangle between 3 points  :  " + point1.calculateAreaOfTriangleBetweenThreePoints(point2,point3));
    }
}
