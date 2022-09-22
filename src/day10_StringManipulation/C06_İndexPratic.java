package day10_StringManipulation;

import java.lang.module.FindException;
import java.util.Locale;
import java.util.Scanner;

public class C06_İndexPratic {

    public static void main(String[] args) {
        //kullanıcıdan bir cumle ve bir kelime isteyin,
        // kelimenin cümledeki kullanımına bakarak asagıdakı
        // 3 cumleden uygun olanı yazdırın
        /*
        1 girilen kelime cumlede kullanılmamıs
        2 girilen kelime cumlede 1 kere kullanılmıs
        girilen kelime cumlede 1 den fazla kullanılmıs

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.nextLine().toLowerCase();
        int kelimeIlkindex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeIlkindex == -1) {
            System.out.println("girilen kelime cümlede kullanılmamıstır");
        } else if (kelimeIlkindex == kelimeSonIndex) {
            System.out.println("girilen kelime 1 kere kullanilmis");
        } else {
            System.out.println("girilen kelime 1'den fazla kullanılmıs");


        }


    }
}
