package ch12_encapsulation.thermostat;

/*
3. double tipinde bir temperature alanına sahip bir Thermostat sınıfı
oluşturun. Bu sınıfın nesnelerinin temperature alanına değer
atanmasına izin vermelidir fakat bu atanan değerin sadece -5 ile 40
derece arasında olmasını sağlayın, farklı değerler için nesne hata
vermelidir.
 */

public class ThermostatTest {

    static void main() {
        Thermostat t = new Thermostat();

        t.setTemperature(10);
        t.setTemperature(-6);
        t.setTemperature(41);
    }
}
