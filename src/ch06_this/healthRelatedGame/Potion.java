package ch06_this.healthRelatedGame;
/*
9. Hero and Potion isimli, sağlıkla ilgili bir oyunda kullanılacak iki sınıf oluşturun
1. Hero sınıfına usePotion(Potion p) metodunu ekleyin
2. Potion sınıfına, nesnenin sağlığını iyileştiren applyEffect(Hero h) metodu ekleyin
3. Hero sınıfının usePotion() metodunda, geçilen Potion nesnesi üzerinde applyEffect() metodunu çağrın
 */
public class Potion {

    int healthIncrease;

    public Potion(int healthIncrease) {
        this.healthIncrease = healthIncrease;
    }

    public int getHealthIncrease() {
        return healthIncrease;
    }

    public void setHealthIncrease(int healthIncrease) {
        this.healthIncrease = healthIncrease;
    }

    public void applyEffect(Hero h) {
        h.setHealth(h.getHealth() + healthIncrease);
    }
}
