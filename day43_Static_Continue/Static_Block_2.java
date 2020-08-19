package day43_Static_Continue;

import day42_Static.Testers;

public class Static_Block_2 {

    static int a;
    static String b ;
    static Testers tester1;
    static Testers tester2;

    //static ExcelSheet excel =;

    static {
        a = 100;
        b = "Cybertek";

        tester1 = new Testers();
        tester1.setInfo("Ahmet", 123,"SDET", 10000);


        tester2 = new Testers();
        tester2.setInfo("Ramazan", 124,"SDET", 10000);
    }

    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);

    }

}
