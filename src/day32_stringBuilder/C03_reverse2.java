package day32_stringBuilder;

public class C03_reverse2 {
    public static void main(String[] args) {
        /*
        verilen bir inputu tersine cevirip bize donduren bir method olusturun
         */
        String input = "Hey gidi for loop gunleri";
        String tersInput = tersineCevir(input);
        System.out.println(tersInput);
        int sayi=123;
        System.out.println("tersSayiDondur(sayi) = " + tersSayiDondur(sayi));
        int islem=tersSayiDondur(sayi)+10;
        System.out.println("islem = " + islem);//int a donderdıgımızın kanıtı
    }
    public static int tersSayiDondur(int sayi) {
        StringBuilder sb1=new StringBuilder(""+sayi);//burada string yapıp icini int olanı strınbuılder a cevirdik
        sb1.reverse();//strıngbuılder ı ters yaptık
        Integer donmusSayi=Integer.parseInt(""+sb1);
        //burada ınteger e cevırmek ıcın ıc kısmın strıng olması lazım burayada  hıclık koyarak sb ı strınge cevırdık ve sonucta ınt yaptık
        return donmusSayi;
    }
    public static String tersineCevir(String input) {
        StringBuilder sb = new StringBuilder(input);//burada verilen string inputu strıngbuilder a cevirdik
        return sb.reverse().toString();//burada stringbuilder ı strınge cevırdık
    }
}
