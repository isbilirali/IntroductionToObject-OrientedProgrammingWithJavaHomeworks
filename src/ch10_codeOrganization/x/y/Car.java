package ch10_codeOrganization.x.y;

/*
Car ve CarTest sınıflarına, IDE kullanmadan, gerekli package ve import cümlelerini koyarak, aşağıdaki gibi bir paket yapısına sahip olmalarını sağlayın.
Car.java ve CarTest.java sınıflarını -d seçeneği ve *.java derleyin ve class dosyalarının bin dizini altında paket yapısına uygun bir dizine sahip olmalarını sağlayın.
• Sonra bin dizinini silin.
• Önce Car.java’yı -d seçeneği ile derleyin ve paket yapısına uygun bir dizin yapısı oluşmasını sağlayın.
• Sonra benzer şekilde CarTest.java sınıfını -d seçeneği ile derleyin.
• Ne sonuç aldınız?
 */
public class Car {

    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;

    public double go(int newDistance) {
        distance += newDistance;
        double period = (double) newDistance / speed;
        return period;
    }

    public void accelerate(int newSpeed) {
        speed = newSpeed;
    }

    public void stop() {
        speed = 0;
    }

    public String getInfo() {
        String info = "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
        return info;
    }
}
