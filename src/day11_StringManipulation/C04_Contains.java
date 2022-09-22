package day11_StringManipulation;

public class C04_Contains {
    public static void main(String[] args) {

         /*
            Soru 2) Kullanicidan bir cumle isteyin.
            Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
            “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
            iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */


        String cumle="Java buyuk,ve cok guzel";
        cumle=cumle.toLowerCase();
        //requirements de buyuk harf kucuk harf hassasıyetı hakkında birsey soylenmemıs
        //ıkıncı olarak da her ıkı kelımeyı de ıcerme durumu acıklanmamıs
        // bu durumda gorevı bıze kım verdıyse ona sormak lazım


        // ek requirements : ikisini de iceriyorsa karar ver buyuk mu kucuk mu ?
        // case sensitive olmasın

        // en sınırlandırıcı olanı en basa koymalıyız

        if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
            System.out.println("karar ver buyuk mu yazdırayım,kucuk mu? ");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else {
            System.out.println("cumle kucuk ya da buyuk kelımesı ıcermıyor");
        }








    }
}
