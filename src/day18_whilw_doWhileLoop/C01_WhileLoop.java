package day18_whilw_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */
        char ilkHarf='f';
        char sonHarf='t';
        char temp=ilkHarf;
        String buyult="";

        while (temp<=sonHarf){
            buyult=(temp+"").toUpperCase();// charda touppercase yapamadıgımız ıcın hıclık eklıyoruz ve
            // string daha guclu oldugu ıcın char da buyuge boyle cevırdılk


            System.out.print(buyult + " ");
            temp+=1;


        }
    }
}
