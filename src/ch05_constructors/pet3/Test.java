package ch05_constructors.pet3;
/*
1. Bir önceki bölümde modellediğiniz köpek ve sahibiyle ilgili oluşturduğunuz sınıflara kurucular ekleyin.
a. Köpek sınıfına, nesnesini, sahibini geçerek oluşturmanıza izin veren bir kurucu koyun
b. Sonra test sınıfını yazıp main metodunda nesnelerini oluşturup değerler atayın.
 */
public class Test {

    static void main() {

        Owner owner1 = new Owner("Lily","female",17);

        Pet pet1 = new Pet("dog","Bella","female",2,true,true,owner1);
        owner1.setPet(pet1);

        System.out.println(pet1.name + " is a " + pet1.kind + " and it is " + pet1.age + " years old. Also it is " + pet1.gender);
        System.out.println(pet1.name + " has a owner and her name is " + pet1.owner.name);
        System.out.println(owner1.name + " has a pet and its name is " + owner1.pet.name);
        System.out.println("Btw " + owner1.name + " is " + owner1.age + " years old.");
        System.out.println("*************************************************");
        owner1.walking();
        pet1.bark();

    }
}
