package day12_Stringmanupilation;

import java.util.Scanner;

public class C10_pratic {
    public static void main(String[] args) {
        // kullanıcıdan bir sifre girmesini isteyin asagıdakı sartları saglıyorsa "sifre basarı ile tamamlandı"
        // sartları saglamazsa "işlem basarısız,lutfen yenı bır sıfre gırın" yazdırın
        //1 ilk harf buyuk olmalı
        //2 son harf kucuk harf olmalı
        //3 sıfre bosluk ıcermemelı
        //4 sıfre uzunlugu en az sekız karakter olmalı

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

            //2.cözüm
            // Scanner scan=new Scanner(System.in);
            //       System.out.println("lutfen bir sifre giriniz");
            //       String sifre=scan.nextLine();
            //       boolean ilkHarf=sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
            //       boolean sonHarf=sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z';
            //       boolean bosluk=!sifre.contains(" ");
            //       boolean uzunluk=sifre.length()>=8;
            //       if(!ilkHarf) {
            //           System.out.println("sifre icerisinde ilk harf buyuk olmali");
            //       }
            //       if (!sonHarf){
            //           System.out.println("son harf kucuk olmali");
            //       }
            //       if(!bosluk){
            //           System.out.println("bosluk olmamali");
            //       }
            //       if(!uzunluk){
            //           System.out.println("uzunluk en az 8 olmali");
            //       }
            //       if (ilkHarf && sonHarf && bosluk && uzunluk) {
            //           System.out.println("Sifre basari ile tanimlandi");
            //       } else {
            //           System.out.println("Islem basarisiz, Lutfen yeni bir sifre girin");
            //       }
        }
    }
}
