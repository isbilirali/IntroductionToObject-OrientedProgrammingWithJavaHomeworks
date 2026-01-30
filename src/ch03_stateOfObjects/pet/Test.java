package ch03_stateOfObjects.pet;
/*
2. İnsanların besledikleri köpekleri nasıl modellersiniz? Sadece alanlarla
modellerseniz, hangi alanların olmasını beklersiniz?Alanların isimleri ve
tippleri ne olur?
a. Uygun sınıfı seçtiğiniz uygun isimde ve tipli alanlarla yazın.
b. Sonra test sınıfını yazıp main metodunda nesnelerini oluşturup
değerler atayın.

3. Bir önceki soruda modellediğiniz köpeklerin sahipleri olması
durumunu nasıl modellersiniz? Sadece alanları göz önüne alırsanız,
sahiplerini nasıl bir sınıfla ve hangi alanlarla modellersiniz? Alanların
isim ve tipleri ne olur?
a. Uygun sınıfı seçtiğiniz uygun isimde ve tiple alanlarla yazın.
b. Köpeklerle sahipleri arasındaki ilişkiyi 1-1 düşünerek modelleyin.
c. Sonra test sınıfını yazıp main metodunda nesnelerini oluşturup
değerler atayın.
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

        owner1.pet = pet1;
        pet1.owner = owner1;

        System.out.println(pet1.name + " is a " + pet1.kind + " and it is " + pet1.age + " years old. Also it is " + pet1.gender);
        System.out.println(pet1.name + " has a owner and her name is " + pet1.owner.name);
        System.out.println(owner1.name + " has a pet and its name is " + owner1.pet.name);
        System.out.println("Btw " + owner1.name + " is " + owner1.age + " years old.");

    }
}
