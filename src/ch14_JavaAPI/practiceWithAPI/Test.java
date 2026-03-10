package ch14_JavaAPI.practiceWithAPI;

import java.util.StringTokenizer;

/*
Java API’sinde bulunan bir sınıfı kullanarak, bir yazıda geçen tüm kelimeleri bulun.
• Ya da İngilizce olarak: Find all of the tokens in a string using a class found in Java API.

a. Bunun için Java API’sinden bu iş için java.util paketinden uygun sınıfı bulup,
API’sini kullanarak uygun kurucu ve metotların neler olduklarını belirleyin.
b. Daha sonra bu kurucu ve metotları çağırarak verilen bir String nesnesinin kelimelerini tek tek bulup yazdırın.
c. Daha sonra ayraç olarak ‘a’ harfini kullanarak String nesnesini parçalayın.
d. Daha sonra aynı şeyi String sınıfını kullanarak yapın.
e. Tüm bunları main metota sahip bir sınıf içinde yapın
 */
public class Test {

    static void main() {

        StringTokenizer st = new StringTokenizer("Find all of the tokens in a string using a class\n" +
                "found in Java API.");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        System.out.println("***************************");

        StringTokenizer st2 = new StringTokenizer("Find all of the tokens in a string using a class\n" +
                "found in Java API." , "a");

        while(st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        System.out.println("***************************");

        String text = "Find all of the tokens in a string using a class\n" +
                "found in Java API.";
        String[] sentence = text.split(" ");

//        for(int i = 0 ; i < sentence.length ; i++ ){
//           System.out.println(sentence[i]);
//        }

        for (String s : sentence)
            System.out.println(s);
    }
}
