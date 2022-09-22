package day21_Arrays;

public class C02_Enuzunkelıme {
    public static void main(String[] args) {
        // Soru 2- Verilen String bir array’de
        // en uzun ve en kisa String’leri yazdiran bir method olusturun
        String[] isimler ={"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican1"};// Arrays olusturduk
        enUzunVeKisayiYazdir(isimler);// method adımızı yazdık argumentımız isimler oldugu için isimleri buraya yazdık
    }
    public static void enUzunVeKisayiYazdir(String[] isimler) {
        String enUzunKelime= isimler[0];// bi deger atamamız gerektıgı ıcın 0. indexi atıyoruz
        String enKisaKelime= isimler[0];
        //ilk ismi 0.index i ele alacak ondan kıyaslamaya baslayıp en uzun ve en kısa kelımeyı bulacagız
       // for loop olusturacagız 1. den baslayacagız cunku 0 ı yıne atadık.
        // else kullanamayız cunku ıkısı de bırbırınden bagımsız
        // o yuzden ayrı ayrı ıf atıyoruz
       // if lerde esıtlık koyarsak son yazılan en uzun kelımeyı alır
        for (int i = 1; i < isimler.length ; i++) {
            if (isimler[i].length()>=enUzunKelime.length()){
                enUzunKelime=isimler[i];
            }
            if (isimler[i].length()< enKisaKelime.length()){
                enKisaKelime=isimler[i];
            }
        }
        System.out.println("Arraydeki en uzun kelime : " + enUzunKelime);
        System.out.println("Arraydeki en kisa kelime : " + enKisaKelime);
        /*
         for (int i = 1; i <isimler.length ; i++) { // 1inci indexten baslarız cunku 0 ı yukarıda aldık
                                                    //length de parantez yok cunku Array length, stringte length yanina parantez koy
                                                //burada iki tane bağımsız if yaparız biri uzun biri kisa icin
            if (isimler[i].length() > enUzunKelime.length()) {//burada stringin uzunlugunu aldığımız icin length in yanında parantez kullaniyoruz.
                enUzunKelime=isimler[i];
            }

            //iki ayrı if cunku iki sartımız var en kısa ve en uzun
            if (isimler[i].length()< enKisaKelime.length()) {
                enKisaKelime=isimler[i];

         */
    }
}
