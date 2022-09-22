package day14_methodCreation;

public class practice2 {
    public static void main(String[] args) {
        // Verilen uc basamakli bir sayinin
        // rakamlari toplamini donduren bir method olusturalim
        int input=521;
        int toplam=rakamlariTopla(input);
    }
    public static int rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        return rakamlarToplami;
    }





}
