package day15_overloading_forLoop;

public class örnek2 {
    public static void main(String[] args) {



                topla(5, 7);//12
                topla(5.2, 3);//8.2
                topla(3.4, 6.1);//9.5
                topla(5, 6.2);//11.2
            }
            public static void topla ( int sayi1, int sayi2){
                System.out.println("iki intigerin toplamı :" + (sayi1 + sayi2));

            }
            public static void topla ( double sayi1, int sayi2){
                System.out.println("bir double bir intigerin toplamı :" + (sayi1 + sayi2));

            }
            public static void topla ( double sayi1, double sayi2){
                System.out.println("iki dobule ın toplamı :" + (sayi1 + sayi2));

            }
/*
java hangi methodun çalışacağına karar verirken optimazsoyon yapar
-eğer hiç kast yapmadan kullanabileceği bir method varsa onu kullanır.
-eğer kast yapmadan kullanabileceği bir method yoksa en az kast yapacağı methodu tercih eder.
 */



        }

