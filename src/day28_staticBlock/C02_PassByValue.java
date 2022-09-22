package day28_staticBlock;

public class C02_PassByValue {//1.scope
    public static void main(String[] args) {
        double satisfiyati=100;
        System.out.println(indirimliFiyati(satisfiyati));//90
        System.out.println(satisfiyati);//100
        System.out.println(indirimliFiyati(satisfiyati));//90
        /*
        iki farklı method da satıs fıyatı ısmınde variable olabılır
        java buna ıtıraz etmez cunku scope ları farklıdır

         */




    }
    // 2.scope

    public static double indirimliFiyati(double orjjinalFiyat) {
        //methodumuz % 10 indirim yapip
        // yeni fiyati main method a dondursun
double satisfiyati=orjjinalFiyat*0.9;

        return satisfiyati;

    }
}
