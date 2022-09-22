package day18_whilw_doWhileLoop;

import java.util.Scanner;

public class C11_do {
    public static void main(String[] args) {
        /*
kullanicidan pozitif tam sayilar isteyin
islemi bitirmek icin 0 basmasini soyleyin

kullanici 0 bastigindatoplam kac pozitif tam sayi girdigini
ve pozitif tam sayilarin toplaminin kac oldugunu yazdirin

 */
        Scanner scan=new Scanner(System.in);
        int pozitifTamtop=0;
        int pozitifTamAdedi=0;
        int sayi=0;;
        int negatifSayiAdedi=0;


        do {
            System.out.println("lütfen toplamak üzere pozitif tamsayi giriniz");
            sayi=scan.nextInt();
            if (sayi>0){
                System.out.println("girilen pozitif sayıların toplamı :"+ pozitifTamtop);
                pozitifTamtop+=sayi;
                pozitifTamAdedi++;

            }else{
                System.out.println("lütfen pozitif bir tam sayi giriniz");
                negatifSayiAdedi++;

            }




        }while(sayi!=0);
        System.out.println("girilen sayilar top :"+pozitifTamtop);
        System.out.println(pozitifTamAdedi +"adet pozitif sayi girdiniz,toplamlari :"  + pozitifTamtop);
        System.out.println(negatifSayiAdedi + "  adet negatif sayi girdiniz ancak onlar toplama dahıl edılmedı");

    }
}
