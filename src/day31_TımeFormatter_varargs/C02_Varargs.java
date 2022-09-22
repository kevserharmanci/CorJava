package day31_TımeFormatter_varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        //verilen 2 int i toplayıp sonucu yazdıran bır method olusturun
        int sayi=10;
        int sayi2=20;
        int sayi3=30;
        toplayazdir(sayi,sayi2,sayi3);
        /*
        her argument eklenınce yenıden hepsıne eklemek makul olmadıgı ıcın java buna bır cozum bulmusVARARKS
         */

    }

    public static void toplayazdir(int sayi, int sayi2,int sayi3) {
        System.out.println("verilen üç sayinin toplami :" + (sayi+sayi2+sayi3));
    }
}
