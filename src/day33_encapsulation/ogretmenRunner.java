package day33_encapsulation;

public class ogretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1=new Ogretmen();
        ogr1.setIsim("Kevser");
        System.out.println(ogr1.getIsim());
        /*
        bu yontemde data hiding(data sınırlandırma), degıl
        daha anlasılır bır kod amaclanmıs olur
         */

        /*
        public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1=new Ogretmen();
        ogr1.setIsim("Tulay");
        System.out.println(ogr1.getIsim());
        /*
        Bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmis olur
         */



    }

    }

