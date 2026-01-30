package ch05_constructors.pet3;
/*
1. Bir önceki bölümde modellediğiniz köpek ve sahibiyle ilgili oluşturduğunuz sınıflara kurucular ekleyin.
a. Köpek sınıfına, nesnesini, sahibini geçerek oluşturmanıza izin veren bir kurucu koyun
b. Sonra test sınıfını yazıp main metodunda nesnelerini oluşturup değerler atayın.
 */
public class Pet {
    String kind;
    String name;
    String gender;
    int age;
    boolean vaccination;
    boolean isNeutered;
    Owner owner;

    public Pet() {
    }

    public Pet(String kind, String name, String gender, int age, boolean vaccination, boolean isNeutered) {
        this.kind = kind;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.vaccination = vaccination;
        this.isNeutered = isNeutered;
    }

    public Pet(String kind, String name, String gender, int age, boolean vaccination, boolean isNeutered, Owner owner) {
        this.kind = kind;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.vaccination = vaccination;
        this.isNeutered = isNeutered;
        this.owner = owner;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    public boolean isVaccination() {
        return vaccination;
    }

    public void setVaccination(boolean vaccination) {
        this.vaccination = vaccination;
    }

    public boolean isNeutered() {
        return isNeutered;
    }

    public void setNeutered(boolean neutered) {
        isNeutered = neutered;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    boolean vaccinated() {
        if(!vaccination) {
            vaccination = true;
            return true;
        } else {
            System.out.println("Already vaccinated");
            return false;
        }
    }

    boolean neuter(){
        if(!isNeutered) {
            isNeutered = true;
            return true;
        } else {
            System.out.println("Already neutered");
            return false;
        }
    }

    void bark(){
        System.out.println("HAV HAV!");
    }

    void pee(){}

    void poop(){}

    void sleep(){
        System.out.println("zzzzzzzz...");
    }

    void wakeUp(){}

    void eat(){}

    void drink(){}

    void sit(){}

    void run(){}

    void lieDown(){}

}
