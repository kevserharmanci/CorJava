package day37_overridding;

public class DAraba {

    private void yakit(){
        System.out.println("tüm arabalar yakit kullanir");
    }// bu method u sılersek supra da CTE hatası verır
    void marka(){
        System.out.println("tüm arabaların markasi vardir");
    }
    void motor(){
        System.out.println("tüm arabaların motoru vardır");
    }
}
/*
package day37_overridding;
public class DAraba {
    private void yakit(){
        System.out.println("Tum arabalar yakit kullanir");
        /*
         Parent class'dan override edilmesini istemediginiz method'lari
         private, static veya final yapabilirsiniz

    }
            void marka(){
            System.out.println("Tum arabalarin markasi vardir");
            }
            void motor(){
            System.out.println("Tum arabalarim motoru vardir");
            }
            }

 */