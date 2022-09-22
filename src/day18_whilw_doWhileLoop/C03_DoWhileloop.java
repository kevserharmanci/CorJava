package day18_whilw_doWhileLoop;

public class C03_DoWhileloop {
    public static void main(String[] args) {
        // while loop da once kontrol sonra ıslem yaparız ıslem bıtınce lop un kırılması ıcın basa donmemız gerekır
        // bu durumda fazladan 1 ıslem yapılıyor
        int sayi=11;
        while (sayi<10){
            System.out.println(sayi);


            sayi++;// sonsuz loop olmaması ıcın artıs mıktarını yazmalıyız


        }
        /*
        do while loop ıle calıstıgımızda bu dez avantaj ortadan kalkar

         */
        sayi=9;
        ;
        do {
            System.out.println(sayi);

            sayi++;

        }while (sayi<10);





    }
}
