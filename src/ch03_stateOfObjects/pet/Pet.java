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
public class Pet {
    String kind;
    String name;
    String gender;
    int age;
    boolean vaccination;
    boolean isNeutered;
    Owner owner;

}
