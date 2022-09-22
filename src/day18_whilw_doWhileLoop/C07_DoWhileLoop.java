package day18_whilw_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {
       /*
kullanicidan bir rakam alin
bu rakam icin carpim tablosunu ekrana yazdirin
kullanicinin hata yapmadigini farzedin
ornegin:
kullanici 3 girerse
3*1=3 3*2=6 3*3=9............3*10=30 gibi

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz");
        int rakam = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(rakam + "*" + i + " = " + rakam * i + " ");
        }
        System.out.println("");
        int bas = 1;
        while (bas <= 10) {
            System.out.print(rakam + "*" + bas + " = " + rakam * bas + " ");
            bas++;


        }
    }
}
