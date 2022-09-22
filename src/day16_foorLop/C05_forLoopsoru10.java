package day16_foorLop;

import java.util.Scanner;

public class C05_forLoopsoru10 {
    public static void main(String[] args) {
        /*Soru 10 ) Kullanicidan iki sayi isteyin.
         Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
                sonucu yazdiran bir program yaziniz

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen baslangıc ve bıtıs degerlerını gırın pozitif tam sayı olarak"
                );
        int bas= scan.nextInt();
        int bitis=scan.nextInt();
        aralaritopla(bas,bitis);



    }

    public static void aralaritopla(int bas, int bitis) {
        int toplam=0;
        if (bas<=bitis){
            for (int i =bas; i <=bitis ; i++) {
                toplam +=1;


            }
        }else {

            for (int i = bitis; i <=bas; i++) {
               toplam +=1;
            }

            }// if ve for loop un ıcınde verıable olusturup atama yapmak sıkıntılı buyuzden dısında olusturmalı

        System.out.println("aradaki sayiların toplamı :"+ toplam);

        }
    }

