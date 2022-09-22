package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java daha ne yapsin");
        sb.append(5);// buraya ne eklersek hepsını eklemıs olur.
        System.out.println(sb);
        //append istedigimiz String i en sona ekler
        sb.insert(4," her seyi dusunmus,");//Java her seyi dusunmus,daha ne yapsin?

        //araya ekleme yapmak istediğimizde append degıl insert kullanmalıyız
/*
package day32_stringBuilder;
public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Java daha ne yapsin");
        sb.append("?");
        System.out.println(sb); // Java daha ne yapsin?
        // append istedigimiz String'i en sona ekler
        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb); // Java her seyi dusunmus, daha ne yapsin?
        // araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz
    }
}

 */
        // son eklenen
        sb.append("?");
        System.out.println(sb); // Java daha ne yapsin?
        // append istedigimiz String'i en sona ekler
        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb); // Java her seyi dusunmus, daha ne yapsin?
        // araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz
        sb.insert(22,"valla valla",5,11);//11 lenght tır.
        System.out.println(sb);


    }
}
