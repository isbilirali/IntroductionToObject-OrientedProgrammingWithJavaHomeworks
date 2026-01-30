package ch01_introduction.circle;

import java.util.Scanner;
/*
Bir Circle (ya da Daire) soyutlaması yapın.
• Böyle bir soyutlamanın hangi özellikleri ve davranışları olması
gerektiğini tartışın.
• Daha sonra main metoda sahip olan ve bu metotta Circle/Daire nesneleri
oluşturup üzerinde işlemler yapan CircleTest/DaireTest sınıfını oluşturun.
 */
public class CircleTest {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculates area and perimeter of a circle");
        System.out.print("Please enter radius : ");
        int radius = scanner.nextInt();

        Circle circle1 = new Circle();
        circle1.radius = radius;

        System.out.println("Area : " + circle1.calculateAreaOfCircle());
        System.out.println("Perimeter : " + circle1.calculatePerimeterOfCircle());



    }
}
