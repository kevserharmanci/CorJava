package day12_Stringmanupilation;

public class C07_pratic {
    public static void main(String[] args) {
        //Str seklinde verilen asagidaki fiyatlarin toplamini bulunuz
        //String str1="$13.99"
        //String str2="$10.55"
        //ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
        String str1 ="$13.99";
        String str2 ="$10.55";
        str1=str1.replace("$","");
        str2=str2.replace("$","");
        double a = Double.parseDouble(str1);
        double b = Double.parseDouble(str2);
        System.out.println("$"+(a+b));

    }
}
