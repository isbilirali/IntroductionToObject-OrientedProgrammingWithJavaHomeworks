package ch07_static.countingObjects;

public class MyClass {
    String name;
    static int count = 0;

    public MyClass(String name) {
        this.name = name;
        count++;
    }

    static int howManyObjects(){
        return count;
    }
}
