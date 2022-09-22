package Elif_2706;

import java.util.Scanner;

public class Q10_ıf {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen Y /N ikilisinden birini giriniz :");
        char karakter=scan.next().charAt(0);

// veya ısaretı yerıne toUpperCase ıle de yazdırabılırdık
        if (karakter=='Y' || karakter=='y') {
            System.out.println("YES");
        } else if (karakter=='N' || karakter=='n') {
            System.out.println("NO");
        }else
            System.out.println("yanlis giris yaptınız,lütfen Y /N ikilisinden birini giriniz");
        // son else de baska bır eger olmadıgı ıcın { ısaretı kullanmasak da calısır
        // tek satır kod da { buna gerek yoktur








    }
}
