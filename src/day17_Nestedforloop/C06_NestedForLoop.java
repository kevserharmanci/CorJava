package day17_Nestedforloop;

public class C06_NestedForLoop {
    public static void main(String[] args) {




        //verilen stringi asagıdakı gıbı yazdıran bır program yazın
          /*input=Deniz
          D
          De
          Den
          Deni
          Deniz
           */
        String input="Deniz";
        for (int i = 1; i <=input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j-1,j));// ilk harf için substring(0,1) olmalı
            }
            System.out.println("");
        }


    }
}
