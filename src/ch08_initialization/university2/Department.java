package ch08_initialization.university2;

//university.Test sınıfını kullanarak sınıfların ve nesnelerin başlatma sırasını tahmin edin.

public class Department {
    String name;
    Professor head;
    Course[] courses;
    Student[] students;

    static String message;

    static{
        message = "Department Class Loading.....";
        System.out.println(message);
    }

    public Department(){
        System.out.println("in class Department");
    }
}
