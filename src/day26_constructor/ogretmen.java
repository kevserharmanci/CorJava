package day26_constructor;

public class ogretmen {
    String isim="isim belirtilmedi";
    String soyisim="soyisim belirtilmedi";
    String dogumtarihi="tarih girilmedi";
    String brans="Brans belirtilmedi";
    String yanbrans="yanbrans belirtilmedi";

    public ogretmen() {
    }

    public ogretmen(String isim, String soyisim, String dogumtarihi, String brans, String yanbrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumtarihi = dogumtarihi;
        this.brans = brans;
        this.yanbrans = yanbrans;
    }

    public ogretmen(String isim, String soyisim, String dogumtarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumtarihi = dogumtarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim: " + isim + '\'' +
                "\nsoyisim: " + soyisim + '\'' +
                "\ndogumtarihi: " + dogumtarihi + '\'' +
                "\nbrans: " + brans + '\''+
                "\nyanbrans: " + yanbrans + '\'' ;
    }
}
