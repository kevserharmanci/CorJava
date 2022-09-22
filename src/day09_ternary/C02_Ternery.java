package day09_ternary;

import java.util.Scanner;

public class C02_Ternery {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alin.Syı poz ise "sayı pozitif" yazdırın,
        // negatifse sayının karesini yazdırın
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi=scan.nextDouble();
        // Eger ternary icindeki sonuclar farkli data turlerinde ise
        // atama yapamayiz, sadece yazdirabiliriz
        // double sonuc = sayi>0 ? "Sayi Pozitif" : (sayi*sayi) ;
        System.out.println(sayi>0 ? "Sayi Pozitif" : (sayi*sayi));
        //System.out.println(sayi>0 ? "Sayi Pozitif" : (sayi==0 ? "Sayi ne pozitif ne negatiftir" : (sayi*sayi));
        //











    }
}
