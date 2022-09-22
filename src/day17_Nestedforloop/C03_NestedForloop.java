package day17_Nestedforloop;

public class C03_NestedForloop {
    public static void main(String[] args) {
        /*
        verilen yükseklik ve boy degerine gore yıldızlardan olusan bır dıkdortgen olusturalım
        yukseklık :3 boy:4
        ****
        ****
        ****
dikdörtgen için yukardan asagı i
sagdan sola j dır
         */
        int yukseklik=4;
        int boy=8;
        // dıs loop un 4 kere donmesı gerekır
        for (int i = 1; i <=yukseklik ; i++) { //sutunumuz sekız oldugu ıcın 1 8 e kadar carpacak 1*8
            for (int j = 1; j <=boy ; j++){
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
