package day33_encapsulation;

public class Tasit {
    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }
    //getter method u da tek bır satırlık ıslem yapıyor
    // baska class ların prıvate oldugu ıcın erısemedıgı
    // tasıt turu bılgısını , class ıcınden alıp bize getiriyor
    //

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
        // bizim tasıtrunnerda gonderdıgımız tasıt turunu (tir)
        // tir ı gonderınce tasıtturune atıyor.ama bur class da return olmadıgı ıcın yazdırmıyor.
        // 1 satırlık bır ıslem yaparız bızım gonderdıgımız argumentı ınstance atamıs oluruz
    }

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
    /*
     private String tasitTuru;
    private boolean muayenesiVarMi;
    public String getTasitTuru() {
        return tasitTuru;
    }
    // getter method'u da tek bir satirlik islem yapiyor
    // baska class'larin private oldugu icin erisemedigi
    // tasitTuru bilgisini, class icinden alip
    // istenen farkli class'lar return ediyor
    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }
    //return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
    //burada bir satırlık islem yapıyor o bir satırlık islemde
    // bizim gönderdiğimiz parametreyi instence variable a atıyor.
    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }
    // boolean variable'lar icin olusturulan getter method'larinin ismi
    // isVariableIsmi seklinde olur
    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }
    public int getYil() {
        return yil;
    }
    public void setYil(int yil) {
        this.yil = yil;
    }
    private int yil;
}
     */
}
