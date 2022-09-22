package day17_Nestedforloop;

import com.sun.tools.javac.Main;

public class C05_NestedForLOOP {
    public static void main(String[] args) {
        // verilen inputA GORE asagıda kı seklı olusturun
        /*
        *
        **
        ***
        ****
        ***
        **
        *

         */
        //artan kısmı nested for loop ıle yapalım
        int input=5;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

            for (int i = input - 1; i >=1 ; i--) {
                for (int j = i; j >=1; j--) {
                    System.out.print("* ");
                }
                System.out.println("");
            }



    }
}
