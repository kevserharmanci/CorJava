package day15_overloading_forLoop;

public class C06_StringTerseCevirme {
    // input olarak verilen Stringi terse cevırıp yazdıran bır method olusturun
    public static void main(String[] args) {
        String input ="Java gun gectikce guzellesiyor";
        tersYazdır(input);

    }

    public static void tersYazdır(String input) {
        String tersInput = input.substring(input.length() - 1);// a ters eklendı
        for (int i = input.length() - 2; i >= 0; i--) {
         tersInput+=input.substring(i,i+1);
        } // son iki harften 0 . indekse getirdik.
        System.out.println(tersInput);

    }
}

