package day10_StringManipulation;

import java.util.Locale;

public class C02_tolowerCase_toUppercase {
    public static void main(String[] args) {
        String str="Beni psikopata bağlamayin";
        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        /* eger büyük küçük harf dönüşümünde local bir dili esas almak isterseniz
        bu method kullanılabılır

        */


    }
}
