package day14_methodCreation;

import day13_MethodCretion.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilen 4 harfli bir stringi tersten yazdıran bir method olusturalım
        terstenYazdır("okan");
        C04_MethodCreation.topla(6,5);// bi onceki clas ı da calıstırdık
    }

    public static void terstenYazdır(String input){
        String tersInput=input.substring(3)+
                         input.substring(2,3)+
                          input.substring(1,2)+
                          input.substring(0,1);
        System.out.println("verilen kelimenin tersten yazilisi : "+tersInput);

    }

    public static void terstenYazdir(String nuri) {
    }
}
