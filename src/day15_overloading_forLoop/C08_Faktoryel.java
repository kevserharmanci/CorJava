package day15_overloading_forLoop;

public class C08_Faktoryel {
    public static void main(String[] args) {
        /*
        input olarak verilen bir tamsayı için faktoryel hesaplayıp yazdıran bir method olusturun

        verilen sayı 0 negatif veya 20 den buyuk olursa
        "girilen sayının faktoryeli hesaplanamaz" uyarısı yazdırın
         */
        int input =5;
        faktoryelHesapla(input);
    }

    public static void faktoryelHesapla(int input) {
        int faktoryel=1;

        if (input<0||input>20){
            System.out.println("girilen sayının faktoryeli hesaplanamaz");
        }else if (input==0){
            System.out.println("0! =1 dir");
        }else{
            for (int i = 1; i <=input ; i++) {
                faktoryel*=i;

            }
            System.out.println("faktoryel degeri="+faktoryel);
        }

    }
}
