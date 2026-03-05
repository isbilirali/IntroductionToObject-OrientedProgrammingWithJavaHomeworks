package ch06_this.passwordApp;

import java.util.Scanner;
/*
11. Şifreyi temsil eden bir Password sınıfı modelleyin. Şifrenin uzunluğunun en başta belirlendiğini ve
sonrasında karakter ekleyerek oluşturulduğunu düşünün. Bu amaçla şifreye, uzunluğu sayısınca geçilen
karakterleri ekleyerek oluşturan PasswordBuilder gibi bir sınıfa ihtiyaç olacaktır.
PasswordBuilder’i kullanarak aşağıdaki gibi Password nesnesini oluşturacak şekilde bu iki sınıfı geliştirin:
Password password = new PasswordBuilder().setLength(length).
add(ch1).add(ch2).add(ch3)...build();
a. Test sınıfının main metodunda gerekli testleri yazın.
 */
public class Test {

    static void main() {

        Password password = new PasswordBuilder().setLength(3).add('b').add('j').add('k').build();
        System.out.println("Created password : " + new String(password.getPassword()) );

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("This program creates a basic password and takes characters one by one from user. ");
//        System.out.print("How many characters will be? : ");
//        int length = scanner.nextInt();
//        PasswordBuilder pb = new PasswordBuilder().setLength(length);
//        for(int i = 0 ; i<length ; i++){
//            System.out.print(i+1 + ". character : ");
//            char c = scanner.next().charAt(0);
//            pb.add(c); //calling for side-effect
//        }
//        Password p = pb.build();
//        System.out.println("Created password : " + new String(p.getPassword()) );
    }
}
