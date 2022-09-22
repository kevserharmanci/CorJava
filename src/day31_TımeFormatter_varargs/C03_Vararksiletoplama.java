package day31_TımeFormatter_varargs;

public class C03_Vararksiletoplama {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;
        toplayazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        // dınamık bır sekılde tum eklenen sayıları toplamak ıstersen method a ınt ... nokta eklıyoruz
        // o zaman java otomatık olrak methodcall dakı ıslemı sorunsuz yapar
        toplayazdir(sayi1,sayi2,sayi3,sayi4);
        toplayazdir(sayi1,sayi2,sayi3);
        toplayazdir(sayi1,sayi2);

    }
    public static void toplayazdir(int... sayi){
        /* int... sayi bu gösterim integer variable lerden olusan bır
        VARARGS demektir.
        Varargs array alt yapısını kullanır
         */
        // bu toplamayı yapabılmek ıcın bır for ıc loop olusturucaz
        int toplam=0;
        int sayiadedi=sayi.length;
        for (int each: sayi
             ) {

            toplam+=each;// varags demek esnek uzunluktakı array dır.uzunluk bakımından list e benzese de ama yapı bakımından array dır

        }
        System.out.println("girilen " + sayiadedi + " adet sayinin toplamı :" + toplam);
    }

}
