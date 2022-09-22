package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=132;
        byte sayi2 = (byte) sayi1;
        System.out.println(sayi2);
        /* geniş data türündeki degeri , dar data türündeki variable ye atamak ıstersenız
        java sızın genıs data turundekı degerın
        dar data turundekı sınırlarına uyup uymayacagını bılemez ama java rısk almaz
        Riski 0 a indirmek için burada bır sorun olursa sorumlulugu kabul etmenızı bekler
        bunun ıcın degerın onune parantez ıcerısınde ıstedıgınız data turunu
        yazmamız yeterlı
        bu riski ustlendıgımızde 3 durum var
        1 bızım degerımız dar kalıp degerlerıne uygun olursa hıcbır kayıp olmadan cast olur
        2-double bır sayıyı ınt e  cast etmek gıbı durumlarda data kaybı yasanabılır
        vırgulden sonrası kayboldugu ıcın
        3- genısten dar kalıba koydugumuzda sınırları asan durumlarda verı baskalaşabilir.
        130 byte =-126 gıbı
         */

    }
}
