package day18_whilw_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
       /*Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
                Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
*/
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozitifSayiAdedi=0;
        int negSayiAdedi=0;
        int pozitifsayilertop=0;

        do {
            System.out.println("lütfen toplamak üzere pozitif tamsayi giriniz");
            sayi=scan.nextInt();
            if (sayi>0){
                pozitifsayilertop+=sayi;
                pozitifSayiAdedi++;// soruda adet sayısını bulabılmek ıcın

            }else if (sayi<0){
                negSayiAdedi++;
                System.out.println("negatif sayi giremezsin");
            }
        }while(sayi!=0);
        System.out.println(pozitifSayiAdedi +"adet pozitif sayi girdiniz,toplamlari :"  + pozitifsayilertop);
        System.out.println(negSayiAdedi + "  adet negatif sayi girdiniz ancak onlar toplama dahıl edılmedı");







    }
}
