package day07_ifStatements;

public class C03_İfStatements {
    public static void main(String[] args) {
        /*
        bir if cumlesınde suslu parantez kullanılmazsa
        java ilk satırı sart ile baglar ,sonrakı satırlar bagımsız olur

        eger birden fazla satır aynı ıf sartına baglanmıssa mutlaka suslu parantez kullanmalıyız
        suslu parantez tercıh etmek her zaman faydalıdır

         */
        int sayi1=-23;

        if (sayi1>0)
            System.out.println("sayi pozitif");



            System.out.println("pozitif kalacaktır"); // bagımsız her zaman calısıcak
            System.out.println("ucuncu satır");//bagımsız her zaman calısıcak


        if (sayi1 %2==0)
            System.out.println("sayi çift");
            System.out.println("çift kalacaktır");// bagımsız her zaman calsır

        if (sayi1%5 == 0)
            System.out.println("sayi 5 in tam katı");
        // suslu parantez kullanmazsak durum boyle olur




    }
}
