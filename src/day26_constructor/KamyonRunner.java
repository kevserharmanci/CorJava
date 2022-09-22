package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 özellikleri"+ kamyon1.toString());

        Kamyon kamyon2=new Kamyon("Mercedes","4140",2005,500000);
        System.out.println("kamyon2 bilgileri" + kamyon2);

        Kamyon kamyon3=new Kamyon("MAN","as908",2007,400000);
        System.out.println("kamyon3 bilgileri" + kamyon3);

        Kamyon kamyon4=new Kamyon("Scania","s548");
        System.out.println("kamyon4 bilgileri " + kamyon4);


    }
}
