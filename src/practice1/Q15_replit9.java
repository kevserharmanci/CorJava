package practice1;

import java.util.Scanner;

public class Q15_replit9 {
    public static void main(String[] args) {
       /* Girilen zamanı saniyeye çeviren bir program yazını
       Örnek Çıktı:
       1 saat 10 dakika 50 saniye ==>
       4250 saniye*/

        Scanner scan = new Scanner(System.in);
        double dakika = scan.nextInt();
        double saat = dakika / 60;
        int gun = (int) (saat / 24);
        int yil = (int) (gun / 365);
        System.out.println("3456789 dakika yaklasik " + yil + " yil " + gun % 365 + " gundur");

    }
}
