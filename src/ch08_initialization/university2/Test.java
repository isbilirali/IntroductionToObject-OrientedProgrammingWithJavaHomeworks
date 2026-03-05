package ch08_initialization.university2;

//university.Test sınıfını kullanarak sınıfların ve nesnelerin başlatma sırasını tahmin edin.

public class Test {
    public static void main(String[] args) {

        Department department1 = new Department();
        department1.name = "Software Engineering";

        Professor professor1 = new Professor();
        professor1.name = "Ahmet Arslan";

        Course course1 = new Course();
        course1.name = "Int. to Software Engineering";

        Student student1 = new Student();
        student1.name = "Akin Kaldiroglu";

        // Head of Software Engineering department is Ahmet Arslan and consequently his department is Software Engineering.
        department1.head = professor1;
        professor1.department = department1;

        // Department of Int. to Software Engineering course is Software Engineering and consequently the course
        // Int. to Software Engineering belongs to Software Engineering department.
        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;

        course1.teacher = professor1;
        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;

        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;
        student1.advisor = professor1;

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;

        course1.students = new Student[100];
        course1.students[0] = student1;

        System.out.println("Name of student student1's first course is " + student1.coursesTaken[0].name);
        System.out.println("Name of student student1's first course's professor is " + student1.coursesTaken[0].teacher.name);
        System.out.println("Name of student student1's first course's professor's department is " + student1.coursesTaken[0].teacher.department.name);

        Department department2 = new Department();
        department2.name = "Philosophy";

        Professor professor2 = new Professor();
        professor2.name = "Ali Veli";

        Professor professor3 = new Professor();
        professor3.name = "Ayşe Fatma";

        Course course2 = new Course();
        course2.name = "Ethics";

        Course course3 = new Course();
        course3.name = "Ontology";

        Student student2 = new Student();
        student2.name = "Zeynep Gül";

        Student student3 = new Student();
        student3.name = "Metin Sağlam";

        Student student4 = new Student();
        student4.name = "Murat Atılgan";

        //department --------- course
        department2.courses = new Course[5];
        department2.courses[0] = course2;
        course2.department = department2;
        department2.courses[1] = course3;
        course3.department = department2;

        //department ------ professor
        department2.head = professor2;
        professor2.department = department2;
        professor3.department = department2;

        //department ----- student
        department2.students = new Student[100];
        department2.students[0] = student2;
        student2.department = department2;
        department2.students[1] = student3;
        student3.department = department2;
        department2.students[2] = student4;
        student4.department = department2;

        //course ------ professor
        professor2.coursesGiven = new Course[5];
        professor3.coursesGiven = new Course[5];
        course2.teacher = professor2;
        professor2.coursesGiven[0] = course2;
        course3.teacher = professor3;
        professor3.coursesGiven[0] = course3;

        //course ------- student
        course2.students = new Student[40];
        course3.students = new Student[40];
        student2.coursesTaken = new Course[7];
        student3.coursesTaken = new Course[7];
        student4.coursesTaken = new Course[7];
        course2.students[0] = student2;
        student2.coursesTaken[0] = course2;
        course2.students[1] = student3;
        student3.coursesTaken[0] = course2;
        course2.students[2] = student4;
        student4.coursesTaken[0] = course2;

        course3.students = new Student[40];
        course3.students[0] = student2;
        student2.coursesTaken[1] = course3;
        course3.students[1] = student3;
        student3.coursesTaken[1] = course3;
        course3.students[2] = student4;
        student4.coursesTaken[1] = course3;

        //student ------- professor
        professor2.advisee = new Student[10];
        professor3.advisee = new Student[10];
        student2.advisor = professor2;
        professor2.advisee[0] = student2;
        student3.advisor = professor2;
        professor2.advisee[1] = student3;

        student4.advisor = professor3;
        professor3.advisee[0] = student4;








    }
}
