package ch04_behaviorOfObjects.bulb;
/*
6. Elektrikle çalışan bir lambayı ya da ampülü (bulb) modelleyin:
a. Lamba açık mı kapalı mı, parlaklığı vb. özellikleri kullanarak uygun metotların imzalarını/arayüzlerini belirleyin ve gerçekleştirin
b. Sonra test sınıfını yazıp main metotta nesnelerini oluşturup üzerinde metot çağrıları yapın
 */
public class Bulb {

    boolean isOpen = false;
    int brightness = 0; //between 0-100

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
        brightness = isOpen ? 50 : 0;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if(brightness <= 100 && brightness > 0){
            this.brightness = brightness;
        } else {
            System.out.println("Unvalid Process!");
        }
    }

    boolean turnOn(){
        if(!isOpen){
            isOpen = true;
            brightness = 50;
            return true;
        } else {
            System.out.println("Already on.");
            return false;
        }
    }

    boolean turnOff(){
        if(isOpen){
            isOpen = false;
            brightness = 0;
            return true;
        } else {
            System.out.println("Already off.");
            return false;
        }
    }

    boolean increaseBrightness(int jump){
        isOpen = true;
        if(brightness<100) {
            brightness += jump;
            if (brightness > 100){
                brightness = 100;
            }
            return true;
        } else {
            System.out.println("Already at full.");
            return false;
        }
    }

    boolean reduceBrightness(int fall){
        if(brightness>0) {
            brightness -= fall;
            if (brightness <= 0){
                brightness = 0;
                isOpen = false;
            }
            return true;
        } else {
            System.out.println("Already zero.");
            isOpen = false;
            return false;
        }
    }

    void printInfo(){
        System.out.println();
        System.out.println("is open? : " + isOpen);
        System.out.println("Brightness : " + brightness);
        System.out.println();
    }


}
