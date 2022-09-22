package day08_ifStatements;

import java.util.Scanner;

public class C07_Ödev {
    public static void main(String[] args) {
        //dikdörtgenin kenar uzunluklarını ısteyın ve
        // dıkdortgenın kare olup olmadıgını yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kenar uzunluklarını girin\n kenar1");
        int kenar1=scan.nextInt();
        System.out.println("lütfen kenar uzunluklarını girin\n kenar2");
        int kenar2=scan.nextInt();


        if (kenar1==kenar2){
            System.out.println("bu karedir");



        }
        else {
            System.out.println("kare degildir");
        }



















    }
}
