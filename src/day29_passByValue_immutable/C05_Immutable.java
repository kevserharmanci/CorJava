package day29_passByValue_immutable;
public class C05_Immutable {
    public static void main(String[] args) {
        String isim= "Mine";
        isim=isim.toUpperCase();
        System.out.println(isim); // MINE
        isim="Mevlut";

        System.out.println(isim); // Mevlut
        for (int i = 0; i <100 ; i++) {
            isim += ".";
        }
        System.out.println(isim);
    }
}
//BURDA DEGISIKLIKLER kalıcı olsun dıye yenı bır atama yaptık.her atama ,HEAP memory de yenı obje olusturur.
// bu olusturulan objeler Stack memory de aynı referansa sahıp olur.
