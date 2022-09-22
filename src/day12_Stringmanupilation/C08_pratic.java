package day12_Stringmanupilation;



import java.util.Scanner;

public class C08_pratic {
    public static void main(String[] args) {
        /*kullanıcıdan isim isteyin.eger
        - isim "a" harfi içeriyorsa "girdiginiz isim a harfi iceriyor"
        - isim "Z" harfi içeriyorsa "girdiginiz isim Z harfi içeriyor"
        -ikisi de yoksa "girdiginiz isim a veya Z harfi icermiyor"

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String isim=scan.nextLine();
        if (isim.contains("a")&&isim.contains("Z")){
            System.out.println("Girdiginiz isim hem a harfı hemde Z harfi iceriyor");
        } else if (isim.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        } else if (isim.contains("Z")) {
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }else {
            System.out.println("Girdiginiz isim ne a harfi nede Z harfi icermiyor");
        }













    }
}
