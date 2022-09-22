package day17_Nestedforloop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // 20 den 50 e kadar sınırlar dahıl tum tek tam sayıları ekrana yazdırın
        int bas=20;
        int bit=50;
        for (int i = bas; i <=bit; i++) {
            if ((i%2)==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        //whilw loop ıle yapımı
        int temp=bas;
        while (temp<=bit){
            if ((temp % 2 == 0)){
                System.out.print(temp + " ");


            }
            temp++;
        }
    }
}
