package day17_Nestedforloop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
         /*Soru 6) Kullanicidan bir sifre girmesini isteyin.
                Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarılı sıfre gırınceye kadar tekrar sıfre gırmesını ısteyın
                - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali*/

        Scanner scan=new Scanner(System.in);
        String sifre="";
        boolean sifreBasariliMi=false;// false olmasının sebebı basarılı olunca ıslem bıtmıs olucak
        int kontrol=0;
        while (!sifreBasariliMi){
            System.out.println("lütfen bir sifre giriniz");
            sifre=scan.nextLine();
            //4 kontrolu yapalım her gecen kontrol ıcın kontrol variable yi 1 artıralım
            // bosluk kontrolu
            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("Ilk harf buyuk harf olmali");
            }
            // son harf kontrolu
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("Son harf kucuk harf olmali");
            }
            // bosluk kontrolu
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
            } else {
                kontrol++;
            }
            // sifre uzunluk kontrolu
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre en az 8 karakter olmali");
            }
            if (kontrol==4){ // tum kontrolllerden gecmis demektir
                System.out.println("Sifre basari ile tanimlandi");
                sifreBasariliMi=true;
            }else{ // sifre basarisiz
                // tekrar basa donecek
                // kontrol variable sifirlanmali
                kontrol=0;
            }
        }

    }
}
