package ch06_this.coordinateSystem4;
/*
2. Bir önceki bölümdeki iki boyutlu bir ortamda bir noktayı temsil eden sınıfın kurucularına this() çağrıları ekleyin.Sınıftaki argüman alan kurucuda this referansını kullanın.
a. Test sınıfının main metodunda, birisi merkezi (origin) temsil eden 3 noktayı kurucu çağrılarıyla oluşturup üzerlerinde metot çağrıları yapın
 */
public class Point {

    int X;
    int Y;

    public Point() {
        this(0,0);
    }

    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    double calculateDistanceFromOrigin(){
        return Math.sqrt(Math.pow(X,2)+Math.pow(Y,2));
    }

    double calculateDistanceBetweenTwoPoints(Point point2){
        return Math.sqrt(Math.pow(this.X -point2.X,2)+Math.pow(this.Y -point2.Y,2));
    }

    double calculateAreaOfTriangleBetweenThreePoints(Point point2 , Point point3){
        double a = (this.X * point2.Y) + (point2.X * point3.Y) + (point3.X * this.Y);
        double b = (point2.X * this.Y) + (point3.X * point2.Y) + (this.X * point3.Y);
        return 0.5*Math.abs(a-b);
    }
}
