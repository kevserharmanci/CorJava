package day03_scanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        /*kullanıcıdan ismini isteyin girilen ismi isminiz kevser seklınde yazdırın
        insanların dunyasından kodlarımızın bulundugu class a deger almak ıcın
         scanner objesını kullanırız
         */
        //1 scanner objesı olusturalım
        Scanner scan=new Scanner(System.in);
        // 2 kullanıcıya ne ıstedıgımızı soyleyelim
        System.out.println("lütfen isminizi giriniz");
        // 3 olusturdugumuz scan objesı ıle kullanıcının gırdıgı degerı alıp
        // olusturacagımız uygun bir variable ye atayalım
        String kullanıcıIsmi=scan.next();
        System.out.println("isminiz:"+kullanıcıIsmi);












    }
}
