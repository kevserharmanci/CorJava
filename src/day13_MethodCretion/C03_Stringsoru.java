package day13_MethodCretion;

public class C03_Stringsoru {
    public static void main(String[] args) {


    /*
String methodlarını kullanarak " Java ogrenmek123 Cok guzel@ "
Stringini " Java ogrenmek cok guzel." şekline getirin
 */


    String str=" Java ogrenmek123 Cok guzel@ ";
    str=str.trim();// Java ogrenmek123 Cok guzel@
        str=str.replaceAll("d", "");// Java ogrenmek Cok guzel@
        str=str.replaceAll("@","");// Java ogrenmek Cok guzel
        str=str.replaceAll("C","c");// Java ogrenmek cok guzel
        str=str+".";

        System.out.println(str);// Java ogrenmek cok guzel.

}
}
