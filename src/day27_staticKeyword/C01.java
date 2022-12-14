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
        Static variableler t??m class dan kullanilabilirken
        instance olanlar sadece  static olmayan  methodlardan kullan??lab??l??r
        instance variablelere static method'dan ulasab??lmek icin
        obje olusturmak gerekir
        instance variableler obje var??ables?? old. icin
        herhangi bir satirda instance variablen??n deger??n??n ne oldugunu bulmak icin
        obje olusturulan sat??rdan ??t??baren kod ??ncelenmelidir
        static variableler class variablesi oldugu icin
        herhang?? b??r satirda static variablenin degerini bulmak icin
        class??n bas??ndan ??t??baren kod ??ncelenmelidir
         */
//System.out.println(rakam); buna ulasamay??z
        /*System.out.println(sayi);// buna ulasab??l??r??z
                C01 obj1=new C01();
                System.out.println("obj1'in rakam degeri: "+obj1.rakam);//5
                //once obje olusturulduktan sonra atama yap??lm??sm?? bakar
                // yoksa class level dak?? atama ya bakar oda yoksa default deger dondurur
                System.out.println("obj1'in sayi degeri: "+obj1.sayi);//10 bu sek??ldede yaz??l??r yada obj1 yazmasak da olur stat??c oldugu ??c??n
                // bunda ??se obje olusturmad??g??m??z ??c??n class??n bas??ndan bu yana bu sayi ile islem yap??lm??s m?? ona bakar,
                //yap??lmam??s ??se class bas??ndak?? atamaya bakar onu dondurur
                //rakam+=1; buna ??z??n vermez cunku d??rek ulasamay??z obje uzer??nden ulasmal??y??z
                obj1.rakam+=1;
                sayi+=1;
                // (obj1.sayi+=1 de d??yeb??l??r??z obj1 deger??n??n bagl?? oldugu class dak?? stat??c say?? deger??n?? b??r art??r??r)
                System.out.println("1 artirildiktan sonra obj1'in rakam degeri: "+ obj1.rakam);//6 burada obje olustururlduktan sonra 1 art??r??lm??s
                System.out.println("1 artirildiktan sonra obj1'in sayidegeri: "+ sayi);//class ??c??nde say??n??n deger?? b??r art??r??lm??s 10+1=11
                C01 obj2=new C01();
                System.out.println("obj2'in rakam degeri: "+obj2.rakam);
                //rakam instance yan?? stat??c deg??l obje var??ables?? o yuzden obj2 olusturulduktan
                // sonra rakama b??r deger atanm??sm??= hay??r
                // sonra class bas??nda ??nstance deger??ne bak??l??r ve o al??n??r=5
                //??nstance variablen??n tak??b?? obje olusumundan bak??lmaya baslan??r
                System.out.println("obj2'in sayi degeri: "+obj2.sayi);
                //sayi degeri static oldugu class variables?? oldugu ??c??n
                // objeden deg??l class dan alacag??z
                // class bas??ndan baslay??p stat??c say??on??n son deger??n?? buluyoruz oda 11 olur
                obj2.rakam++;
                obj2.rakam++;
                System.out.println("1 art??rd??ktan sonra obj2'in rakam degeri: "+obj2.rakam);
                // obje olusumundan tak??p ed??l??r ve b??r art??rma yap??lm??s yukar??dak?? deger?? b??r art??r??r 5+1=6 yazar
                System.out.println("1 art??rd??ktan sonra obj2'in sayi degeri: "+obj2.sayi);
                //sayi static o yuzden class bas??ndan tak??p yap??l??r 58 sat??ra kadar say?? ??le ??slemler kontrol ed??l??r
                // ve son deger?? bulunur
                // cunku say?? class var??abled??r ve stat??c oldugu ??c??n deg??s??m butun class ??c??n gecerl?? olur //12
                // not:sat??c degerler class variablesidir
                // ??nstance degerler obje var??ables??d??r
 */
