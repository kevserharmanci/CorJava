package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStantament {
    public static void main(String[] args) {
        /*
        Soru 3) Kullaniciya yasini sorun,
         eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”, 65’e esit veya buyukse “Emekli olabilirsin” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz");
        int yas=scan.nextInt();



        if (yas<0){
            System.out.println("lütfen geçerli bir yas giriniz");
        } else if (yas<65){
            System.out.println("emekli olamazsın"+(65-yas)+ "yil daha calısmalısın");
        } else {
            System.out.println("Emekli olabılırsın");
        }

    }
}
