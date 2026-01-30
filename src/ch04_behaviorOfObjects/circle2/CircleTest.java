package ch04_behaviorOfObjects.circle2;
/*
4. İlk bölümde oluşturduğunuz Circle (ya da Daire) sınıflarını son iki
bölümde öğrendikleriniz ışığında tekrar ele alın ele alın, Circle
sınıfındaki alanları ve metotları değerlendirin, gerekliyse yenilerini ekleyin
a. Daha sonra main metoda sahip olan ve bu metotta Circle/Daire nesneleri oluşturup
üzerinde işlemler yapan CircleTest/DaireTest sınıfını oluşturun.
 */
import java.util.Scanner;

public class CircleTest {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculates area and perimeter of a circle");
        System.out.print("Please enter radius : ");
        int radius = scanner.nextInt();

        Circle circle1 = new Circle();
        circle1.setRadius(radius);

        System.out.println("Area : " + circle1.calculateAreaOfCircle());
        System.out.println("Perimeter : " + circle1.calculatePerimeterOfCircle());

        System.out.print("Enter angle of slice : ");
        int angle = scanner.nextInt();
        System.out.println("Area of the slice : " + circle1.calcualteAreaOfSliceOfCircle(angle));



    }
}
