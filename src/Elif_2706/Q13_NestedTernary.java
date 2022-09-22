package Elif_2706;

public class Q13_NestedTernary {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */
        // basit if leri ternary de yapabılırız

        double fiyat=10;
        if (fiyat<10){
            System.out.println("ucuz");
        }else if (fiyat<20){
            System.out.println("normal");
        }else {
            System.out.println("pahalı");
        }


        String sonuc=fiyat<10?"ucuz"  :  fiyat<20?"normal"  : "pahali";
        System.out.println("sonuc= " + sonuc);
        System.out.println(fiyat<10?"ucuz"  :  fiyat<20?"normal"  : "pahali");

    }
}
