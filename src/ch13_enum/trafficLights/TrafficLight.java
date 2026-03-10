package ch13_enum.trafficLights;

/*
1. Trafik ışıklarının renklerini, saniye olarak yanma süresine sahip enum ile betimleyin, test sınıfı yazın.
a. Ayrıca yukarıda tanımladığınız trafik ışık rengi cinsinden bir duruma sahip, trafik ışığını temsil eden bir sınıf geliştirin
b. Bu sınıfa bir sonraki renge geçmeyi temsil eden bir metot koyun ve yeşil->sarı->kırmızı olacak şekilde çalışmasını sağlayın

Sizce bu metodun gerçekleştirmesienum sabşiteler üzerinde başka bir metodu çağıracak şekilde tasarlansa nasıl olur?
->Renk geçiş mantığı enum içinde tutulur , Encapsulation ve sorumluluk dağılımı (responsibility) doğru yapılır , Kodun bakımı ve genişletilmesi kolaylaşır.
 */

public class TrafficLight {
    private LightColor color;

    public TrafficLight(LightColor color){
        this.color = color;
    }

    public LightColor getColor() {
        return color;
    }

    public void next(){
        if(color == LightColor.GREEN){
            color = LightColor.YELLOW;
        } else if (color == LightColor.YELLOW){
            color = LightColor.RED;
        } else {
            color = LightColor.GREEN;
        }
    }

    public void printInfo(){
        System.out.println("Color is " + color + " and time is " + color.getTime() + " sec.");
    }
}
