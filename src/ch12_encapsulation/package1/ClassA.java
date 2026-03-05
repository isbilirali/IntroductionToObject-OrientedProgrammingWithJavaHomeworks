package ch12_encapsulation.package1;

import ch12_encapsulation.package2.ClassX;

public class ClassA {

    public int a1 = 5;
    public static int a2 = 5;
    int b1 = 6;
    static int b2 = 6;
    protected int c1 = 7;
    protected static int c2 = 7;
    private int d1 = 8;
    private static int d2 = 8;

    static void main() {

        //same package & static alanlara ulaşım*****************************************************************************
        System.out.println(ClassB.a2); //public static
        System.out.println(ClassB.b2); //default static
        System.out.println(ClassB.c2); //protected static
        //System.out.println(ClassB.d2); //java: d2 has private access in ch12.blabla1.ClassB



        //same package & nesne alanlarına ulaşım****************************************************************************
        ClassB classb = new ClassB();
        System.out.println(classb.a1); //public
        System.out.println(classb.b1); //default
        System.out.println(classb.c1); //protected
        //System.out.println(classb.d1); //java: d1 has private access in ch12.blabla1.ClassB



        //diff package (import) & static alanlarına ulaşım*******************************************************
        System.out.println(ClassX.a2);
        //System.out.println(ClassX.b2); //java: b2 is not public in ch12.blabla2.ClassX; cannot be accessed from outside package
        //System.out.println(ClassX.c2); //java: c2 has protected access in ch12.blabla2.ClassX
        //System.out.println(ClassX.d2); //java: d2 has private access in ch12.blabla2.ClassX



        //diff package (import) & nesne alanlarına ulaşım********************************************************
        ClassX classx = new ClassX();
        System.out.println(classx.a1);
        //System.out.println(classx.b1); //java: b1 is not public in ch12.blabla2.ClassX; cannot be accessed from outside package
        //System.out.println(classx.c1); //java: c1 has protected access in ch12.blabla2.ClassX
        //System.out.println(classx.d1); //java: d1 has private access in ch12.blabla2.ClassX

    }
}
