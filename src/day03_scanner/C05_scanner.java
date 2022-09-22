package day03_scanner;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {
        //kullanıcıdan ıkı sayı alıp bu sayıların carpımını yazdırın
        //1 scanner objesı olusturmak
        Scanner scan=new Scanner(System.in);
        // 2 adım bilgi vermek
        System.out.println("lütfen ılk sayıyı gırın" );
        //3 adım
        double sayi1=scan.nextDouble();
        // 2. sayı ıcın 2. ve 3. adımları tekrarlarız
        System.out.println("lütfen 2. sayıyı gırınız");
        double sayi2=scan.nextDouble();
        System.out.println("girilen sayıların çarpımı:"+sayi1*sayi2);


    }
}
