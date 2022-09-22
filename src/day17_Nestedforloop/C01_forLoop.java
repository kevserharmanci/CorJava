package day17_Nestedforloop;

public class C01_forLoop {
    public static void main(String[] args) {
        // verilen stringtekı kullanılan harflerı tekrarsız olarak yazdırıp
        // kelımede kullnılan farklı harf sayısınıveren bır method  yapınız
        String input = "taka tuka";
        tekrarsizYap(input);
    }
    public static void tekrarsizYap(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W",""); // EmsalEfe harf rakam dısındakı herseyı sıldık
        System.out.print(islenecekKelime.substring(0,1)); // E
        benzersizInput+=islenecekKelime.substring(0,1);  // E hiçligi icine deger koyabılmek ıcın basta atıyoruz
        for (int i = 1; i <islenecekKelime.length() ; i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+ islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : " + benzersizInput);

    }


}
