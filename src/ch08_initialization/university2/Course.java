package ch08_initialization.university2;

import java.util.Date;

//university.Test sınıfını kullanarak sınıfların ve nesnelerin başlatma sırasını tahmin edin.

public class Course {
   // String code;
    String name;
    Department department;
    Professor teacher;
    Student[] students;
    String[] days;
    Date time;

    static String message;

    static{
     message = "Course Class Loading.....";
     System.out.println(message);
    }
 public Course() {
  System.out.println("in class Course");
 }
}
