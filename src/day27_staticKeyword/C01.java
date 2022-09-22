package day27_staticKeyword;
public class C01 {
    static int sayi= 10;
    int rakam=5;
    public static void main(String[] args) {
        /*
        class level'da iki tur variable olusturabiliriz
          static (class) variable
          instance (obje) variable
        static variable'lar tum class'tan kullanilabilirken
        instance olanlar sadece static olmayan method'larda direk  kullanilabilir
        instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.
        instance variable'lar obje variable'i oldgu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.
        static variable'lar class variable'i oldugu icin
        herhangi bir satirda static variable'in degerini bulmak icin
       CLASSIN BASINDAN itibaren kod incelenmelidir.
         */
        C01 obj1= new C01();
        System.out.println("obj1'in rakam degeri : " + obj1.rakam); //5
        System.out.println("obj1'in sayi degeri : " + obj1.sayi); // 10
        obj1.rakam+=1; // 5+1=6
        obj1.sayi+=1; // 10+1=11
        System.out.println("1 artirdiktan sonra obj1'in rakam degeri : " + obj1.rakam); // 6
        System.out.println("1 artirdiktan sonra obj1'in sayi degeri : " + obj1.sayi); // 11
        C01 obj2=new C01();
        System.out.println("obj2'in rakam degeri : " + obj2.rakam); // 5
        System.out.println("obj2'in sayi degeri : " + obj2.sayi); // 11
        obj2.rakam++; //5 + 1 =6
        obj2.sayi++;  // 11+ 1 =12
        System.out.println("1 artirdiktan sonra obj2'in rakam degeri : " + obj2.rakam); // 6
        System.out.println("1 artirdiktan sonra obj2'in sayi degeri : " + obj2.sayi); // 12
    }
}

/*
public class C01 {
    static int sayi=10;
    int rakam=5;
    public static void main(String[] args) {
        /*
        class level'da iki tur variable olusturabiliriz
        sattic variablelerin diger adi  class variable idi
        instance cariablelerin diger adi obje variable idi
        Static variableler tüm class dan kullanilabilirken
        instance olanlar sadece  static olmayan  methodlardan kullanılabılır
        instance variablelere static method'dan ulasabılmek icin
        obje olusturmak gerekir
        instance variableler obje varıablesı old. icin
        herhangi bir satirda instance variablenın degerının ne oldugunu bulmak icin
        obje olusturulan satırdan ıtıbaren kod ıncelenmelidir
        static variableler class variablesi oldugu icin
        herhangı bır satirda static variablenin degerini bulmak icin
        classın basından ıtıbaren kod ıncelenmelidir
         */
//System.out.println(rakam); buna ulasamayız
        /*System.out.println(sayi);// buna ulasabılırız
                C01 obj1=new C01();
                System.out.println("obj1'in rakam degeri: "+obj1.rakam);//5
                //once obje olusturulduktan sonra atama yapılmısmı bakar
                // yoksa class level dakı atama ya bakar oda yoksa default deger dondurur
                System.out.println("obj1'in sayi degeri: "+obj1.sayi);//10 bu sekıldede yazılır yada obj1 yazmasak da olur statıc oldugu ıcın
                // bunda ıse obje olusturmadıgımız ıcın classın basından bu yana bu sayi ile islem yapılmıs mı ona bakar,
                //yapılmamıs ıse class basındakı atamaya bakar onu dondurur
                //rakam+=1; buna ızın vermez cunku dırek ulasamayız obje uzerınden ulasmalıyız
                obj1.rakam+=1;
                sayi+=1;
                // (obj1.sayi+=1 de dıyebılırız obj1 degerının baglı oldugu class dakı statıc sayı degerını bır artırır)
                System.out.println("1 artirildiktan sonra obj1'in rakam degeri: "+ obj1.rakam);//6 burada obje olustururlduktan sonra 1 artırılmıs
                System.out.println("1 artirildiktan sonra obj1'in sayidegeri: "+ sayi);//class ıcınde sayının degerı bır artırılmıs 10+1=11
                C01 obj2=new C01();
                System.out.println("obj2'in rakam degeri: "+obj2.rakam);
                //rakam instance yanı statıc degıl obje varıablesı o yuzden obj2 olusturulduktan
                // sonra rakama bır deger atanmısmı= hayır
                // sonra class basında ınstance degerıne bakılır ve o alınır=5
                //ınstance variablenın takıbı obje olusumundan bakılmaya baslanır
                System.out.println("obj2'in sayi degeri: "+obj2.sayi);
                //sayi degeri static oldugu class variablesı oldugu ıcın
                // objeden degıl class dan alacagız
                // class basından baslayıp statıc sayıonın son degerını buluyoruz oda 11 olur
                obj2.rakam++;
                obj2.rakam++;
                System.out.println("1 artırdıktan sonra obj2'in rakam degeri: "+obj2.rakam);
                // obje olusumundan takıp edılır ve bır artırma yapılmıs yukarıdakı degerı bır artırır 5+1=6 yazar
                System.out.println("1 artırdıktan sonra obj2'in sayi degeri: "+obj2.sayi);
                //sayi static o yuzden class basından takıp yapılır 58 satıra kadar sayı ıle ıslemler kontrol edılır
                // ve son degerı bulunur
                // cunku sayı class varıabledır ve statıc oldugu ıcın degısım butun class ıcın gecerlı olur //12
                // not:satıc degerler class variablesidir
                // ınstance degerler obje varıablesıdır
 */
