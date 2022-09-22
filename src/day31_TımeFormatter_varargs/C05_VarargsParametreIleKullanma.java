package day31_TımeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {
        enuzunKelimeyiYazdır(5,"Ali","Ayse","Şükrü","Kevser","Bünyamin","Süleyman","Akin");//arguments
    }
/*
Varargs teorik olarak sonsuz sayıda element alabılır
bır method da parametre olarak varargs varsa
varargs ın sınırlarını bılebılmesı ıcın parametrelerın sonuncusu olmalıdır!
öncesinde farklı parametreler olabılır ama varargs dan sonra parametre olamaz


bu kural geregı yalnız bır varargs kullanılabılır...


 */
    public static void enuzunKelimeyiYazdır(int kelimeSayisi,String...  kelime) {//parametre
/*
bir varargs ın hacmı nedir?
sınırı yoktur bu yuzden varargs ın basladıgı andan ıtıbaren varargs ın olması gerekır!!!

 */
        String enUzunKelime="";

        for (String each :kelime
        ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;

            }else if (each.length()==enUzunKelime.length()) {
                enUzunKelime+=" "+each;

            }
            }



        System.out.println("girilen kelimelerden en uzun kelime :" + enUzunKelime );
        /*
        public static void main(String[] args) {
        enUzunKelimeyiYazdir(5,"Ali","Ayse","Ismail","Ahmet","Babayigit","Akin");
    /*
     Varargs teorik olarak sonsuz sayida element alabilir
     bir method'da parametre olarak varargs varsa
     varargs'in sinirlarini bilebilmesi icin
     parametrelerin sonuncusu olmalidir.
     oncesinde farkli parametreler olabilir ama
     varargs'dan sonra parametre OLAMAZ
     Bu kuraldan oturu bir method'da sadece 1 tane varargs olabilir
     */
    }
    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {
        String enUzunKelime=kelime[0];
        for (String each:kelime
        ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu : " + enUzunKelime);
    }
}






