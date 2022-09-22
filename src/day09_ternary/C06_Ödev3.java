
package day09_ternary;
public class C06_Ödev3 {
    public static void main(String[] args) {
        String harf="p";
        harf=harf.toUpperCase();
        switch (harf) {
            case "S" :
                System.out.println("SoftWare");
                break;
            case "D" :
                System.out.println("Devoloper");
                break;
            case "E" :
                System.out.println("Engineer");
                break;
            case "T" :
                System.out.println("İn Testing");
                break;
            default:
                System.out.println("Lütfen gerli bir harf giriniz");
        }
    }
}
