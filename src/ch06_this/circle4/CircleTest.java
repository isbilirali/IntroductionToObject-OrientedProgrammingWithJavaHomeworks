package ch06_this.circle4;
import java.util.Scanner;
/*
3. Bir önceki bölümde ele aldığınız Circle/Daire sınıfındaki argümansız kurucuya this() çağrısı ekleyerek yarıçapı 10 olan daireyi oluşturmasını sağlayın
a. Sınıftaki argüman alan kurucuda this referansını kullanın
b. CircleTest/DaireTest sınıfında her iki kurucuyu da çağırarak nesneler oluşturup çevre ve alanlarını hesaplatın
 */
public class CircleTest {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculates area and perimeter of a circle");
        System.out.print("Please enter radius : ");
        double radius = scanner.nextDouble();

        Circle circle1 = new Circle(radius);
//        circle1.setRadius(radius);

        System.out.println("Area : " + circle1.calculateAreaOfCircle());
        System.out.println("Perimeter : " + circle1.calculatePerimeterOfCircle());

        System.out.print("Enter angle of slice : ");
        int angle = scanner.nextInt();
        System.out.println("Area of the slice : " + circle1.calcualteAreaOfSliceOfCircle(angle));



    }
}
