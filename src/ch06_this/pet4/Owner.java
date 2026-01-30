package ch06_this.pet4;

/*
1. Bir önceki bölümde modellediğiniz köpek ve sahibiyle ilgili oluşturduğunuz sınıflara kurucularına this() çağrıları ekleyin
a. Sonra test sınıfını yazıp main metodunda nesnelerini oluşturup değerler atayın.
 */
public class Owner {
    String name;
    String gender;
    int age;
    Pet pet;

    public Owner() {
    }

    public Owner(String gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public Owner(String name, String gender, int age, Pet pet) {
        this(name,gender,age);
        this.pet = pet;
        pet.setOwner(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    void feed(){}

    void fillWater(){}

    void walking(){
        System.out.println("Let's go " + pet.name + "!");
    }

    void love(){}

    void cleanSand(){}

    void playWithPet(){}
}
