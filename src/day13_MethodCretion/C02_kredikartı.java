package day13_MethodCretion;

import java.util.Locale;
import java.util.Scanner;

public class C02_kredikartı {
    public static void main(String[] args) {
        /*Soru 6) Kullanicidan bir sifre girmesini isteyin.
                Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
                - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sifre giriniz");
        String sifre=scan.nextLine();
        int kontrol=0;
        //ilk harf kontrolu
        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrol++;
        }else {
            System.out.println("ilk harf buyuk harf olmalı");
        }
        // son harf kontrolu
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else{
            System.out.println("Son harf kucuk harf olmali");
        }


        // bosluk kontrolu
        if (sifre.contains(" ")){
            System.out.println("sıfre bosluk ıcermemelı");
        }else {
            kontrol++;

        }
        //sıfre uzunlugu kontrolu
        if (sifre.length()>=8) {
            kontrol++;

        } else {
            System.out.println("sifre en az 8 karakter olmalı");
        }
        if (kontrol==4){
            System.out.println("sifre basarı ıle tanımlandı");
        } else {
            System.out.println("ıslem basarisiz ,Lütfen yeni bir sifre girin");
        }
    }
}
