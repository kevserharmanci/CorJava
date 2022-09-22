package day14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // input olarak verılen ısım ve soyısmı ılk harfı buyuk gerıye kalan harfler yıldız olacak sekılde
        //I**** K***** seklınde yazdıran bır method olusturun


        String isim="Enes";
        String soyisim="Bozkurt";



        ismiGizle (isim,soyisim);
        C02_MethodCreation.rakamlariTopla(654);





    }

    public static void ismiGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w","*");
                soyisim=soyisim.substring(0,1).toUpperCase()
                        +soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+ soyisim);
    }
}
