package day26_constructor;

public class Kamyon {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
        /*
        bizim temel amacımız kamyonRunner  da argument olarak gırılen degerın
        kamyon class da ınstance verıableye atanması
        ancak scope konusunda ogrendıgımız gıbı
        kamyon constructor konusunda marka oldugu ıcın
        instance marka ya gıtmıyor.



        bu karısıklıgı gıdermek ıcın instance varıable lerı belırlı hale getırmemız gereklı.
        java bunun ıcın this keyword u olusturmustur.



        genel kullanım acısından this keyword u kod u
        herkesın anlamasını kolaylastırdıgı ıcın
        tercıh edılır

         */
// parametrelerımızı ınstıns variable ye atıyoruz ve bızım yazdıgımız parametreler calısıyor
    }

    public Kamyon(){

    }



    @Override
    public String toString() {
        return
                "\nmarka:" + marka + '\'' +
                "\nmodel:" + model + '\'' +
                "\nyil:" + yil +
                "\nfiyat:" + fiyat ;
    }
}
