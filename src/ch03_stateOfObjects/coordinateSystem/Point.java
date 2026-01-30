package ch03_stateOfObjects.coordinateSystem;
/*
4. İki boyutlu bir ortamda bir noktayı nasıl modellersiniz? Belirlediğiniz alanlara varsayılan bir değer atamak konusunda ne düşünürsünüz?
a. Test sınıfının main metodunda, birisi merkezi (origin) temsil eden 3 nokta oluşturup aralarındaki uzaklıkları hesaplayın.
 */
public class Point {

    public int X;
    public int Y;

    double calculateDistanceFromOrigin(){
        return Math.sqrt(Math.pow(X,2)+Math.pow(Y,2));
    }

    double calculateDistanceBetweenTwoPoints(Point point2){
        return Math.sqrt(Math.pow(X -point2.X,2)+Math.pow(Y -point2.Y,2));
    }

    double calculateAreaOfTriangleBetweenThreePoints(Point point2 , Point point3){

        double a = (this.X * point2.Y) + (point2.X * point3.Y) + (point3.X * this.Y);
        double b = (point2.X * this.Y) + (point3.X * point2.Y) + (this.X * point3.Y);
        return 0.5*Math.abs(a-b);


    }
}
