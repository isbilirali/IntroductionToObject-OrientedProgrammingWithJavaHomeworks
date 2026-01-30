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
public class Test {
    static void main() {
        SmartDevice sd = new SmartDevice("TV","Samsung",1500);
        sd.printInfo();
    }
}
