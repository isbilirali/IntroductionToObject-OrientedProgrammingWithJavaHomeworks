package ch06_this.circle4;
/*
3. Bir önceki bölümde ele aldığınız Circle/Daire sınıfındaki argümansız kurucuya this() çağrısı ekleyerek yarıçapı 10 olan daireyi oluşturmasını sağlayın
a. Sınıftaki argüman alan kurucuda this referansını kullanın
b. CircleTest/DaireTest sınıfında her iki kurucuyu da çağırarak nesneler oluşturup çevre ve alanlarını hesaplatın
 */
public class Circle {

    double radius;

    public Circle() {
        this(10);
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
