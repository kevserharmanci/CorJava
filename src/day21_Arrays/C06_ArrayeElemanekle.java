package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanekle {
    public static void main(String[] args) {
        // C05 deki method'u kullanarak array'e eleman ekleyelim
        String [] takimListesi={"Suleyman", "Osman"};
        String eklenecekIsim="Talha";
        takimListesi= C05_ArrayeElementekleme.elemanEkle(takimListesi,eklenecekIsim);
        System.out.println(Arrays.toString(takimListesi));
    }
}