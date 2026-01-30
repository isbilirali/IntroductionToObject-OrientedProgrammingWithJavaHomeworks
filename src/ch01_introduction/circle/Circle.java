package ch01_introduction.circle;
/*
Bir Circle (ya da Daire) soyutlaması yapın.
• Böyle bir soyutlamanın hangi özellikleri ve davranışları olması
gerektiğini tartışın.
• Daha sonra main metoda sahip olan ve bu metotta Circle/Daire nesneleri
oluşturup üzerinde işlemler yapan CircleTest/DaireTest sınıfını oluşturun.
 */
public class Circle {

    int radius;

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
