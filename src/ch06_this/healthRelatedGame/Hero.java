package ch06_this.healthRelatedGame;
/*
9. Hero and Potion isimli, sağlıkla ilgili bir oyunda kullanılacak iki sınıf oluşturun
1. Hero sınıfına usePotion(Potion p) metodunu ekleyin
2. Potion sınıfına, nesnenin sağlığını iyileştiren applyEffect(Hero h) metodu ekleyin
3. Hero sınıfının usePotion() metodunda, geçilen Potion nesnesi üzerinde applyEffect() metodunu çağrın
 */
public class Hero {

    int health;

    public Hero(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public void usePotion(Potion p) {
        p.applyEffect(this);
    }
}
