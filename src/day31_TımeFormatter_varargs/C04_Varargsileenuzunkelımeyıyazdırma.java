package day31_TımeFormatter_varargs;

public class C04_Varargsileenuzunkelımeyıyazdırma {
    public static void main(String[] args) {
        enuzunKelimeyiYazdır("Ali","Ayse","Şükrü","Kevser","Bünyamin","Süleyman");
    }

    public static void enuzunKelimeyiYazdır(String...  kelime) {

        String enUzunKelime="";// hiçligi yazarak da calıstırabılırız.ama daha cok ıslem yaptırmıs oluruz.

        for (String each :kelime
                ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;

            } else if (each.length()==enUzunKelime.length()) {
                enUzunKelime+=" "+each;

            }


        }

        System.out.println("girilen kelimelerden en uzun kelime :" + enUzunKelime);




    }
}

//hocanın cozumu
/*
 public static void main(String[] args) {
        enUzunKelimeyiYazdir("Ali","Ayse","Ismail","Ahmet","Babayigit");
    }
    public static void enUzunKelimeyiYazdir(String... kelime) {
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
 */
