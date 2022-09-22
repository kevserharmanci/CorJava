package day10_StringManipulation;

public class C06_İndexof {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t"));// bana integer donduruyor
        // int de yok diye bir deger bulunmuyor
        // 0 dersek 'j nin index i dir ama negatif deger donerse biz aranan string in
       // str da olmadıgını anlarız
        // Java -1 dondurmeyi tercih eder -1 görünce o deger yok anlamalıyız

        String str5="wertyuıopğasdfghjklşizxcvbnmöç";
        //str 5 de  "="  karakteri  kullanılmıs mıdır?
        if(str5.indexOf("=")==-1) {
            System.out.println("str5 de istenen karakter kullanılmamış");

        } else {
            System.out.println("str5 de istenen karakter kullanılmıştır");

        }







    }
}
