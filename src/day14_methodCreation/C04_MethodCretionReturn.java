package day14_methodCreation;

public class C04_MethodCretionReturn {
    public static void main(String[] args) {
        /*
        verilen isim ve soy ismi ilk harfi buyuk gerıye kalanları yıldız olacak sekılde
        degıstırıp bize bu halını donduren bır methot olusturun
        NOT:programın ılerleyen kısımlarında ısım vesoy ısmı bu sekılde kullanmak  ıstıyoruz
         */
            String isim="Enes";
            String soyisim="Bozkurt";
            String gizliIsim=isimGizle(isim,soyisim);
            System.out.println(isim + " "+ soyisim); // Enes Bozkurt
            System.out.println(gizliIsim); // E*** B******




            }
            public static String isimGizle(String isim, String soyisim) {
                isim= isim.substring(0,1).toUpperCase()
                        +isim.substring(1).replaceAll("\\w","*");
                soyisim=soyisim.substring(0,1).toUpperCase()
                        +soyisim.substring(1).replaceAll("\\w","*");
                return isim+" "+soyisim;
            }


    }

