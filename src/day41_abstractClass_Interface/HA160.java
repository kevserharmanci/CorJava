package day41_abstractClass_Interface;
import java.util.ArrayList;
import java.util.List;
public class HA160 extends FMercedes {
    /*
      Abstract parent silsilesinden gelen
      ilk concrete class
      Parent'i olan tum class'daki abstract method'lari
      concrete hale donusturmek (override etmek) ZORUNDADIR
      Bu kuralin istisnasi
      parent class'lardan herhangi birinde
      concrete hale donusturulmus, abstract method'lardir
     */
    public static void main(String[] args) {
        HA160 arb1= new HA160();
        // concrete bir class'dan istedigimiz objeyi uretebiliriz
        FMercedes arb2= new FMercedes();
        // mercedes'de concrete
        // EToyota arb3= new EToyota();
        EToyota arb4= new GCorolla();
        // Abstract class'lar constructor barindirir ama obje uretemezler
        // Toyota class'i abstract class oldugundan obje uretilemez
        /*
        List<String> list1 = new List<String>();  list abstract bır class oldugu ıcın obje uretılmez
        List<String> list2 = new ArrayList<>();bunu kullanabılırız cunku arraylıst onun chıld ı ona atanmıs
        Abstract bir class'in ozelliklerini tasiyan bir obje olusturmak istedigimizde
        Data turunu istedigimiz abstract class
        constructor'i ise child'i olan concrete bir class'dan seceriz
         */
    }
}
