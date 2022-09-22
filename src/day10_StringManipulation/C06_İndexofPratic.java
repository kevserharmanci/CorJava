package day10_StringManipulation;

import java.util.Scanner;

public class C06_İndexofPratic {
    public static void main(String[] args) {
        // kullanıcıdan bir cumle ve bir harf isteyin, harfin cümlede var olup olmadığını yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
      String cümle=scan.nextLine();

      System.out.println("lütfen bir harf giriniz");

      String harf=scan.nextLine();
        if ((cümle.indexOf(harf)==-1)) {
            System.out.println("cümlede istenen karakter kullanılmamış");

        } else {
            System.out.println("cümlede istenen karakter kullanılmıştır");

        }


    }
}
