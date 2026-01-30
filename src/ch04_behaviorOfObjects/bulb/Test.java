package ch04_behaviorOfObjects.bulb;
/*
6. Elektrikle çalışan bir lambayı ya da ampülü (bulb) modelleyin:
a. Lamba açık mı kapalı mı, parlaklığı vb. özellikleri kullanarak uygun metotların imzalarını/arayüzlerini belirleyin ve gerçekleştirin
b. Sonra test sınıfını yazıp main metotta nesnelerini oluşturup üzerinde metot çağrıları yapın
 */
public class Test {

    static void main() {
        Bulb bulb1 = new Bulb();
        bulb1.printInfo(); //default values -> is open : false , brightness : 0

        bulb1.setOpen(true);
        bulb1.printInfo(); //is open : true , brightness : 50

        bulb1.setOpen(false);
        bulb1.printInfo(); //is open : false , brightness : 0

        bulb1.increaseBrightness(66);
        bulb1.printInfo(); //is open : true , brightness : 66

        bulb1.increaseBrightness(400);
        bulb1.printInfo(); //is open : true , brightness : 100

        bulb1.increaseBrightness(1); //already at full.
        bulb1.printInfo(); //is open : true , brightness : 100

        bulb1.reduceBrightness(40);
        bulb1.printInfo(); //is open : true , brightness : 60

        bulb1.reduceBrightness(500);
        bulb1.printInfo(); //is open : false , brightness : 0

        bulb1.reduceBrightness(1); //Already zero.
        bulb1.printInfo(); //is open : false , brightness : 0



    }
}
