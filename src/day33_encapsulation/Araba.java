package day33_encapsulation;

public class Araba {
    String marka="marka belirtilmedi";
    // marka nın accces m. default accces modifier oldugundan package ıcınde kullanılabılır
    private String model="model belirtilmedi";
    private String yakit="elektrikli";
    // tum arabalar elektrıklı ıse bu varıable nın degsıtırılmemesıne sebep olur kımse ulasamaz
    // private yaptıgımız model ve yakıt erısımı yetkılendırelım
    // modele deger atanabılsın ama gorunemesın (setter)
    // yakıt ıse gorunsun ama yenı deger atanamasın (gette)


    public void setModel(String model) {// set ıle atama yapabılır
        this.model = model;
    }

    public String getYakit() { // get ile getirebiliyor
        return yakit;

        /*
        public class Araba {
    String marka="Marka belirtilmedi"; // marka'nin access modifier'i default access modifier
                                       // oldugundan, package icerisinde kullanilabilir
    private String model="Model belirtilmedi";
    private String yakit="Elektrikli"; // tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim
    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // model'e deger atanabilsin ama gorulemesin(setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor (getter)
    //
    public void setModel(String model) {
        this.model = model;
    }
    public String getYakit() {
        return yakit;
         */
    }
}
