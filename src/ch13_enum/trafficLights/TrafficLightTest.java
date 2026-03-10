package ch13_enum.trafficLights;

/*
1. Trafik ışıklarının renklerini, saniye olarak yanma süresine sahip enum ile betimleyin, test sınıfı yazın.
a. Ayrıca yukarıda tanımladığınız trafik ışık rengi cinsinden bir duruma sahip, trafik ışığını temsil eden bir sınıf geliştirin
b. Bu sınıfa bir sonraki renge geçmeyi temsil eden bir metot koyun ve yeşil->sarı->kırmızı olacak şekilde çalışmasını sağlayın

Sizce bu metodun gerçekleştirmesienum sabşiteler üzerinde başka bir metodu çağıracak şekilde tasarlansa nasıl olur?
->Renk geçiş mantığı enum içinde tutulur , Encapsulation ve sorumluluk dağılımı (responsibility) doğru yapılır , Kodun bakımı ve genişletilmesi kolaylaşır.
 */

public class TrafficLightTest {
    static void main() {
        TrafficLight trafficLight = new TrafficLight(LightColor.GREEN);

        trafficLight.printInfo();
        trafficLight.next();
        trafficLight.printInfo();
        trafficLight.next();
        trafficLight.printInfo();
    }
}
