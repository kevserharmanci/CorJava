package day28_staticBlock;

public class C03_passbyValue {
    public static void main(String[] args) {
        /*
        % 25 indirimli fiyatı hesaplayıp bize donduren bir method olusturun

         */
        double satisFiyatı=100;

        double indirimliFiyat=indirimliFiyatHesapla(satisFiyatı);// method olusturduk methoda satıs fıyatını gonderıcez
        // o da hesaplayıp gerı dondurecek
        System.out.println("iindirimli fiyat :"+ indirimliFiyat);
        }
        // java buraya variableyi degil degerini gecirir.value sını gecırır.java burada satisFiyatı yazınca 100 gorur.

        public static double indirimliFiyatHesapla(double satisFiyatı) {
        double indirimliFiyat=satisFiyatı*0.75;// buraya satisFiyatı yazmayıp xyz yazsak da onu 100 gorur
            // main method da satisFiyatı nı degıstırmedıgımız surece 100 olarak kalır
            // method da java neden satisFiyatı yazmayı tercıh ettı?
            // cunku kod takıbı yapabılmek ıcın...karısık kodlarda kodun takıbını yapabılmek ıcın

        return indirimliFiyat;

        }
    }

