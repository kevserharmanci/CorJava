package day11_StringManipulation;

public class C02_LastindexOf {
    public static void main(String[] args) {
        String cümle="Java cok kolay, Java cok güzel";
        String kelime="Java";

        /*
         verilen kelime için aşagıdakı sartlardan uygun olanı yazan bir program yazınız
         - verilen kelime cümlede kullanılmamıs
         -verilen kelime cümlede sadece 1 kere kullanılmıs
         - verilen kelime cümlede birden fazla kullanılmıs

         */
        int kelimeIlkİndex=cümle.indexOf(kelime);
        int kelimeSonIndex=cümle.lastIndexOf(kelime);

        if (kelimeIlkİndex==-1) {
            System.out.println("verilen kelime cümlede kullanılmamıs");
        }else if (kelimeIlkİndex==kelimeSonIndex){
            System.out.println("verilen kelime cümlede 1 kere kullanılmıs");
        } else {
            System.out.println("verilen kelime cümlede birden fazla kullanılmıs");
        }



    }
}
