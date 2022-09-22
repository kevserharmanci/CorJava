package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /*
    1-Verilen sayi1 ve sayi2 variable larını degerlerını degıstıren (swap)
    bir program yazınız
    orn: sayi1=10 ve
         sayi2=20;
       kod calıstıktan sonra
          sayi1=20 ve
          sayi2=10

     */
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;
        // sayi3 gecıcı kovamız
        //adim 1 sayi2 yi bos kovaya koyalım
        //önce bos kova yazılır ılk atanacak sayı yazılmalı
        sayi3 = sayi2; // 10  20  20
        // adım2 1. sayıyı ıkıncı sayıya atayacagız
        sayi2 = sayi1; // 10 10 20
        //adim3 boş kovadakı sayıyı sayı1 e atayalım
        sayi1 = sayi3; // 20 10 20
     // degısen her zaman soldakıdır atanandır!
        System.out.println("swaptan sonra sayi1 :" + sayi1); // 20
        System.out.println("swaptan sonra sayi2:" + sayi2);// 10


    }

}


