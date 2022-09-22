package day32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Calm down");
        sb.replace(5,9,"Up");// 5 den basla 10 da bıtır 10 dahıl olmayacak sonra
        System.out.println(sb);
        sb.replace(4,5,"---"); // Calm---Up
        System.out.println(sb);
        sb.replace(4,7," ");
        System.out.println(sb); // Calm Up
        sb.replace(5,7,"down");
        System.out.println(sb); // Calm down

    }
}
