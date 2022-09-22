package day37_overridding;

public class FSupra extends EToyota {


    void yakit(){
        System.out.println("supra benzin kullanir");
        /*
        private methodlar override edilemez
        eger Child class da parent class dakı private method ıle
        aynı signature de bır method olusturursanız bu overriding method olmaz
         */

    }

    @Override
    void motor() {
        /*
        @Override notasyonu Javaya bır gorev verır
        Java bu notasyonla bırbırıne baglı olan ıkı method u sureklı kontrol eder
        eger parent class dakı overriding method u sılersenız
        CTE verır
         */
        System.out.println("");
    }

    /*
    package day37_overridding;
public class FSupra extends EToyota{
    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
          Private method'lar override edilemez
          Eger Child class'da parent class'daki private method ile
          ayni signature'da bir method olusturursaniz
          bu overridding method OLMAZ

}
    @Override
    void motor() {
        /*
          @Override notasyonu Javaya bir gorev verir
          Java, bu notasyonla birbirine bagli olan iki method'u
          surekli kontrol eder
          Eger parent class'daki overridden method'u silerseniz
          CTE verir
          @Override notasyonu kullanmak mecburi degildir
          Eger Overridding method silinirse, kodun CTE vermesini istersek
          @Override notasyonu kullanmaliyiz
         */
    }



