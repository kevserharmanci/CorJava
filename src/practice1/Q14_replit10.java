package practice1;

import java.util.Scanner;

public class Q14_replit10 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
INPUT:
Dakika sayısı: 3456789
OUTPUT :
3456789 dakika yaklaşık 6 yıl 210 gündür
         */
    Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dakika giriniz");
        double dakika=scan.nextInt();
        double saat=dakika/60;
        int gun=(int)(saat/24);
        int yil=(int)(gun/365);
        System.out.println("3456789 dakika yaklasik "+ yil+"yil"+ gun%365+" gundur");




















    }
}
