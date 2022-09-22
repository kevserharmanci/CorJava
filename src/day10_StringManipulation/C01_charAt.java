package day10_StringManipulation;

public class C01_charAt {
    public static void main(String[] args) {
        String str="Java ögrenmek ne güzel";
        System.out.println(str.charAt(0));// ilk harfi yazdırır

        System.out.println(str.toUpperCase().charAt(7));//R
        System.out.println( str.charAt(21));// l
        //System.out.println(str.charAt(22));
        //son harfi bulmak için str nin 1 eksigini index olarak gireriz
        //eger index olarak uzunlugu veya daha bir sayıyı girersek Java exception verir




        /*
        charAt kullandıgınızda sonuc char olacagı için artık manipulation yapamayın
        String methodlarından kullanmamız gereken bir method varsa
        charAT den önce kullanmalıyız
         */

    }
}
