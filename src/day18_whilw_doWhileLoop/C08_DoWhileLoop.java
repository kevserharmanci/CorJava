package day18_whilw_doWhileLoop;

import java.util.Scanner;

public class C08_DoWhileLoop {
    public static void main(String[] args) {
        /*
kullanicidan bir sayi alin ve
bu sayiyi tam bolen sayilari ve
toplam kactane olduklarini ekrana yazdirin
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir tam sayi giriniz ");
        int sayi= scan.nextInt();
        int sayiAdedi=0;
        int tamBolenler=1;
        System.out.println(sayi+" sayisini tam bolen sayilar");
        while (tamBolenler<=sayi){
            if(sayi%tamBolenler==0){
                System.out.print(tamBolenler + " ");
                sayiAdedi++;
            }
            tamBolenler++;
        }
        System.out.println("");
        System.out.println(sayi+" sayisinin "+sayiAdedi+" tane tam boleni vardir");

    }
}
