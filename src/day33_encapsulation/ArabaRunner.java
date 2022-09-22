package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1 = new Araba();
        // arb1 objesı uzerınden marka varıable ye
        //ulasabıldık
        //degıstırebıldık(set)
        //yazdırabılme(get) yaptım


        arb1.marka = "Toyota";
        System.out.println(arb1.marka);

        // acces modifier kullanarak marka varıable ye ulasımı tamemen serbest yapabılır
        // veye tamamen engelleyebılırım
        //privite yaptıgımız modele ıse hıc ulasamayız
        //yani acces modifier ya hep ya hıc dıyor


        // model ı degıstırelım ama goremeyelım
        //yakıtı da gorelım ama degıstıremeyelım

        //set ve get yetkılerını ozel olarak tanımlamak ıstersenız
        // 1.adım - ozel yetkı tanımlayacagınız varıable ları private yapın
        //        private bır data yı baska class lardan ulasmak mumkun olmadıgından

        //2. adım - set  yetkısı ıcın setter,get yetkısı ıcın getter methodlarını olusturalım (genneral den )

        arb1.setModel("bmw");// modele ne atayacaksak onu gırmelıyız yoksa hata verır
        // modelı yazdırma ımkanımız yok yalnız yenı bır deger atayabılırız .yazdıramayız
        arb1.getYakit();// parametre ıstemez strıng dondurur ve atanan degerı degıstıremeyız
        // yakıtı degıstıremeyız cunku setter methodu yok.
        System.out.println(arb1.getYakit());// elektrıklı bılgısını yazdırabıldık
/*
public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        // arb1 objesi uzerinden marka variable'ina
        // ulasabildim, degistirebildim(set) ve yazdirabildim(get)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);
        // access modifier kullanarak marka variable'ina ulasimi
        // tamamen serbest yapabilir veya tamamen engelleyebilirim
        // private yaptigimiz model'e ise hic ulasamayiz
        // yani access modifier ya hep ya hic diyor
        // model' i degistirelim ama goremeyelim
        // yakiti'da gorelim ama degistiremeyelim
        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1.adim - ozel yetki tanimlayacaginiz variable'lari private yapin
        //          private bir dataya baska class'lardan ulasmak mumkun olmadigindan
        // 2.adim - set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim
        arb1.setModel("Corolla"); // model olarak Supra'yi atadik
        // model'i yazdirma imkanimiz yok, cunku getter method'u yok
        System.out.println(arb1.getYakit()); // Elektrikli bilgisini yazdirabildik
        // yakiti degistiremeyiz cunku setter method'u yok
 */
    }
}
