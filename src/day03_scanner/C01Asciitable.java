package day03_scanner;

public class C01Asciitable {
    public static void main(String[] args) {
        // 6 bir tam sayı bir de char degeri yazıp toplayın

        int sayi=10;
        char harf='a';
        String str ="banan";

        System.out.println(sayi+harf);// 10a degil 107 oldu
        System.out.println(str +harf);// banana
        System.out.println(harf+2);// a+2 olmaz 99 olur tabloya göre
        System.out.println(str+sayi+harf); // banan10a

        // char yeniHarf=harf+2

        /*
        char data türü işleme girdiği değişkenin türüne
        görefarklı davranabilir
        eger, matematiksel işleme girdigi variables sayısal bir degerse
        sayı gıbı davranır
        sayı+harf sayı variables i int oldugundan harf variables i
        ascii tablosundan 97 degerini kullanır


         */





        /*  char yeniharf=harf+2;java once sagdakı ıslemı yapar sagda int+ char gorunce
          ascii degerini alır ve 99 bulur,
          sonra atama işlemi yapar
          char yeniHarf=99;
          bu atama java acısından kabul edılebılır degıldır
         */
        //2-str+harf ; // banana String variable cok gucludur ,
        // hangı data turu ıle işleme girerse girsin diger data turunu kendıne benzetir.




        //peki konsolda 10a gormek ıstersek nasıl yazdırmalıyız

        System.out.println(""+sayi+harf);//10a

        /* içinde hiçbir deger olmayan çift tırnak bır hıclıktır basına koyunca artık o string olur
        ve string cok guclu oldugu ıcın dıgerlerını kendıne benzetır
         */


        char deger='1';

        System.out.println(deger+harf);// '1' + 'a'   146    49+97=146

    }

}
