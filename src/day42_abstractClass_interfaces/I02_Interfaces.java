package day42_abstractClass_interfaces;
import java.util.ArrayList;
import java.util.List;
public interface I02_Interfaces {
    int SAYI=30;//public static final oldugu icin buyuk yazdik
    String ISIM="Yildiz Koleji";
    /*
    Interface bir class degildir
    Abstract class'lar java da abstraction(soyutlastırma/kural koyma)
    islevini yapiyordu
    ancak abstract bir class da abstract olmayan metodlar da olabilir
    bu da full abstraction yapmaya izin vermez
    Eger java da icinde hic concrete method olmasin
    dedigimiz bir class olusturmak istiyorsaniz
    bunu class degil interface yapmalisiniz,
    1--->INTERFACE'LERDE CONCRETE METHOD OLMAZ
    2--->INTERFACE'ler full abstraction yaptigindan Interface'lerden obje olusturulamaz
          Hartirladiginiz gibi interface olan listten direk obje olusturamiyorduk
          List<String> liste=new List<>();
          Bunun yerine cons. listtin child'i olan ArrayList'ten seciyoruz
          List<String> liste=new ArrayList<>(); ArrayList list interface deki butun absart metodlari overriding etmistir
    3--->Class'larda bir child birden fazla parent edinemez
         Ancak interface'lerde concrete method olmadigindan
         biz her methodu child class'da override etmek zorundayiz
         ovirride ederken kimin soyledigini override ettigimizin onemi yok
    4---> interface'ler neyin yapilmasi gerektigini soyler
    ama nasil yapilacagina karismaz
    */
    List<String> liste=new ArrayList<>();//Lİst interfacedir dolayisiyla obje olusturulamaz child classi olan arrayden olustururlu
}
