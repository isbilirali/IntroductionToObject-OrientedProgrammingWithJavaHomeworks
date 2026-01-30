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
public class Test {

    static void main() {

        Pet pet1 = new Pet();
        pet1.kind = "dog";
        pet1.name = "Bella";
        pet1.gender = "female";
        pet1.age = 2;
        pet1.vaccination = true;
        pet1.isNeutered = true;

        Owner owner1 = new Owner();
        owner1.name = "Lily";
        owner1.gender = "female";
        owner1.age = 17;

        owner1.setPet(pet1);
        pet1.setOwner(owner1);

        System.out.println(pet1.name + " is a " + pet1.kind + " and it is " + pet1.age + " years old. Also it is " + pet1.gender);
        System.out.println(pet1.name + " has a owner and her name is " + pet1.owner.name);
        System.out.println(owner1.name + " has a pet and its name is " + owner1.pet.name);
        System.out.println("Btw " + owner1.name + " is " + owner1.age + " years old.");
        System.out.println("*************************************************");
        owner1.walking();
        pet1.bark();

    }
}
