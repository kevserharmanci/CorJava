package day12_Stringmanupilation;

public class C05_Sunstring {
    public static void main(String[] args) {
        // KULLANICIDAN 4 HARFLI BIR KELIME ISTEYIN VE girilen kelimeyi tersten yazdırın
        String input= "Kaya";
        String tersInput= input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersInput);

    }
}
