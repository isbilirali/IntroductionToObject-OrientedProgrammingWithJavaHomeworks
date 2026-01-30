package ch05_constructors.circle3;
/*
3. Bir önceki bölümde ele aldığınız Circle/Daire sınıfına iki tane kurucu koyun:
a. Yarıçapı 10 yapan bir varsayılan kurucu
b. Geçilen double değeri yarıçapa atayan bir akıllı kurucu
c. CircleTest/DaireTest sınıfında her iki kurucuyu da çağırarak nesneler oluşturup çevre ve alanlarını hesaplatın.
 */
public class Circle {

    double radius;

    public Circle() {
        radius = 10;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateAreaOfCircle(){
        return Math.PI*radius*radius;
    }

    public double calculatePerimeterOfCircle(){
        return 2*Math.PI*radius;
    }

    public double calcualteAreaOfSliceOfCircle(int angle){
        return Math.PI*radius*radius*angle/360;
    }



}
