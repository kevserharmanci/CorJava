package practice1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Q12_İfStatement03 {
    public static void main(String[] args) {
       /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
                */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen iş ünvanınızı giriniz: ");
        String jobTitle = scan.nextLine().toLowerCase();
        String qa = "Qality Analyst";
        String dev = "Developer";
        String ba = "Business Analyst";
        String pm = "Project Manager";
        if (jobTitle.equals("qa")) {
            System.out.print("İş ünvanınınz: " + qa);
        }else if (jobTitle.equals("dev")) {
            System.out.print("İş ünvanınınz: " + dev);
        }else if (jobTitle.equals("ba")) {
            System.out.print("İş ünvanınınz: " + ba);
        }else if (jobTitle.equals("pm")) {
            System.out.print("İş ünvanınınz: " + pm);
        }else {
            System.out.println("yeniden giriniz");
        }



    }


    }

