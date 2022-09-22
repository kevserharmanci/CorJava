package day05_matamatikselişlemler;

public class C02_Pire_Post_Increment {
    public static void main(String[] args) {
        int sayi=10;
        System.out.println("pre-increment:"+ ++sayi);// 1 artırma 2 yazdırma


        System.out.println("post-increment:"+ sayi++);//1artırma 2yazdırma

        System.out.println("post-incrementten sonra:"+ sayi);
    }
}
