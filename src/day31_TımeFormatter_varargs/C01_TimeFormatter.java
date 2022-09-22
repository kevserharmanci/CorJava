package day31_TımeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihsaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih :" + tarihsaat);
        //ilk olusturulan tarih:2022-07-25T
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy  hh:mm a");// ay yazarken M kullanmalıyız buyuk harfle..
        /*
        ("dd/M/yy  hh:mm") bu yazım seklı herseyı belırlıyor
         */
        System.out.println(dtf.format(tarihsaat));//25/7/22  09:55 ÖS

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihsaat));//25/Tem/2022 21:55



    }
}
