package ch12_encapsulation.thermostat;

/*
3. double tipinde bir temperature alanına sahip bir Thermostat sınıfı
oluşturun. Bu sınıfın nesnelerinin temperature alanına değer
atanmasına izin vermelidir fakat bu atanan değerin sadece -5 ile 40
derece arasında olmasını sağlayın, farklı değerler için nesne hata
vermelidir.
 */

public class Thermostat {

    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if(temperature>40 || temperature<-5){
            System.out.println("Error");
        } else{
            System.out.println("Succeed");
            this.temperature = temperature;
        }
    }
}
