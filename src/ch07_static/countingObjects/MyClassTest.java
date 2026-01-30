package ch07_static.countingObjects;

public class MyClassTest {
    static void main() {
        MyClass ref1 = new MyClass("ref1");
        MyClass ref2 = new MyClass("ref2");
        MyClass ref3 = new MyClass("ref3");
        MyClass ref4 = new MyClass("ref4");
        MyClass ref5 = new MyClass("ref5");
        MyClass ref6 = new MyClass("ref6");
        MyClass ref7 = new MyClass("ref7");
        MyClass ref8 = new MyClass("ref8");
        MyClass ref9 = new MyClass("ref9");
        MyClass ref10 = new MyClass("ref10");

        System.out.println("Number of objects created : " + MyClass.howManyObjects());


    }
}
