package day10_StringManipulation;

public class C05_LengthMetotu {
    public static void main(String[] args) {
    String str="Java ogren, isi kap";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length() - 1));// son karakterini yazdıralım
        System.out.println(str.charAt(str.length() - 3));// son karakterden 3.karakter -3 olur

      /* java da null pointer (işaretleyici) bir deger degi,
        karşısına yazıldıgı variablesin hiçbir deger almadıgının işaretcisidir.
       */
         String str2=""; //str2 ye bir deger atanmış mıdır EVET
        //BU DEGER NEDİR :HİCLİK
        System.out.println(str2.length());// 0

        String str3=null;
        // str 3 e bir deger atanmış mıdır?
        //HAYIR
        //null bu deger atamamayı işaret etmektedir


        System.out.println(str3.length());
        // bir deger atamamış ki nasıl uzunlugu olsun
        // NullointerException olarak hata verir




    }
}
