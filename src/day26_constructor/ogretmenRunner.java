package day26_constructor;

public class ogretmenRunner {
    public static void main(String[] args) {
        ogretmen ogretmen1=new ogretmen();
        System.out.println("ogretmen1: " + ogretmen1);

        ogretmen ogretmen2=new ogretmen("emre", "akdogan", "1.1.2001","matematik", "cografya");
        System.out.println("ogretmen2: " + ogretmen2);

        ogretmen ogretmen3=new ogretmen("kevser", "harmancı","23.11.1989");

        System.out.println("ogretmen3: " + ogretmen3);



    }
}
