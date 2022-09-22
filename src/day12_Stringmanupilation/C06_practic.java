package day12_Stringmanupilation;

public class C06_practic {
    public static void main(String[] args) {
        // String methodlarini kullanarak " Java ogrenmek123 Cok guzel@ " Stringini
        // "Java ogrenmek cok guzel" şekline getirin


        /*str=str.trim().replace("@","");

        str=str.toLowerCase().replaceAll("\\d","");

        str=str.replaceFirst("j","J");
        System.out.println(str);*/

        String str=" Java ogrenmek123 Cok guzel@ ";
        str=str.trim().replace("C", "c")
                .replace("@","")
                .replaceAll("\\d","");
        System.out.println(str);

        //çözüm 2
        // str=str.trim().replace("@","");
        //str=str.toLowerCase().replaceAll("\\d","");
        //str=str.replaceFirst("j","J");

        //System.out.println(str);

        /*
        String input=" Java ogrenmek123 Cok guzel@ ";
        input=input.replaceAll("\\s","asdasd");
        input=input.replaceAll("\\W","");
        input=input.replaceAll("\\d","");
        input=input.replaceAll("asdasd"," ");
        input=input.replace("C","c");
        input=input.trim();
        System.out.println(input+".");
         */
    }
}
