package ch14_JavaAPI.apacheCommonsAPI;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils; //Provides extra functionality for Java Number classes.

import java.io.UnsupportedEncodingException;

/*
StringOperations.java kaynak kodunu daha önce ödev olarak görmüştünüz.
a. Bu örnekte kulanılan StringUtils sınıfı Apache Commons projesindedir ve
APIsine https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html
adresinden ulaşılır. Bu sınıfın APİ’sini inceleyin.
b. Bu sınıfın tüm alan ve metotlarının static olduğunu farkedin
c. Benzer şekilde Apache Commons projesindeki MathUtil sınıfını da inceleyin API’sini de
(https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/math/NumberUtils.html)
inceleyin, bir Test sınıfında örnek metot çağrıları yapın.
d. Bu sınıfın da tüm alan ve metotlarının static olduğunu farkedin
*/

public class StringOperations {
    public static void main(String[] args) throws UnsupportedEncodingException {

        System.out.println("Hello World!".toUpperCase());
        System.out.println(StringUtils.capitalize("hello world"));
        System.out.println(StringUtils.reverse("Hello World!"));
        System.out.println(StringUtils.reverse("Hello World!").toUpperCase());
        System.out.println(StringUtils.reverse("Hello World!   ").trim());
        System.out.println(StringUtils.reverse("Hello World!").substring(0, 5));

        System.out.println(StringUtils.difference("Hello World!", "Hello Java!"));
        byte[] bytes = StringUtils.getBytes("Hello World!", "UTF-8");
        for(byte b : bytes)
            System.out.print((char) b + " ");

        System.out.println("*****************************");

        System.out.println(NumberUtils.INTEGER_TWO); //Reusable Integer constant for two
        System.out.println(NumberUtils.max(2,4,6,1,3,4,3,66,888,95,678,34,66));
        System.out.println(NumberUtils.toScaledBigDecimal(5555.551 + 3333.33));
        System.out.println(NumberUtils.toScaledBigDecimal(5555.556 + 3333.33));
        /*
        public static BigDecimal toScaledBigDecimal(Double value)
        Converts a Double to a BigDecimal with a scale of two that has been rounded using RoundingMode.HALF_EVEN.
        If the supplied value is null, then BigDecimal.ZERO is returned.
        Note, the scale of a BigDecimal is the number of digits to the right of the decimal point.
         */

    }
}