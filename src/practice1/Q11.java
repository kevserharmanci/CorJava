package practice1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

            Scanner scan=new Scanner(System.in);
            System.out.println("Lütfen bir not giriniz");
            double note= scan.nextDouble();
            if (note<0 || note>100){
                System.out.println("Lütfen gecerli bir not giriniz");
            } else if (note<=59) {
                System.out.println("Notunuz : F");
            } else if (note<=69) {
                System.out.println("Notunuz : D");
            } else if (note<=79) {
                System.out.println("Notunuz : C");
            } else if (note<=89) {
                System.out.println("Notunuz : B");
            }else {
                System.out.println("Notunuz : A");
            }
        }




    }














