package ch04_behaviorOfObjects.pet2;
/*
1. Bir önceki bölümde modellediğiniz köpek sınıfına davranışlar da ekleyin.
Hangi davranışları eklemeyi düşünürdünüz? Bu davranışların arayüzünü ve gerçekleştirmesini belirleyip sınıfta kodlayın
a. Sonra test sınıfını yazıp main metodunda nesnelerini oluşturup değerler atayın.

2. Köpeklerin sahiplerine hangi davranışları koymayı düşünürdünüz?
a. Uygun metotları sınıfa ekleyin.
b. Köpeklerle sahipleri arasındaki ilişkiyi 1-1 düşünerek modelleyin.
c. Sonra test sınıfını yazıp main metodunda nesnelerini oluşturup değerler atayın, metotlarını çağırın.
 */
public class Pet {
    String kind;
    String name;
    String gender;
    int age;
    boolean vaccination;
    boolean isNeutered;
    Owner owner;

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
