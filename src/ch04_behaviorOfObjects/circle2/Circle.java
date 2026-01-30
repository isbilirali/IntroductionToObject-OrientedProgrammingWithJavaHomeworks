package ch04_behaviorOfObjects.circle2;
/*
4. İlk bölümde oluşturduğunuz Circle (ya da Daire) sınıflarını son iki
bölümde öğrendikleriniz ışığında tekrar ele alın ele alın, Circle
sınıfındaki alanları ve metotları değerlendirin, gerekliyse yenilerini ekleyin
a. Daha sonra main metoda sahip olan ve bu metotta Circle/Daire nesneleri oluşturup
üzerinde işlemler yapan CircleTest/DaireTest sınıfını oluşturun.
 */
public class Circle {

    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
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
