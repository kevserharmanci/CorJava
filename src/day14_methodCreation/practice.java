package day14_methodCreation;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {


    tekMiCiftMi( );
    sifirdanBuyukMuKucukMu();
    yuzdenBuyukMuKucukMu();
}
    public static void yuzdenBuyukMuKucukMu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi >= 100 && sayi<1000) {
            int bBasamagi = sayi % 10;
            int oBasamagi = (sayi / 10) % 10;
            int yBasamagi = sayi / 100;
            int sayilarınTplm = bBasamagi + oBasamagi + yBasamagi;
            System.out.println("Girilen sayi 100'e esit veya büyük ve girilen sayilarin toplami = " + sayilarınTplm);

        } else if (sayi<100){
            int birlerB=sayi%10;
            System.out.println("Girilen sayi 100'den kucuk,girilen sayinin birler basamagi = " +birlerB);

        }else System.out.println("Girilen sayı uc basamaklı olsun lutfen");

    }

public static void sifirdanBuyukMuKucukMu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi<0 ){
        System.out.println("sayi sifirdan kucuktur");

        } else if (sayi>0) {
        System.out.println("sayi sifirdan buyuktur");

        }else System.out.println("sayi sifirdir");
        }
     public static void tekMiCiftMi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi%2==0){
        System.out.println("sayi cifttir");
        }else System.out.println("sayi tektir");

}
}
