package day08_ifStatements;

public class C09_ArtıkSwitch {
    public static void main(String[] args) {
        int yil = 2096;
        int ay = 2;
        if (yil % 4 == 0) {
            switch (ay ) {
                case 1:
                    System.out.println("ocak " + yil+"31 Gundur");
                    break;
                case 2:
                    System.out.println("subat " + yil + "29 Gundur");
                    break;
                case 3:
                    System.out.println("mart " + yil + "31 Gundur");
                    break;
                case 4:
                    System.out.println("nisan " + yil + "30 Gundur");
                    break;
                case 5:
                    System.out.println("mayis " + yil + "31 Gundur");
                    break;
                case 6:
                    System.out.println("haziran " + yil + "30 Gundur");
                    break;
                case 7:
                    System.out.println("temmuz " + yil + "31 Gundur");
                    break;
                case 8:
                    System.out.println("agustos " + yil + "31 Gundur");
                    break;
                case 9:
                    System.out.println("eylul " + yil + "30 Gundur");
                    break;
                case 10:
                    System.out.println("ekim " + yil + "31 Gundur");
                    break;
                case 11:
                    System.out.println("kasim " + yil + "30 Gundur");
                    break;
                case 12:
                    System.out.println("subat " + yil + "31 Gundur");
                    break;
            }
        } else {
            switch (ay) {
                case 1:
                    System.out.println("ocak " + yil + "31 Gundur");
                    break;
                case 2:
                    System.out.println("subat " + yil + "28 Gundur");
                    break;
                case 3:
                    System.out.println("mart " + yil + "31 Gundur");
                    break;
                case 4:
                    System.out.println("nisan " + yil + "30 Gundur");
                    break;
                case 5:
                    System.out.println("mayis " + yil + "31 Gundur");
                    break;
                case 6:
                    System.out.println("haziran " + yil + "30 Gundur");
                    break;
                case 7:
                    System.out.println("temmuz " + yil + "31 Gundur");
                    break;
                case 8:
                    System.out.println("agustos " + yil + "31 Gundur");
                    break;
                case 9:
                    System.out.println("eylul " + yil + "30 Gundur");
                    break;
                case 10:
                    System.out.println("ekim " + yil + "31 Gundur");
                    break;
                case 11:
                    System.out.println("kasim " + yil + "30 Gundur");
                    break;
                case 12:
                    System.out.println("subat " + yil + "31 Gundur");
                    break;

            }
}
    }
}