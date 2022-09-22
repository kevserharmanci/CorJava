package day12_Stringmanupilation;

public class C04_Substring {

    public static void main(String[] args) {

        String str="Java cok yasa";

        System.out.println(str.substring(3,4));// yalnız a yı alır 4. index i almaz
        System.out.println(str.substring(5,7));// co alır.
        System.out.println(str.substring(6,6));// "" hiclik cıkar
        System.out.println("====");
        //System.out.println(str.substring(6,2));// calısınca hata verır
    }
}
