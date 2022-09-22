package day12_Stringmanupilation;

import java.util.Scanner;

public class C09_pratic {
    public static void main(String[] args) {



        /*
        System.out.println(isim.length()>soyisim.length()?isim+" isminiz daha uzun ":isim.length()==soyisim.length()
                                                        ?"isminiz ve soyisminiz esit uzunlukta"
                                                        : soyisim+" soyisminiz daha uzun ");
         */
        String isim="Ali";
        String soyIsim="Karaslan";
        isim=isim.replaceAll("\\s","");
        soyIsim=soyIsim.replaceAll("\\s","");
        int isimUzunlugu=isim.length();
        int soyIsimUzunlugu=soyIsim.length();
        if(isimUzunlugu>soyIsimUzunlugu) {
            System.out.println("Kullanicinin ismi, soyisminden daha uzun");
        } else if (soyIsimUzunlugu>isimUzunlugu) {
            System.out.println("Kullanicinin soyismi, isminden daha uzun");
        }else {
            System.out.println("Kullanicinin isim ve soyisim uzunlugu ayni");
        }
    }
}
