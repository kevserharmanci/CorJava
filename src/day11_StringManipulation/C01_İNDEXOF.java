package day11_StringManipulation;

public class C01_İNDEXOF {
    public static void main(String[] args) {
        String str = "Java ögrenmek cok güzel";
        /* verilen bir Stringde herhangi bir String veya char ın
        ilk kullanıldıgı index i verir
         */

        System.out.println('g');//6
        System.out.println("r");//7
        System.out.println(str.indexOf("j"));
        //-1 cunku 0 veya pozıtıf sayı verırse var dıye dusunuruz
        // -1 verınce bu harfın olmadıgını anlarız
        System.out.println(str.indexOf(" mek"));
        //10 m harfının ındex ını alır blok gıbı dusunur ve
        // onu verir

        // eger istedigimiz index'den sonrasini kontrol etmek istersek
        // o zaman ayni method'u iki parametreli olarak kullanabiliriz


        System.out.println(str.indexOf("g", (6+1)));//yazılan index den baslar

        //yukarıdaki str da 2. ve 3. e nin index lerini bulun
        //2. e yı bulabılmek ıcın 1. e nin index ine ihtiyacım var
        //1. e;
        int ilke = str.indexOf("e");
        //2. e
        int ikincie = str.indexOf("e", ilke + 1);

        // eger 2. e varsa 3. e nin olup olmadıgını ve varsa index ini yazdıralım
        if (ikincie == -1) {
            System.out.println("verilen str da 2. e yok");//2. e yi kontrol eder varsa else ye gecer

        } else {
            int ucuncue = str.indexOf("e", ikincie + 1);// 3 e yi aratır
            if (ucuncue == -1) {
                System.out.println("verilen str da 3. e yok");// 3. e varsa else ye gecer   varsa else ye gecer
            } else {
                System.out.println("verilen str daki 3. e nin index i: " + ucuncue);// bu da 3. nin index i ni bulur
            }
        }



    }


}
