package day05_matamatikselişlemler;

import java.util.Scanner;

public class C03_Rakamlar_toplamı {
    public static void main(String[] args) {
        //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı pozitif bir tam sayı giriniz");
        int sayi=scan.nextInt(); // 5267
        int birlerBasamagı=0;
        int rakamlarToplamı=0;
        int ilkGirilensayi=sayi;
        //suanda sayimiz 5267 bb=0 rt=0

        birlerBasamagı=sayi%10; // 7
        rakamlarToplamı+=birlerBasamagı; // rt kontrynırım var buna ılk deger olarak 0 atamıstım
        // bulunun bb olan 7 yı rt ekleyıp atamayı da yapmıs olacak
        sayi/=10;


        //suanda sayımız kac ? cevap 10 a boldugumuz ıcın 526 bb ıse 7
        // sayı 0 olana kadar devam edıcez
        birlerBasamagı=sayi%10;// 6
        rakamlarToplamı +=birlerBasamagı ;// 7+6=13
        sayi/=10;
        // suanda sayı 52 bb 6 rt 13 oldu
        birlerBasamagı=sayi%10;// 2
        rakamlarToplamı +=birlerBasamagı ; //13+2=15
        sayi/=10; // sayımız 5
        // suanda sayı 5 bb 2 rt 15

        birlerBasamagı=sayi%10 ;//5
        rakamlarToplamı +=birlerBasamagı ;// 15+5=20
        sayi /=10;//0
        // suanda sayı 0
        System.out.println(ilkGirilensayi+"sayının rakamlar toplamı:"+rakamlarToplamı);
      /*eger kullanıcının gırdıgı sayıyı kullanacaksanız
      bu tur ıslemlerde sayıyı degıstırmemenız gerekır

       */






    }
}
