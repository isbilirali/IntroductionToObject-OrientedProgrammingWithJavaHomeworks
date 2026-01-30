package ch03_stateOfObjects.university;
import java.util.Date;
/*
1. Üniversite örneğindeki Test sınıfının main metoduna aşağıdaki eklemeleri yapın:
• Bir yeni bölüm, örneğin Philosophy,
• Yeni iki profesör, örneğin Ali Veli ve Ayşe Fatma
• Yeni iki ders, örneğin Ethics ve Ontology
• Yeni üç öğrenci, Zeynep Gül, Metin Sağlam ve Murat Atılgan
• Ve bu yeni nesneler arasında ilişkiler kurun.
 */
public class Course {
   // String code;
    String name;
    Department department;
    Professor teacher;
    Student[] students;
    String[] days;
    Date time;
}
