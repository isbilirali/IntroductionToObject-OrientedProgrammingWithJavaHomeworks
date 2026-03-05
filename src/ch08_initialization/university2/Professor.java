package ch08_initialization.university2;

//university.Test sınıfını kullanarak sınıfların ve nesnelerin başlatma sırasını tahmin edin.

public class Professor {
    //String no;
    String name;
    //String dob;
    //String rank;
    Department department;
    Student[] advisee;
    Course[] coursesGiven;

    static String message;

    static{
        message = "Professor Class Loading.....";
        System.out.println(message);
    }

    public Professor(){
        System.out.println("in class Professsor");
    }
}
