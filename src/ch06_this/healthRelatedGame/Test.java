package ch06_this.healthRelatedGame;
/*
9. Hero and Potion isimli, sağlıkla ilgili bir oyunda kullanılacak iki sınıf oluşturun
1. Hero sınıfına usePotion(Potion p) metodunu ekleyin
2. Potion sınıfına, nesnenin sağlığını iyileştiren applyEffect(Hero h) metodu ekleyin
3. Hero sınıfının usePotion() metodunda, geçilen Potion nesnesi üzerinde applyEffect() metodunu çağrın
 */
public class Test {

    static void main() {
        Hero hero = new Hero(50);
        Potion potion = new Potion(25);
        System.out.println(hero.getHealth()); //50
        hero.usePotion(potion);
        System.out.println(hero.getHealth()); //75
    }
}
