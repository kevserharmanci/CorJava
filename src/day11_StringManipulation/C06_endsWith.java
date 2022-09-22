package day11_StringManipulation;

import java.util.Scanner;

public class C06_endsWith {
    public static void main(String[] args) {
         /*
            Soru 1) Kullanicidan email adresini girmesini isteyin,
            mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
            @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
            @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen email yazınız");
        String email=scan.nextLine();

        if (!email.contains("@gmail")) {
            System.out.println("lütfen gmail adresinizi  giriniz");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("email adresiniz kaydedildi");
        } else{
            System.out.println("lütfen yazimi kontrol edin");
        }






    }
}
