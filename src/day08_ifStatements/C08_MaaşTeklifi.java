package day08_ifStatements;

import java.util.Scanner;

public class C08_MaaşTeklifi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen maas teklifi giriniz");
        int maas =scan.nextInt();
        if (maas<60000){
            System.out.println("kabul edemem");
        }

        else if (maas<80000) {
            System.out.println("konusabiliriz");
        } else {
            System.out.println("kabul ediyorum");
        }

    }
}
