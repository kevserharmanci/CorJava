package day14_methodCreation;

import day13_MethodCretion.C04_MethodCreation;

public class C02_MethodCreation {

    public static void main(String[] args) {
        // verilen 3 basamaklı bir  sayının rakamları  toplamını yazdıran bir method olusturalım
        int input = 423;
        rakamlariTopla(input);
        C04_MethodCreation.topla(6,3);
        C01_MethodCreation.terstenYazdir("Nuri");

    }
    public static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;// girilen sayı yerine yazdık

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;//42
        birlerBasamagi=input%10;//2
        rakamlarToplami+=birlerBasamagi;//3+2=5
        input/=10;//42/10 4
        birlerBasamagi=input%10;// 2
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        System.out.println("Girdiginiz " + temp+ " sayisinin rakamlar toplami : "+ rakamlarToplami);
    }


    }


