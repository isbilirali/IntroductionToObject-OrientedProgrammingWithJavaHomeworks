package ch08_initialization.university2;

//university.Test sınıfını kullanarak sınıfların ve nesnelerin başlatma sırasını tahmin edin.

public class Student {
    //String no;
    String name;
    //String dob;
    Department department;
    Professor advisor;
    Course[] coursesTaken;

    static String message;

    static{
        message = "Student Class Loading.....";
        System.out.println(message);
    }

    public Student(){
        System.out.println("in class Student");
    }
}
