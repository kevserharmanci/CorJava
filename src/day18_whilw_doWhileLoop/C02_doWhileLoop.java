package day18_whilw_doWhileLoop;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir sayı alın ve
        bu sayının rakamları toplamını yazdırın

         */
        int input=5432;
        int rakamlarToplamı=0;
        int birlerBasamagı=0;
        int temp=input;

      while (temp>0){
          birlerBasamagı=temp%10;
          rakamlarToplamı+=birlerBasamagı;
          temp/=10;//birler basamagından kurtulmak ıcın
      }
        System.out.println(input+ "sayisinin rakamlar toplamı:"+ rakamlarToplamı);






    }
}
