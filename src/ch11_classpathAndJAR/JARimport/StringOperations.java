package ch11_classpathAndJAR.JARimport;

import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;

/*
StringOperations.java kaynak kodunu derleyip çalıştırın.
a. Bu amaçla https://commons.apache.org/lang/download_lang.cgi adresinden Apache Commons Lang’in jar dosyasını indirip projenin classpath’ine ekleyin.
b. Derleme ve çalıştırmayı komut satırında yapın.
c. Bu örnekte kulanılan StringUtils sınıfının APIsi için: https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html
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
    }
}