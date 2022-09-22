package day17_Nestedforloop;

public class C02_Nestedforloop {
    public static void main(String[] args) {
        //verilen sayıya gore carpım tablosu olusturun
        /*
        input 3
        123
        246
        369
              dikdötgen model
         */
        int input=4;

        for (int i = 1; i <=input ; i++) { //(1,1)-(1,2)-(1,3)-(1,4) satırı ıfade edıyor
            for (int j = 1; j <=input ; j++) {// en (sutun) kısmı j
                System.out.print(i * j + " ");


            }
            System.out.println("");


        }
    }
}
