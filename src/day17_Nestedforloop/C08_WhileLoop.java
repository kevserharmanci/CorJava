package day17_Nestedforloop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan toplanmak uzere sayilar alın
        // sayıların toplamı 500 ü gecınce sayıların top ve kac sayı toplandıgını su sekılde yazdırın

        // 13 sayı gırdınız ve toplamları 567

        int top=0;
        int sayi=0;
        int sayac=0;
        Scanner scan=new Scanner(System.in);


        while(top<500) {
            System.out.println("lütfen toplamak için sayı girin");
            sayi=scan.nextInt();
            top+=sayi;
            sayac++;



        }
        System.out.println(sayac + " sayi girdiniz ve toplamlari : " + top);



    }
}
