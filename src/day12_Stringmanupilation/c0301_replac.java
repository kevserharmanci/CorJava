package day12_Stringmanupilation;

public class c0301_replac {
    public static void main(String[] args) {
        String isim="John";
        String soyisim="White";
        String kartNo="1234 2345 3456 1478";
        String isimİlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKal=isim.substring(1).replaceAll("\\w","*");
        String soyisimİlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKal=soyisim.substring(1).replaceAll("\\w","*");
        String kkson4=kartNo.substring(15);
        String kkson4GeriyeKal= "**** **** **** ";   //kartNo.substring(4).replaceAll("\\w","*");
        System.out.println(isimİlkHarf+isimGeriyeKal+" "+soyisimİlkHarf+soyisimGeriyeKal+"\n" +"CCN  : " +
                kkson4GeriyeKal+kkson4);



    }
}
