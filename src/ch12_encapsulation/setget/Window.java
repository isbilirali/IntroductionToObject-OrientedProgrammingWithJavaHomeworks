package ch12_encapsulation.setget;

/*
hangisi nesne merkezli programlama açısından daha sağlıklıdır?
a. Aynı işi yapan iki metot, WindowTest’in printWindowInfo() ve Window’un printInfo() metotları.
b. Aynı işi yapan iki metot, WindowTest’in calculateWindowArea() ve Window’un calculateArea() metotları.
->Nesneyle ilgili işlemler nesnenin kendi sınıfında olmalıdır. Window.printInfo() ve Window.calculateArea() daha doğrudur.

hangisi nesne merkezli programlama açısından daha sağlıklıdır?
• Aynı işi yapan Window’un setOpen() metodu ile open() ve close() metotları.
->open() ve close() metotları daha sağlıklıdır.(daha okunabilir-davranış odaklı-OOP prensiplerine daha uygun-genişletilebilir)
->OOP’de nesneler durum değiştiren davranışlara sahip olmalıdır. open() bir davranışı temsil eder ama setOpen(true) sadece değer ataması yapar.
 */

public class Window {
    private boolean open;
    private int width;
    private int height;

    public Window() {
    }

    public Window(boolean open, int width, int height) {
        this.open = open;
        this.width = width;
        this.height = height;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void open(){
        open = true;
    }

    public void close(){
        open = false;
    }

    public int calculateArea() {
        return height * width;
    }

    public void printInfo() {
        System.out.println("Window [open=" + open + ", width=" + width + ", height=" + height + "]");
    }
}

