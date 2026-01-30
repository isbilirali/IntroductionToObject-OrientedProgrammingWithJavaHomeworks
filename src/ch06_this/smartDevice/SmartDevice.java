package ch06_this.smartDevice;
/*
6. SmartDevice isimli bir sınıf oluşturun ve üzerine brand, model ve price alanlarını koyun ve aşağıdaki kurucuları ekleyin:
• Üç parametrenin tümünü alan bir kurucu
• Yalnızca brand ve model alan bir yapıcı, bu durumda price’ın değeri $100,00 olarak belirlensin
• brand değerini “Unknown” ve model değerini “Generic” olarak atayan parametresiz bir kurucu
• İkinci ve üçüncü kurucularda this() çağrısını kullanın

7. Bir önceki sorudaki SmartDevice isimli bir sınıf kurucularındaki this() çağrılarından önce nesnenin alanlarına ulaşmaya çalışın,
hem okuyun hem atama yapın
• Mümkünse bu kodu hem Java 25 hem de öncesindeki sürümlerle örneğin Java 21 ile derleyin.
 */
public class SmartDevice {
    String brand;
    String model;
    int price;

    public SmartDevice() {
        this("Generic","Unknown");
    }

    public SmartDevice(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public SmartDevice(String model ,String brand, int price) {
        //printInfo();  //Compile time error.
       this(model,brand);
       this.price = price;
       printInfo(); //It's OK.
    }

    public void printInfo(){
        System.out.println("Model : " + model);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price + "$");
        System.out.println();
    }
}
