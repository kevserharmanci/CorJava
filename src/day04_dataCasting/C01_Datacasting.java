package day04_dataCasting;

public class C01_Datacasting {
    public static void main(String[] args) {
        char harf='a';
        char yeniHarf=(char)(harf+1);
        // kod bu durumda once sagdakı ıslemı yapar
        // char yeniHarf=97+1...98
        // char bır variable 98 olamayacagı ıcın java hata verir
        // 98 i char olarak kabul et dedık parantezlerı kullanarak
        System.out.println(yeniHarf);




        /*bazen bir variable ye olusturdugu data turu dısından deger atanabılır
         bunlardan bazısını java otomatık olarak kbul eder
         java eger bu deger atamasında sorun olusacaguını
         (data kayıpların olabılecegı veya datanın baskalasabılecegı) gorurse
         bu durumda otomatık olarak bu atamayı kabul etmez
         sızden eger bu atamayı ıstıyorsanız sorumlulugu almanızı bekler

         */

        int sayi1=(int)7.3;
        System.out.println("sayi1:"+sayi1);

        double sayi2=10;
        System.out.println("sayi2:"+sayi2);//10.0
        int sayi3='c';
        System.out.println("sayi3:"+sayi3);//99
        char harf2=98;
        System.out.println("harf2:"+harf2);//b
        // bu durumlarda data casting devreye gireer






    }
}
