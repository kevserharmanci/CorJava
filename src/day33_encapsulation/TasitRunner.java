package day33_encapsulation;

public class TasitRunner {
    public static void main(String[] args) {
        Tasit tst1=new Tasit();
        tst1.setTasitTuru("tir");
        // tir bilgisini yazınca tasıt turu tir oluyor

        System.out.println(tst1.getTasitTuru());
        // method call yapınca tasıt class ına gıdıyor
        // tasıt turu prıvate oldugu ıcın get methodu tasıtturune ulasıyor aracı oluyor ve publıc aracı kendı class ından bılgıyı bıze getırdı

/*
public class TasitRunner {
    public static void main(String[] args) {
        Tasit tst1=new Tasit();
        tst1.setTasitTuru("Tir");
        System.out.println(tst1.getTasitTuru());
    }
}
 */

    }
}
