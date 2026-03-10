package ch14_JavaAPI.emptyString;

/*
3. String sınıfının API dokümantasyonuna bakarak bir String
nesnesinin boş (empty) olup olmadığını nasıl anlarsınız? Kodunu yazıp test edin.
a. Benzer şekilde bir String nesnesinin sadece boşluktan (white space)
ibaret olup olmadığını nasıl anlarsınız? Kodunu yazıp test edin.
 */

// boolean isBlank() : Returns true if the string is empty or contains only white space codepoints, otherwise false.
// boolean isEmpty() : Returns true if, and only if, length() is 0.

public class Test {

    static void main() {

        String s1 = "Champion is Besiktas";
        String s2 = "        ";
        String s3 = "";

        System.out.println(s1.isBlank()); //false
        System.out.println(s1.isEmpty()); //false

        System.out.println(s2.isBlank()); //true
        System.out.println(s2.isEmpty()); //false

        System.out.println(s3.isBlank()); //true
        System.out.println(s3.isEmpty()); //true
    }
}
