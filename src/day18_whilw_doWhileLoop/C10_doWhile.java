package day18_whilw_doWhileLoop;

public class C10_doWhile {
    public static void main(String[] args) {
        // m harfindan c harfine kadar tum harfleri yazdirin
        char input='m';
        char output='c';
        char temp=input;
      String buyuk="";



        do {
            buyuk=(input+"").toUpperCase();
            System.out.print(buyuk+ " ");
            input--;


        }while(input>=output);







    }
}
