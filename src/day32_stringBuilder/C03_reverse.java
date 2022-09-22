package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        // verilen bir input u tersıne cevırıp bıze donduren
        // bır method olusturun
        String input="Hey gidi for loop günleri";
        String tersInput=tersineCevir(input);

        System.out.println(tersInput);


    }

    public static String tersineCevir(String input) {
    StringBuilder sb=new StringBuilder(input);
    //StringBuilder ı strınge cevırmem gerek toString ıle ..
        return sb.reverse().toString();
/*
package day32_stringBuilder;
public class C03_reverse {
    public static void main(String[] args) {
        // verilen bir input'u tersine cevirip,
        // bize donduren bir method olusturun
        String input="Hey gidi for loop gunleri";
        String tersInput= tersineCevir(input);
        System.out.println(tersInput);
    }
    public static String tersineCevir(String input) {
        StringBuilder sb=new StringBuilder(input);
        return sb.reverse().toString();
    }
}
 */



    }
}
