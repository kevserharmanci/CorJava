package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
        1-Lmabda (Functional Programming )Java 8 ile kullanılmaya baslanmıstır.
        2-Functional Programming'de "ne yapılacak"(What to do)üzerine yoğunlaşılır.
          Structured programming"Nasıl yapılacak" (how to do)uzerıne yogunlasılır.
        3-Functional Programming Arrays ve Collections ile kullanılır.
        4-"entrySet() methodu ile Map,Set e dönüştürülerek  Functional Programming de kullanılabılır.

         */
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        System.out.println("Functional: ");
        ciftElemanlariYazdirFunction(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        getMaxEleman1(liste);
        getMaxEleman2(liste);
        getYedidenBuyukCiftMin1(liste);
        getYedidenBuyukCiftMin2(liste);



    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer>list){
        for(Integer w: list){
            System.out.print(w+ " ");

        }

    }
//1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
public static void listElemanlariniYazdirFunctional(List<Integer>list){
        list.stream().forEach(t-> System.out.print(t+ " "));// lambda expression denıldıgınde bu anlasılır.
        // stream methodu collection dan elementlerı akısa dahıl etmek ıcın ve methodlara ulasmak ıcın kullanılır.


}

//2)çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
public static void ciftElemanlariYazdirStructured(List<Integer> list){
        for (Integer w: list){
            if (w % 2 == 0){
                System.out.print(w + " ");// structure da java bılgımız ıle nasıl yapılır uzeerınde dururuz.

            }
        }
    }

//2)çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
public static void ciftElemanlariYazdirFunction(List<Integer> list){
        // yazdırırken bır tane fıltreleme yapacagız.
    list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+ " "));//stream farkı ıle boyle yapılıyor.
    // once filtreliyoruz ama stream ıle sonra for each ıle ıstedıgımız elemanları yazdırmıs oluyoruz.

}
     //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    // elemanların degerını degıstırme methodu da olacak
    public static void tekElemanlarinKareleriniYazdir(List<Integer>list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+ " "));
                // elemanların degerı degısekse map methodu kullanılır.

    }
     //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer>list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach( t-> System.out.print(t+ " "));
    }
     //5) Tekrarsız çift elamanlarin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer>list){

       Integer toplam= list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
        // distinct ile tekrar eden sayılar gıdıyor,filter ile cıft sayıları alıyoruz,carpıp,reduce ıle onları0 dan baslayarak
        // toplamlar t ye atanacak u lar da map den gelecek.toplama dedıgı ıcın o koyuyoruz carpma dese ıdı 1 yazardık.
        //distinct ile tekrarsiz olanlari aldik sonra filter ile cift olanlari filtreledik
        //sonra map ile karelerini bulduk
        // reduce() methodu ile tek hale indirgeyecegiz bunun icin ikitane deger olacagı ıcın t ve u degiskenlerini declare ediyoruz
        //sonra bir baslangic degeri ister orada da toplamda etki etmeyen 0(sifir) yaptik
        //sonra bunu direk sout icine alabilirdik ama daha anlasılır oldugu ıcın sonuc sayi olacagi icin Integer bır variable'ye atama yaptik
// reduse methodu sonuc methodudur.
        /*1.Adim--> t=0 u=64(8*8)      t+u=64(yani ilk baslangic degeri t degerine ataniyor)
         2.Adim--> t=64 u=100(10*10)  t+u=164
         3.Adim--> t=164 u=4(2*2)     t+u=168
         4.Adim-->      toplam=168 olur
            */
    }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer>list){
       Integer carpim= list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)-> t*u);
        System.out.println(carpim);


        }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    //1.yol
    public static void getMaxEleman1(List<Integer>list){
       Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t : u);
       //listin içindeki herhangı bır degerı de koysak olur.ınteget mın value de ıse ınt kapsadıgı rakamların en kucugunu koyarız
        //listin icinden de koyabılırız.
        System.out.println(max);

    }
    //2.yol:
    public static void getMaxEleman2(List<Integer>list){

       Integer max= list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println("max =" + max);
    }
    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    //1. Yol:
    public static void getYedidenBuyukCiftMin1(List<Integer> list){

        Integer min =  list.
                stream().
                distinct().
                filter(t->t%2==0).
                filter(t->t>7).
                reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);

        System.out.println(min);
    }

    //2. Yol:
    public static void getYedidenBuyukCiftMin2(List<Integer> list){

        Integer min = list.
                stream().
                distinct().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE,(t,u)->u);

        System.out.println(min);
    }
    //3. Yol:
    public static void getYedidenBuyukCiftMin3(List<Integer> list){

        Integer min = list.
                stream().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted().
                findFirst().
                get();

        System.out.println(min);

    }

        //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){

        List<Double> sonuc =  list.stream().distinct().filter(t-> t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(sonuc);

    }
}








