package ch06_this.player;
/*
8. Bir oyunda kullanılacak ve health, mana, and username alanlarına sahip bir Player sınıfı oluşturun ve
uygun kurucu ve setter metotlarını koyun, mümkün olan yerlerde this referansını kullanın
a. Kurucu ve setter metotlarında this referansını kullanın
 */
public class Player {
    int health;
    int mana;
    String username;

    public Player() {
    }

    public Player(int health, int mana) {
        this.health = health;
        this.mana = mana;
    }

    public Player(int health ,int mana, String username) {
        this(health,mana);
        this.username = username;
    }
}
