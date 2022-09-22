package day28_staticBlock;

public class C01_StaticBlock {
    static int sayi;

    static {
     /*static block class uyelerının tamamından once calısır main den bile once
        class olustugunda calısır genellıkle de
        class ıle ılgılı on ayarlama veya static variable lere deger atamak ıcın kullanılır

        static bloklar main method dan once olusur
        class ılk olusturulunca static bloklar da devreye gırer
        nadıren ıhtıyacımız olur eger maın calısmada bır deger ataması veya bır on ayar yapmak ıstersek kullanabılırız

     static block ların class ıcınde nerede oldugu onemlı degıldır
     önce static blok calısır

     birden fazla static blok varsa, yukarıdan asagı dogru calısır

         */

        System.out.println("StaticBlock calıstı");
        sayi = 10;

    }

    public static void main(String[] args) {
        System.out.println("main method calıstı");
        System.out.println(sayi);// calısınca 0 yazar


    }

    static {



    }

}
// static olmayan cod blokları da statıc olmayan obje olusturulurken calısır yalnızca obje olusturulurken ...