package day17_Nestedforloop;

public class C04_NestedForloop {
    public static void main(String[] args) {
        /*
        verilen inputa göre yıldızlardan oluşan bir ucgen olusturun
        örnek:
        input=4 ise
        *
        **
        ***
        ****
        // bir satırda kac yıldız olacagını satır sayısından anlıyorum.inputu satır sayısına atama yaparsak for olustururuz.

        */
        int input=4;// bır degısken vardır hem satır hem sutunu ıfade eder
        for (int i = 1; i <= input; i++) {// (1,1)--(1,2 mevcut degil 2. satıra gecer)
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");


        }
    }
}
