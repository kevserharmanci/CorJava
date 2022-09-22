package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kayra");
        sb.substring(0,3);// substring bıze StringBuilder dondurmez strıng dondurur.
        /*
        substr strıng dondurdugu ıcın StringBuilder ın eskı halını degıstıremez

         */
        System.out.println(sb);//Kayra
        sb.subSequence(0,3);//
        System.out.println(sb);//Kayra
/*
package day32_stringBuilder;
public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Kayra");
        sb.substring(0,3);
        // Bu method String dondurdugu icin StringBuilder'in eski halini degistiremez
        System.out.println(sb); // Kayra
        sb.subSequence(0,3);
        System.out.println(sb); // Kayra
    }
}

 */
    }
}
