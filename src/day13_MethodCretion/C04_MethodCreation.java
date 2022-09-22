package day13_MethodCretion;

public class C04_MethodCreation {
    public static void main(String[] args) {
       //input olarak verilen iki intigeri toplayıp sonucunu yazdırn bır method olusturun
        int input1=10;
        int input2=20;
    // method 4 adımda olusturulur
    //1.adım method call
    //2.adım argument eklenmesı gerekiyorsa ekleyelim
        //eger method un return type void den farklı olacaksa
        // bir variable olusturup , method call u assing edelim
        
        topla(input1, input2);
    
    }

    public static void topla(int input1, int input2) {
        //3.adım method deklarasyonunda degısmesı gereken bölümleri degistir
        //acces modifer ya da return type vb....
        // 4. eger return type voıd dısında bırseyse
        // return keywor u ve donecek degerı hesaplamalıyız
        System.out.println("Girilen iki sayının toplamı:"+(input1+input2));
    }

}
