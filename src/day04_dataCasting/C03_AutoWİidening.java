package day04_dataCasting;

public class C03_AutoWİidening {
    public static void main(String[] args) {
        // dar veri türündeki bir degeri geniş veri turundekı variable ye assing eder
    byte sayi1=23;
    short sayi2=55;

        int sayi3=sayi1+sayi2; //byte + short ınt ın ıcıne sıgar o yuzden kabul ettı.88
        double sayi4=sayi1*sayi2;// byte ve short kucuk old ıcın kabul ettı 1265.0

        sayi4=(double)sayi2/sayi1;//53.0/23=2.391 sayılardan bırını double yaparız
        System.out.println(sayi4);

    }
}
